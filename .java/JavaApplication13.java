import java.util.Scanner;
public class JavaApplication13 {

 
    @SuppressWarnings({ "empty-statement", "resource" })
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
       
       int numb, numb2 ,numb3, maior, menor, meio;
       
       System.out.println("Type 3 number:");
       numb = entry.nextInt();
       numb2 = entry.nextInt();
       numb3 = entry.nextInt();
       
       if(numb>numb2 && numb>numb3){
       maior = numb;
       }
       else if(numb2>numb3){
       maior = numb2;
       }
       else{
       maior = numb3;
       }
       
        if(numb<numb2 && numb<numb3){
       menor = numb;
       }
       else if(numb2<numb3){
       menor = numb2;
       }
       else{
       menor = numb3;
       }
        
       if(numb!=maior && numb!=menor){
       meio = numb;
       }
       else if(numb2!=maior && numb2!=menor){
       meio = numb2;
       }
       else{
       meio = numb3;
       }
       
       System.out.println(maior);
       System.out.println(meio);
       System.out.println(menor);
       
    }
}
