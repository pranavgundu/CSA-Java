import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class JumpThoseHurdlesTest {
  // Find the hurdle with the max height!!
  // This is the Robot we will use to jump the hurdles
  // hurdler.frontIsClear() determines if it can take a step
  Robot hurdler = new Robot(1, 1, Directions.East, 0);

  public static void main(String[] args) {
    new JumpThoseHurdlesTest().start(); // static methods cannot call nonstatic methods
  }

  public static void turnRight(Robot robot) {
    for (int i = 0; i < 3; i++) {
      robot.turnLeft();
    }
  }

  public void start() {
    loadWorld(); // same as this.loadWorld

    // int w = 0; // variable to tell us how many walls we've found
    // int h = 0; // variable to tell us the highest hurlde we cleared.

    // w = findHurdle(); // used to set w to the number of hurdlers we've found
    // h = findHurdle(); // same as this.findHurdle

    int[] values = clearHurdle(); // same as this.clearHurdle
    System.out.println("The tallest hurdle is hurdle " + (values[1] + 1) + " with a height of " + values[0] + ".");
    System.out.println("The shortest distance between two hurdles is " + (values[2] + 0) + " spaces long.");

  }

  /**
   * This method assumes the Robot is named hurdler and is facing East
   * This moves hurdler to the next wall (hurdle). It returns the number
   * of moves it took to get to the hurdle.
   * When the method is called. It will return an int. You can set it to anything
   * you want
   */
  private int findHurdle() {
    int count = 0;
    while (hurdler.frontIsClear()) {
      hurdler.move();
      count++;
    }
  
    return count;
  }

  /**
   * This method assumes the Robot is named hurdler, is facing East and
   * is at the base of the hurdle.
   * This moves the Robot to the top of the hurdle so that it can clear
   * the wall.
   * 
   * @return The number of steps to get above the hurdle (height)
   */
  private int climbHurdle() {
    int count = 0;
    while (true) {
      if (hurdler.frontIsClear()) {
        break;
      }
      hurdler.turnLeft();
      hurdler.move();
      turnRight(hurdler);
      count++;
    }

    return count;
  }

  /**
   * Moves the Robot (hurdler) over the wall and moves it to the ground so
   * that the Robot has its back to the hurdle and is facing the next one.
   */
  private int[] clearHurdle() {
    int tallest = 0;
    int tallestHurdle = 0;
    int shortestDistance = Integer.MAX_VALUE;
    int numberOfHurdles = 5;
    for (int i = 0; i < numberOfHurdles; i++) {
      int distance = findHurdle();
      if (i != 0 && distance < shortestDistance) { 
        shortestDistance = distance; 
      }
      int up = climbHurdle();
      if (up > tallest) {
        tallest = up;
        tallestHurdle = i;
      }
      hurdler.move();
      turnRight(hurdler);
      for (int j = 0; j < up; j++) {
        hurdler.move();
      }
      hurdler.turnLeft();
    }
    return new int[]{tallest, tallestHurdle, shortestDistance};
  }



  private void loadWorld() {
    // line below "hardcodes" this to use one specific world
    // it would be better to ask the user...
    String worldName = "Hurdler/worldc.wld";
    World.readWorld(worldName);
    World.setVisible(true);
    World.setDelay(5);
  }

}