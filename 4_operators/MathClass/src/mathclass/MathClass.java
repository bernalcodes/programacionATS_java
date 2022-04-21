/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathclass;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Math class -> Matematica y Trigonometria
        Scanner input = new Scanner(System.in);
        
        double raiz = Math.sqrt(9); // opcional -> int raiz = (int)Math.sqrt(9); para convertir el resultado en int
        System.out.println("sqrt(9) = "+raiz);
        
        double base,exponente;
        
        System.out.print("Digite la base: ");
        base = input.nextDouble();
        
        System.out.print("Digite el exponente: ");
        exponente = input.nextDouble();
        
        int res = (int)Math.pow(base, exponente);
        
        System.out.println("Potencia: "+res);
        
        double numero = 4.56;
        long redondeo = Math.round(numero);
        System.out.println("numero = "+numero);
        
        float numero2 = 4.56f;
        int redondeo2 = Math.round(numero2);
        System.out.println("numero2 = "+numero2);
        
        double numero3 = Math.random();
        System.out.println("numero3 = "+numero3);
    }
}
