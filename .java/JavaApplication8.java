
import java.util.Scanner;

public class JavaApplication8{

    @SuppressWarnings("resource")
    public static void main(String[] args){
        
        Scanner entry = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("Type the 3 sides of a triangle:");
        side1 = entry.nextInt();
        side2 = entry.nextInt();
        side3 = entry.nextInt();

        if (side1 + side2 >= side3 & side1 + side3 >= side2 & side2 + side3 >= side1){
            System.out.println("It`s a triangle");
        }
        else {
            System.out.println("Its`t a triangle");
        }
    }


}