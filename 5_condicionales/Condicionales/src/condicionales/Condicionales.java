/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sentencia if
        int numero,dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero == dato){ // !=, <, >, =<, >=
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
    }
    
}
