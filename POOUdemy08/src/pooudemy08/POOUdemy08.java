
package pooudemy08;

import java.util.Scanner;

public class POOUdemy08 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a;
        
        System.out.println("Digite um número inteiro: ");
        a = scan.nextInt();
        
        if (a %2 == 0 ){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
    }
    
}
