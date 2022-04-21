/*
 Ejercicio 6: Hacer un programa que tome dos numeros y diga si ambos son pares o impares
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
        int num1,num2;
        
        System.out.print("Digite un numero: ");
        num1 = input.nextInt();
        System.out.print("Digite otro numero: ");
        num2 = input.nextInt();
        
        if((num1 % 2 == 0)&&(num2 % 2 == 0)){
            System.out.println("Ambos numeros son pares");
        }else if((num1 % 2 != 0) && (num2 % 2 != 0)){
            System.out.println("Ambos numeros son impares");
        }else{
            if(num1 % 2 == 0){
                System.out.println(num1+" es par");
            }else{
                System.out.println(num1+" es impar");
            }
            
            if(num2 % 2 == 0){
                System.out.println(num2+" es par");
            }else{
                System.out.println(num2+" es impar");
            }
        }
    }
    
}
