/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cadena;
        String palabra;
        char caracter;
        
        System.out.print("Digite una cadena: ");
        cadena = input.nextLine();
        
        System.out.print("Digite una palabra: ");
        palabra = input.next();
        
        System.out.print("Digite un caracter: ");
        caracter = input.next().charAt(0);
        
        System.out.println("La cadena es: "+cadena);
        System.out.println("La palabra es: "+palabra);
        System.out.println("El caracter es: "+caracter);
    }
    
}
