
import java.util.Scanner;

class JavaApplication14 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numb, quanty, sum = 0;

        System.out.println("type the length to the vet");
        quanty = entry.nextInt();

        int vet[] = new int[quanty];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Type the number "+(1+i));
            numb = entry.nextInt();
            sum = sum + numb;
            vet[i] = numb;
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        System.out.println("The sum of the vet is:" + sum);

    }

}
