/*
 Ejercicio 3: Leer numeros hasta que se introduzca el 0. Para cada uno indicar si es par o impar
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
    static void parImpar(){
        Scanner input = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Digite un numero: ");
            numero = input.nextInt();
            if(numero == 0){
                System.out.println("Ha digitado el 0");
            }else{
                if(numero % 2 == 0){
                    System.out.println(numero+" es par");
                }else{
                    System.out.println(numero+" es impar");
                }
            }
        }while(numero != 0);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        parImpar();
    }
    
}
