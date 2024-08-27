

import java.util.Scanner;

//Make a code that will receive two notes of a student, and calculate the average and say his situation.

public class JavaApplication4 {

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);

        float note1, note2, average;

        System.out.println("Type your two notes:");
        note1 = entry.nextFloat();
        note2 = entry.nextFloat();
        average = (note1+note2)/2;

        if(average>7){
            System.out.println("You are approved");
        }
        else { System.out.println("You are repproved");
         }
    }
    
}
