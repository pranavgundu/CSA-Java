import kareltherobot.*;

public class ObjectExample implements Directions{

    Robot zygote;

    public void makeWorld(){
        zygote = new Robot(1, 4, North, 30);
        World.setVisible(true);
    }

    public void moveRobot(){
        zygote.move();
    }


    public void faceDirection(Direction direction) {
        switch (direction) {
            case North:
                while (!zygote.facingNorth()) {
                    zygote.turnLeft();
                }
                break;
            case East:
                while (!zygote.facingEast()) {
                    zygote.turnLeft();
                }
                break;
            case South:
                while (!zygote.facingSouth()) {
                    zygote.turnLeft();
                }
                break;
            case West:
                while (!zygote.facingWest()) {
                    zygote.turnLeft();
                }
                break;
        }
    }

    public static void main(String args[]){
        ObjectExample temp = new ObjectExample();
        temp.makeWorld();
        temp.moveRobot();
    }
}
