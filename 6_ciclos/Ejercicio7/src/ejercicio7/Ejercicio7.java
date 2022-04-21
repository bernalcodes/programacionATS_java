/*
 Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo, y calcular la media
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio7 {
    public static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    static void mediaNumeros(){
        float numero,suma=0,cont=0;
        do{
            System.out.print("Digite un numero: ");
            numero = input.nextInt();
            if(numero >= 0){
                suma += numero;
                ++cont;
            }
        }while(numero >= 0);
        
        if(cont == 0){
            System.out.println("Digito "+(int)(cont)+" numeros positivos");
        }else{
            float media = suma/cont;
            System.out.println("La media de los numeros ingresados es: "+media);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mediaNumeros();
    }
    
}
