/*
 Ejercicio 12: Pedir un numero y calcular su factorial
 */
package ejercicio12;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    static int calcFactorial(int dato){
        if(dato == 0){
            return 1;
        }else{
            return dato * calcFactorial(dato - 1);
        }
    }
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        JOptionPane.showMessageDialog(null, numero+"! = "+calcFactorial(numero));
    }
    
}
