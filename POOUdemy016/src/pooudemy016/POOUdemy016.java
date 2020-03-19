
package pooudemy016;

import java.util.Scanner;

public class POOUdemy016 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Employee func = new Employee();
        
        System.out.print("Nome: ");
        func.nome = scan.nextLine();
        System.out.print("Salário Líquido: ");
        func.salarioLiquido = scan.nextDouble();
        System.out.print("Taxa de Imposto: ");
        func.imposto = scan.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + func.toString());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = scan.nextDouble();
        func.aumentoSalario(porcentagem);
        
        System.out.println();
        System.out.println("Updated data: " + func.toString());
        
    }
    
}
