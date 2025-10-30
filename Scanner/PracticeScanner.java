package Scanner;
import kareltherobot.*;
import java.util.Scanner;

public class PracticeScanner implements Directions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of the shape that you would like to be made: ");
        int size = scanner.nextInt();
        scanner.close();
        int worldSize = 2 * (size + 2);

        Robot robot = new Robot(1, worldSize / 2, North, size^2);
        World.setSize(worldSize, worldSize);
        World.setVisible(true);

        int beepersPlaced = 0;

        System.out.println("The shape has been completed using " + beepersPlaced + " beepers.");
    }
}
