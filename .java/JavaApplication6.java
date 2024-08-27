

import java.util.Scanner;

public class JavaApplication6 {

   
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        
        float note1, note2, note3, mean;
        
        System.out.println("Type thre notes in between 0 - 10?");
        note1 = entry.nextFloat();
        note2 = entry.nextFloat();
        note3 = entry.nextFloat();
        
        mean = (note1 + note2+ note3)/3;
        
        while(mean>10){
            System.out.println("Type thre notes in between 0 - 10?");
            note1 = entry.nextFloat();
            note2 = entry.nextFloat();
            note3 = entry.nextFloat();
        
            mean = (note1 + note2+ note3)/3;
        
        }
        
        if(mean>=0 & mean<3){
        System.out.println("disapproved");
        }
        else if (mean>=3 & mean<7){
        System.out.println("Exam");
        }
        else if (mean>=7 & mean<=10){
        System.out.println("Approved");
        }
                
    }
}

