/*
 Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
 Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e
 imprima la cantidad de dinero que tienen entre los tres.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float guillermo;
        
        System.out.print("Indique la cantidad de dolares de Guillermo: ");
        guillermo = input.nextFloat();
        
        float luis = guillermo/2,juan = (guillermo+luis)/2;
        
        // int suma = guillermo+luis+juan;
        
        System.out.println("Guillermo tiene: "+guillermo+" dolares");
        System.out.println("Luis tiene: "+luis+" dolares");
        System.out.println("Juan tiene: "+juan+" dolares");
        System.out.println("\nEl total de dolares entre los tres es: "+(guillermo+luis+juan));
    }
    
}
