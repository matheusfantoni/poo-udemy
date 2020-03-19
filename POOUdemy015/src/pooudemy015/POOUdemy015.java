
package pooudemy015;

import java.util.Scanner;

public class POOUdemy015 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();
        
        
        System.out.print("Digite a largura do retângulo: ");
        retangulo.width = scan.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        retangulo.height = scan.nextDouble();
        
        System.out.println();
        System.out.printf("AREA = %.2f %n" ,retangulo.areaRectangle());
        System.out.printf("PERIMETER = %.2f %n" ,retangulo.perimeterRectangle());
        System.out.printf("DIAGONAL = %.2f %n" , retangulo.diagonalRectangle());
        
    }
    
}
