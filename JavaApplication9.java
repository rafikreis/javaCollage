package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {
    
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        
        double mw, hg, m, w;
        
        System.out.println("Type the higth in meters:");
        hg = entry.nextDouble();
        
        System.out.println("Type 1 for Mans and 2 fo Womans:");
        mw = entry.nextInt();
        
        if (mw==1) {
            
            m = (72.7*hg)-58;
            System.out.println("Mans rigth weigth is: " +m);
        }
        else if(mw==2) {
            
            w = (62.1*hg)-44.7;
            System.out.println("Womans rigth weigth is: " +w);
        }
        
        while(hg!=1 & hg!=2){
            System.out.println("Type the higth;");
        hg = entry.nextDouble();
        
        System.out.println("Type 1 for Mans and 2 fo Womans:");
        mw = entry.nextInt();
        
        if (mw==1) {
            
            m = (72.7*hg)-58;
            System.out.println("Mans rigth weigth is: " +m);
        }
        else if(mw==2) {
            
            w = (62.1*hg)-44.7;
            System.out.println("Womans rigth weigth is: " +w);
        }
            
        }
    }
    
}