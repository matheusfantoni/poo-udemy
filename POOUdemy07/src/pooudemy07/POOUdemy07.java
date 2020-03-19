
package pooudemy07;

import java.util.Scanner;

public class POOUdemy07 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int a;
        
        System.out.println("Digite um número inteiro");
        a = scan.nextInt();
        
        if (a < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NAO NEGATIVO");
        }
    }
    
}
