/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operadores
        Scanner input = new Scanner(System.in);
        float num1,num2,suma,resta,mult,div,mod;
        
        System.out.print("Digite 2 numeros: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        
        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+resta);
        System.out.println(num1+" * "+num2+" = "+mult);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println(num1+" % "+num2+" = "+mod);
    }
    
}
