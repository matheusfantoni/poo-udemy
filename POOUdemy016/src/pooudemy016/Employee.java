
package pooudemy016;

public class Employee {
    
        public String nome;
        public double salarioLiquido;
        public double imposto;
        
        
        public double calculaSalarioLiquido(){
            
            return salarioLiquido - imposto;
        }
        
        public void aumentoSalario(double porcentagem){
            
            salarioLiquido += salarioLiquido * porcentagem / 100; 
        }
        
        public String toString(){
            
            return nome + ", $ " + String.format("%.2f", calculaSalarioLiquido());
        }
        
}
