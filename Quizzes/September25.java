package Quizzes;

import kareltherobot.*;

public class September25 implements Directions{
    public static void turnRight(Robot robot) {
        for (int i = 0; i < 3; i++) {
            robot.turnLeft();
        }
    }

    public static void diagnolRight(int count, Robot robot) {
        for (int i = 0; i < count; i++){
            robot.move();
            turnRight(robot);
            robot.move();
            robot.putBeeper();
            robot.turnLeft();
        }
    }

    public static void move(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            robot.move();
        }
    }

    public static void diagnolLeft(int count, Robot robot) {
        for (int i = 0; i < count; i++){
            robot.move();
            robot.turnLeft();
            robot.move();
            robot.putBeeper();
            turnRight(robot);
        }
    }

    public static void main(String args[]) {
        Robot k = new Robot(5, 2, North, 100000);
        World.setVisible(true); // mistakes
        World.setDelay(1); // mistakes

        k.putBeeper();
        diagnolRight(2, k);
        diagnolLeft(2, k);
        turnRight(k);
        move(4, k);
        turnRight(k);
        move(4, k);
        k.turnLeft();
        k.turnLeft();
        k.putBeeper();
        diagnolLeft(1, k);
        k.move();
        k.turnLeft();
        k.move();
        turnRight(k);
        diagnolRight(2, k);
        turnRight(k);
        k.move();
        turnRight(k);
        move(2, k);
        turnRight(k);
        k.putBeeper();
        k.move();
        k.putBeeper();
        k.move();
        k.putBeeper();
    }
}
