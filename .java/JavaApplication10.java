
import java.util.*;

public class JavaApplication10{

    @SuppressWarnings("resource")
    public static void main(String[] args) {

      int operacao;
      float num1, num2;

      Scanner entrada = new Scanner(System.in);
        
       System.out.println("Escreva dois números:");

       num1 = entrada.nextFloat();
       num2 = entrada.nextFloat();

       System.out.println("Qual operação deseja realizar?");
       System.out.println("\n 1 Somar \n 2  Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair");

       operacao = entrada.nextInt();

       if (operacao == 1) {
        System.out.println("A soma dos dois números é igual a: "+ (num1 + num2));
       }
       else if (operacao == 2) {
        System.out.println("A subtração dos dois número é igual a: "+ (num1 - num2));
        
       }
       else if (operacao == 3) {
        System.out.println("A multiplicação dos dois número é igual a:  " + (num1 * num2));
        
       }
       else if (operacao == 4) {
        System.out.println("A divisão dos dois números é igual a: "+(num1 / num2));
        
       }
       else {
        System.out.println("Saindo...");
      
      }
       
      
    }
    
}
