
package pooudemy13;

import java.util.Scanner;

public class POOUdemy13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salario;
        double calculaSalario;
        
        System.out.println("Digite o valor do seu salário");
        salario = scan.nextDouble();
        
        if (salario > 0 && salario <= 2000){
            System.out.println("Isento");
        }
        else if(salario > 2001 && salario <= 3000){
            calculaSalario = salario * 0.8;
            System.out.printf("R$ %.2f", calculaSalario);
        }
    }
    
}
