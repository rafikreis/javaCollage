

import java.util.Scanner;

public class JavaApplication5 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        
        float numb;
        
        System.out.println("Type a number");
        numb = entry.nextFloat();
        
        if (0<numb & numb<10) {
        System.out.println(numb);
        }
        
    }
    
}