/*
 Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0
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
    static void leerNumero(){
        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(numero == 0){
                JOptionPane.showMessageDialog(null, "Ha digitado el 0");
                break;
            }else{
                if(numero>0){
                    JOptionPane.showMessageDialog(null, numero+" es positivo");
                }else{
                    JOptionPane.showMessageDialog(null, numero+" es negativo");
                }
            }
        }while(numero != 0);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        leerNumero();
    }
    
}
