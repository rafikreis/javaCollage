import java.util.*;

public class JavaApplication11 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int num, par = 0, impar = 0, multiplo = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um número positivo inteiro, caso queira sair, digite um número inteiro negativo:");
        num = entrada.nextInt();

        while (num > 0) {

            System.out.println("Escreva um número positivo inteiro par, caso queira sair número positivo inteiro negativo");
            

            if (num%2 == 0) {
                par = par + 1;
            }

            if (num%2 != 0) {
                impar = impar + 1;
                
            }

            if (num%5 == 0) {
                multiplo = multiplo + 1;

            }

            num = entrada.nextInt();
            
        }

        System.out.println("Resultados da lista: ");
        System.out.println("Números pares: " + par);
        System.out.println("Números impares: " + impar);
        System.out.println("Números multiplos de 5: " + multiplo);
     
    }

}
