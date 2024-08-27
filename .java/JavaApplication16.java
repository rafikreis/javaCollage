public class JavaApplication16 {

    
    public static void main(String[] args) {
        
        int vet[] = {1,2,3};
        
        System.out.println(invert(vet)[0]);
        
        
        
    }
    public static int[] invert(int[] a){
        int invet[] = new int[a.length];
         
        for(int i=0; i < a.length; i++){
            
            int t;
            
            t = a.length - 1 - i;
            
            invet[i] = a[t];
        
        }
        
        return invet;
        
        }
        
  }