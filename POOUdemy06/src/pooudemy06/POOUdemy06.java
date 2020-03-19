package pooudemy06;

import java.util.Scanner;

public class POOUdemy06 {

    public static void main(String[] args) {
        
        
        float a, b, c;
        float calculaTriangulo, calculaCirculo, calculaTrapezio, calculaQuadrado, calculaRetangulo;
        double pi = 3.14159;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        a = scan.nextFloat();
        System.out.print("Digite o valor de B: ");
        b = scan.nextFloat();
        System.out.print("Digite o valor de C: ");
        c = scan.nextFloat();
       
        calculaTriangulo = (a * c) / 2;
        calculaCirculo =  (float) pi *  (c * c);
        calculaTrapezio = (a + b) * c / 2; 
        calculaQuadrado = b * b;
        calculaRetangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f %n", calculaTriangulo);
        System.out.printf("CIRCULO: %.3f %n", calculaCirculo);     
        System.out.printf("TRAPEZIO: %.3f %n", calculaTrapezio);
        System.out.printf("QUADRADO: %.3f %n", calculaQuadrado);
        System.out.printf("RETANGULO: %.3f ", calculaRetangulo);
    }
    
}
