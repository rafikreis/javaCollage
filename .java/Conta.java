
public class Conta {
    double saldo;
    String tipo;
    int conta, agg;
    
    public void iniciar(double s, int c , int a){
    
        saldo = s;
        
        
    }
    
    public double depositar(double valor){
        
        if(valor > 0){

            saldo = saldo + valor;

            return saldo;
            
        }
        
        else System.out.println("Erro.");
        
         return saldo;
    }
    
    public double sacar(double valor){
        
        if(valor < saldo){
            saldo = saldo - valor;
            
            return saldo;
        }
        
        else System.out.println("Erro");
        return saldo;
    
    }
    
    public double saldo(double saldo){
    
        return saldo;
    }

}