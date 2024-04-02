package javaapplication1;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       int paga, cent, dez, un, dezabs, unabs;
       
       System.out.println("Digite um valor");
       paga = entrada.nextInt();
       
       cent = paga/100;
       dez = ((100*cent)-paga)/10;
       dezabs = Math.abs(dez);
       un = (100*cent - dez*10)-paga/1;
       unabs = Math.abs(un);
       
       System.out.println("As centenas:"+cent);
       System.out.println("As dezenas:"+dezabs);
      System.out.println("As unidades:"+unabs);
      
    }
    
}
