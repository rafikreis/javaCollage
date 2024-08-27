import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade, contMenor18 =  0;

        for (int cont = 1; cont <= 10; cont++) {

            System.out.println("Informe a idade da pessoa " + cont); 
            
            idade = scanner.nextInt();

            if (idade > 18) {

                contMenor18++;

            }


        }

        System.out.println("Toral de pessoas é: "+contMenor18);
    }
}