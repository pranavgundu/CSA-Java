package Scanner;
import kareltherobot.*;

public class Scanner implements Directions {
	public static void main(String[] args) {
        int worldSize = 20;
        
        World.setVisible(true);
        World.setDelay(1);
        World.setSize(worldSize, worldSize);

        Robot robot =  new Robot(1, (worldSize / 2), North, 1000000000);

        diamond(robot, 15);
    }

    public static void diamond(Robot robot, int size) {
        if (size % 2 == 0) {
            System.out.println("Size must be odd");
            size -= 1;
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < size / 2; i++) {
            robot.putBeeper();
            robot.move();
            turnRight(robot);
            robot.move();
            robot.turnLeft();
            }
            robot.turnLeft();
        }
    }

    public static void turnRight(Robot robot) {
        for (int i = 0; i < 3; i++) {
            robot.turnLeft();
        }
    }
}
