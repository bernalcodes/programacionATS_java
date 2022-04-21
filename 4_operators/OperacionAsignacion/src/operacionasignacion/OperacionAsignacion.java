/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionasignacion;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class OperacionAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operadores aritmeticos combinados con asignacion
        int numero = 10;
        
        System.out.println("Antes: "+numero);
        
        numero += 10; // -=, *=, /=, %=
        
        System.out.println("Despues: "+numero);
    }
    
}
