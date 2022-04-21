/*
 Ejercicio 1: Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
 */
package ejercicio1;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null, numero+" es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, numero+" no es multiplo de 10");
        }
    }
    
}
