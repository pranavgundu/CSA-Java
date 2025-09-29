import java.util.*;
import kareltherobot.*;

public class MainStarter implements Directions
{
  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want the scale to be?");
		int scale = scanner.nextInt();

		Robot jd = new Robot(1,1,North, 41 * scale);
		World.setVisible(true);
		World.setSize((10 * scale) - (scale-1), 12 * scale - (scale-1));
		World.setDelay(1);	

		// Start of P

		jd.putBeeper();
		moveAndPlace(jd, 8 * scale);
		turnRight(jd);	
		moveAndPlace(jd, 3 * scale);
		move(jd, 1);
		turnRight(jd);
		moveAndPlace(jd, 3 * scale);
		move(jd, 1);
		turnRight(jd);
		moveAndPlace(jd, 3 * scale);
		turnAround(jd);

		// Move to G

		move(jd, 5 * scale);
		jd.turnLeft();

		// Start of G

		jd.putBeeper();
		moveAndPlace(jd, 3 * scale);
		move(jd, 1);
		turnRight(jd);
		moveAndPlace(jd, 4 * scale);
		move(jd, 1);
		turnRight(jd);
		move(jd, 1);
		jd.putBeeper();
		turnAround(jd);
		move(jd, 1);
		jd.turnLeft();
		move(jd, (4 * scale) + 1);
		jd.turnLeft();
		move(jd, (4 * scale)-(scale-1));
		moveAndPlace(jd, 3 * scale + (scale-1));
		move(jd, 1);
		jd.turnLeft();
		moveAndPlace(jd, 4 * scale);
		move(jd, 1);
		jd.turnLeft();
		moveAndPlace(jd, 4 * scale);
		jd.turnLeft();
		moveAndPlace(jd, 3 * scale);
    
	}

	public static void turnRight(Robot robot){
		for (int index=0; index<3; index++){
			robot.turnLeft();
		}
	}

	public static void turnAround(Robot robot){
		for (int index=0; index<2; index++){
			robot.turnLeft();
		}
	}

	public static void moveAndPlace(Robot robot, int count){
		for (int index=0; index<count; index++){
			robot.move();
			robot.putBeeper();
		}
	}

	public static void move(Robot robot, int count){
		for (int index=0; index<count; index++){
			robot.move();
		}
	}
}

// 1. turnAround(jd)
// 2. World.setDelay(0);
// 3. When you create the instance of the robot you pass a higher integer for the number of beepers parameter. 
// 4. It needs to pointed in any direction unless if it is on one of the edges where it can't face that side. You would need it to turn in the direction (either left or right) with the corresponding methods (jd.turnLeft() or turnRight(jd)) and then you can use move() to continue in that directions, therefore moving sideways.
// 5. If you go too far and go through a wall it gives a "Tried to walk through an {DIRECTION} wall. You can either increase the size of the world, make the robot move less, or ask the robot to backtrack once it hits the border.
// 6. The size of the world is set through World.setSize(x, y), but in my case it is based off of the scale World.setSize((10 * scale) - (scale-1), 12 * scale - (scale-1));