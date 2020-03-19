
package pooudemy04;

import java.util.Scanner;

public class POOUdemy04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numFuncionario;
        int numHorasTrabalhadas;
        double valorHora;
        double calculoSalario;
        
        System.out.println("Digite o número do funcionário:");
        numFuncionario = scan.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas:");
        numHorasTrabalhadas = scan.nextInt();
        
        System.out.println("Valor da hora:");
        valorHora = scan.nextDouble();
        
        calculoSalario = numHorasTrabalhadas * valorHora;
        
        System.out.printf("NUMBER = %d %n" , numFuncionario); 
        System.out.printf("SALARY = R$ %.2f", calculoSalario);
    }
    
}
