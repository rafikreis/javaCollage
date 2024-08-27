import java.util.Scanner;

public class JavaApplication15 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
      
        Scanner entry = new Scanner(System.in);
        
        int a;
        
        System.out.println("Type a number that you dont know if it is even or odd");
        a = entry.nextInt();
                
        System.out.println(pairs(a));
        
        
    }
    
    public static boolean pairs(int a){
        
        boolean result;
        if(a%2==0){
            result = true;
        }
        else{
            result = false;
        }
        
        return result;
    
        
    }
    
}
