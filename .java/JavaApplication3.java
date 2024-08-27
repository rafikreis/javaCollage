

// Make a code that will receive two numbers, and say which one is higher and lower. If both are the same, enter a message.

import java.util.Scanner;

public class JavaApplication3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        float numb1, numb2;


        System.out.println("Type two numbers:");
        numb1 = entry.nextFloat();
        numb2 = entry.nextFloat();

        if(numb1>numb2){
            System.out.println("The number one is higther then number two");
        }
        else if(numb1==numb2){
            System.out.println("Both numbers are the same");
        }
        else{
            System.out.println("The number two is higther than number one");
        }
        

    }
    
}
