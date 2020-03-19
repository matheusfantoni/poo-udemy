package pooudemy017;

import java.util.Scanner;


public class POOUdemy017 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        
        System.out.println("Digite o nome do aluno");
        
        aluno1.nome = scan.nextLine();
        
        System.out.println("Digite suas três notas para conferência: ");
        
        aluno1.nota1 = scan.nextDouble();
        aluno1.nota2 = scan.nextDouble();
        aluno1.nota3 = scan.nextDouble();
        
        if (aluno1.calculaNotaAluno() > 60){
            System.out.printf("FINAL GRADE = %.2f %n" , aluno1.calculaNotaAluno());
            System.out.println("PASS");
        }
        else{
            System.out.printf("FINAL GRADE = %.2f %n" , aluno1.calculaNotaAluno());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS" ,aluno1.pontosPerdidos());
        }

        

    }
}
