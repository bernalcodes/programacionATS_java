/*
 Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma: (a+b)² = a² + 2ab + b²
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,res;
        
        System.out.print("a = ");
        a = input.nextInt();
        
        System.out.print("b = ");
        b = input.nextInt();
        
        res = (int)((Math.pow(a,2f))+(2f*(a*b))+(Math.pow(b,2f)));
        
        System.out.println("(a + b)² = "+res);
    }
    
}
