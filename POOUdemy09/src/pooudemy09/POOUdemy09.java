
package pooudemy09;

import java.util.Scanner;

public class POOUdemy09 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int a, b;
        
        System.out.println("Digite dois valores inteiros: ");
        a = scan.nextInt();
        b = scan.nextInt();
        
        if ( a % b == 0 ){
            System.out.println("São multiplos");
        }
        
        else if (b % a == 0){
            System.out.println("São multiplos");
            
        }
        else{
            System.out.println("Não são multiplos");
        }
                
        
    }
    
}
