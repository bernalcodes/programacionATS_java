/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incrementodecremento;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class IncrementoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operadores de incremento y decremento
        
        int x = 5;
        
        System.out.println("Antes: "+x);
        
        x++; // x--;
        
        System.out.println("Despues: "+x);
        
        int y = 10,z,w;
        
        System.out.println("y = "+y);
        
        z = y++; // primero se asigna el valor de y a z y luego se ejecuta el ++ (post-increment)
        System.out.println("z = "+z); // z = 10 porque se le asigno el valor de y antes del y++
        
        w = ++y; // primero se ejecuta el ++ y luego se asigna el valor de y a w (pre-increment)
        System.out.println("w = "+w); // w = 12 porque se aplicaron el y++ y el ++y
        
        
    }
    
}
