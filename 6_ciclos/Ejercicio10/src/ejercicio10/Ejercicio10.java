/*
 Ejercicio 10: Pedir 10 numeros y escribir la suma total
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio10 {
    public static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0;
        for(int i=0;i<10;++i){
            System.out.print("Digite un numero: ");
            numero = input.nextInt();
            suma += numero;
        }
        System.out.println("La suma de los numeros ingresados es: "+suma);
    }
    
}
