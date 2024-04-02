package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int paga, nota100, nota50, nota10, nota1;

        System.out.println("Digite um valor");
        paga = entrada.nextInt();

        nota100 = paga / 100;
        paga = paga % 100;

        nota50 = paga / 50;
        paga = paga % 50;

        nota10 = paga / 10;
        paga = paga % 10;

        nota1 = paga;

        System.out.println("Cem: " + nota100);
        System.out.println("Cinquenta: " + nota50);
        System.out.println("Dez: " + nota10);
        System.out.println("UM: " + nota1);
    }
}