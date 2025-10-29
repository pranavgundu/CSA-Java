package Quizzes;

import kareltherobot.*;
import java.util.Scanner;

public class October24 implements Directions{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How tall do you want the triangle to be? ");
        int height = scanner.nextInt();
        scanner.close();
        Robot r = new Robot(1, 9, West, 100000000);
        World.setVisible(true);
        int beepers = 0;
        beepers = makeIsoTri(r, height);
        System.out.println("It took " + beepers + " beepers to make an iscosceles triangle with a height of " + height + ".");
    }

    public static void move(Robot robot, int count){
        for (int i = 0; i < count; i++){
            robot.move();
        }
    }

    public static void turnRight(Robot robot){
        for (int i = 0; i < 3; i++){
            robot.turnLeft();
        }
    }

    public static void turnAround(Robot robot){
        for (int i = 0; i < 2; i++){
            robot.turnLeft();
        }
    }

    public static int makeIsoTri(Robot robot, int height){
        int beepers = 0;
        for (int i = 0; i < height; i++){
            robot.putBeeper();
            beepers++;
            turnRight(robot);
            for (int j = 0; j < i; j++){
                robot.move();
                robot.putBeeper();
                beepers++;
            }
            turnAround(robot);
            move(robot, i);
            turnRight(robot);
            robot.move();
        }
        return beepers;
    }
}