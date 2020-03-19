
package pooudemy10;

import java.util.Scanner;

public class POOUdemy10 {

    public static void main(String[] args) {
        
        int i, f;
        int duracao;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial e final do jogo: ");
        i = scan.nextInt();
        f = scan.nextInt();
        
        if ( i < f){
            duracao = f - i;
        }
        else{
            duracao = 24 - i + f;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
        
    }
    
}
