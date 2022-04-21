/*
 Ejercicio 3: Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
*/
package ejercicio3;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, letra+" es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, letra+" es una letra minuscula");
        }
    }
    
}
