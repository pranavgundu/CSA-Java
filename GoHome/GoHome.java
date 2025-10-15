package GoHome;
import kareltherobot.*;
import java.util.Random;

public class GoHome implements Directions{
    public static void main(String args[]) {
        World.setSize(100, 100); 
        World.setDelay(10);
        World.setVisible(true);

        Robot zygote = new Robot(1, 1, East, 100000);

        int[] randomPos = randomPosition(100, 100);
        int destX = randomPos[0];
        int destY = randomPos[1];

        goToPosition(destX, destY, zygote);
        goHome(zygote, 1, 1);
    }

    public static int[] randomPosition(int maxX, int maxY) {
        Random random = new Random();
        int randomX = random.nextInt(maxX) + 1;
        int randomY = random.nextInt(maxY) + 1;
        return new int[]{randomX, randomY};
    }

    public static void move(Robot robot, int count) {
        for (int i = 0; i < count; i++) {
            robot.move();
        }
    }

    public static void turnAround(Robot robot) {
        for (int i = 0; i < 2; i++) {
            robot.turnLeft();
        }
    }

    public static void turnRight(Robot robot) {
        for (int i = 0; i < 3; i++) {
            robot.turnLeft();
        }
    }

    public static void goToPosition(int destinationX, int destinationY, Robot robot) {
        int currentX = robot.avenue();
        int currentY = robot.street();
        int deltaY = destinationY - currentY;
        int deltaX = destinationX - currentX;

        if (deltaY > 0) {
            while (!robot.facingNorth()) {
                robot.turnLeft();
            }
            move(robot, deltaY);
        } else if (deltaY < 0) {
            while (!robot.facingSouth()) {
                robot.turnLeft();
            }
            move(robot, Math.abs(deltaY));
        }

        if (deltaX > 0) {
            while (!robot.facingEast()) {
                robot.turnLeft();
            } 
            move(robot, deltaX);
        } else if (deltaX < 0) {
            while (!robot.facingWest()) {
                robot.turnLeft();
            } 
            move(robot, Math.abs(deltaX));
        }

        System.out.println("Reached random position.");
    }

    public static void goHome(Robot robot, int homeX, int homeY) {
        Random rand = new Random();
    
        while (robot.avenue() != homeX || robot.street() != homeY) {
            int deltaX = homeX - robot.avenue();
            int deltaY = homeY - robot.street();
    
            boolean moveInX = rand.nextBoolean();
    
            if (moveInX && deltaX != 0 || deltaY == 0) {
                if (deltaX > 0) {
                    while (!robot.facingEast()) {
                        robot.turnLeft();
                    } 
                    robot.move();
                    robot.putBeeper();
                } else if (deltaX < 0) {
                    while (!robot.facingWest()) {
                        robot.turnLeft();
                    } 
                    robot.move();
                    robot.putBeeper();
                }
            } else {
                if (deltaY > 0) {
                    while (!robot.facingNorth()) {
                        robot.turnLeft();
                    } 
                    robot.move();
                    robot.putBeeper();
                } else if (deltaY < 0) {
                    while (!robot.facingSouth()) {
                        robot.turnLeft();
                    } 
                    robot.move();
                    robot.putBeeper();
                }
            }
        }
    }    
}
