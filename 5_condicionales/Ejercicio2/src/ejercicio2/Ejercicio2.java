/*
 Ejercicio 2: Pedir dos numeros y decir cual es el mayor o si son iguales
*/
package ejercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, num1+" es mayor que "+num2);
        }else if(num2 > num1){
            JOptionPane.showMessageDialog(null, num2+" es mayor que "+num1);
        }else{
            JOptionPane.showMessageDialog(null, num1+" es igual a "+num2);
        }
    }
    
}
