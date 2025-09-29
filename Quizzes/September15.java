package Quizzes;
import kareltherobot.*;

public class September15 implements Directions{
    public static void turnRight(Robot r){
        for (int i=0; i<3; i++){
            r.turnLeft();
        }
    }

    public static void makeHill(Robot robot){
        turnRight(robot);
        for (int i=0; i<2; i++){
            robot.putBeeper();
            robot.move();
        }
        robot.putBeeper();
        robot.turnLeft();
        robot.move();
        robot.putBeeper();
        turnRight(robot);
        for (int i=0; i<2; i++){
            robot.move();
            robot.putBeeper();
        }
        turnRight(robot);
        robot.move();
        robot.putBeeper();
        robot.turnLeft();
        robot.move();
        robot.putBeeper();
        robot.move();
        robot.putBeeper();
    }

    public static void main(String[] args){
        Robot cindy = new Robot(5, 5, North, 11);
        World.setVisible(true);

        makeHill(cindy);
    }
}
