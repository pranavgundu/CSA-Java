import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class JumpThoseHurdles {
  // Find the hurdle with the max height!!
  // This is the Robot we will use to jump the hurdles
  // hurdler.frontIsClear() determines if it can take a step
  Robot hurdler = new Robot(1, 1, Directions.East, 0);

  public static void main(String[] args) {
    new JumpThoseHurdles().start(); // static methods cannot call nonstatic methods
  }

  public void start() {
    loadWorld(); // same as this.loadWorld

    int w = 0; // variable to tell us how many walls we've found
    int h = 0; // variable to tell us the highest hurlde we cleared.

    w = findHurdle(); // used to set w to the number of hurdlers we've found
    h = findHurdle(); // same as this.findHurdle

    clearHurdle(); // same as this.clearHurdle

  }

  /**
   * This method assumes the Robot is named hurdler and is facing East
   * This moves hurdler to the next wall (hurdle). It returns the number
   * of moves it took to get to the hurdle.
   * When the method is called. It will return an int. You can set it to anything
   * you want
   */
  private int findHurdle() {

    return 0;
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

    return 0;
  }

  /**
   * Moves the Robot (hurdler) over the wall and moves it to the ground so
   * that the Robot has its back to the hurdle and is facing the next one.
   */
  private void clearHurdle() {
    // TODO Auto-generated method stub

  }

  private void loadWorld() {
    // line below "hardcodes" this to use one specific world
    // it would be better to ask the user...
    String worldName = "Hurdler/worlda.wld";
    World.readWorld(worldName);
    World.setVisible(true);
    World.setDelay(5);
  }

}