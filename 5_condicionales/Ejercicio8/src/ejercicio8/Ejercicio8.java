/*
 Ejercicio 8: Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,cifras = 0;
        
        do{
            System.out.print("Digite un numero entre 0 y 99999: ");
            numero = input.nextInt();
        }while(numero < 0 || numero > 99999);
        
        while(numero != 0){
            numero /= 10;
            cifras++;
        }    
        
        System.out.println("Cifras: "+cifras);
    }
    
}
