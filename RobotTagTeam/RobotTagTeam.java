package RobotTagTeam;

import kareltherobot.*;
import java.util.*;

public class RobotTagTeam implements Directions{
    public static void move(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            robot.move();
        }
    }

    public static void moveAndPlace(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            robot.move();
            robot.putBeeper();
        }
    }

    public static void placeAndMove(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            robot.putBeeper();
            robot.move();
        }
    }

    public static void turnRight(Robot robot) {
        for (int i = 0; i < 3; i++) {
            robot.turnLeft();
        }
    }

    public static int climbStairs(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            placeAndMove(2, robot);
            turnRight(robot);
            placeAndMove(3, robot);
            robot.turnLeft();
        }
        return count * 5;
    }

    public static int makePeak(int count, Robot robot) {
        for (int i = 0; i < count; i++) {
            placeAndMove(2, robot);
            turnRight(robot);
            placeAndMove(2, robot);
            robot.turnLeft();
        }

        turnRight(robot);

        for (int i = 0; i < count; i++) {
            placeAndMove(2, robot);
            turnRight(robot);
            placeAndMove(2, robot);
            robot.turnLeft();
        }

        return count;
    }

    public static void three(Robot r){
        r.putBeeper();
        for (int i=0; i<5; i++){
        r.move();
        r.putBeeper();
        }
        turnRight(r);
        r.move();
        r.putBeeper();
        r.move();
        r.putBeeper();
        turnRight(r);
        r.move();
        r.turnLeft();
        r.move();
        r.putBeeper();
        r.move();
        r.turnLeft();
        r.move();
        r.putBeeper();
        turnRight(r);
        r.move();
        r.putBeeper();
        r.move();
        r.putBeeper();
        }
        

    public static void main(String[] args) {
        Robot robot =  new Robot(1, 1, North, 100);

        World.setVisible(true);
        World.setDelay(1);
        World.setSize(25, 25);	

        three(robot);
    }
}