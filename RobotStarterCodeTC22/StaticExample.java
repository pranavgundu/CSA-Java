import kareltherobot.*;

public class StaticExample implements Directions{
    public static void main(String args[]){
        Robot nessy = new Robot(8, 8, North, 10);
        World.setVisible(true);

        nessy.putBeeper();

        for(int i=0; i<3; i++){
            nessy.turnLeft();
        }

        turnRight(nessy);
    }

    public static void turnRight(Robot robot){
		for (int index=0; index<3; index++){
			robot.turnLeft();
		}
	}

    public static void faceDirection(Direction direction, Robot robot){
        switch (direction) {
            case North:
            
        }
    }
}
