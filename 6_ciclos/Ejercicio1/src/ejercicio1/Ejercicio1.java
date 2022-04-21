/*
 Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    static void mostrarCuadrado(){
        Scanner input = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Digite un numero: ");
            numero = input.nextInt();
            if(numero < 0){
                System.out.println("Ingreso un numero negativo");
                break;
            }else{
                System.out.println("El cuadrado de "+numero+" es: "+(numero*numero));
            }
        }while(numero >= 0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarCuadrado();
    }
    
}
