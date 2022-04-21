/*
 Ejercicio 6: Pedir numeros hasta que se tecle un 0, mostraar la suma de todos los numeros introducidos
 */
package ejercicio6;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    static void sumaNumeros(){
        int suma = 0,numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
            if(numero == 0){
                JOptionPane.showMessageDialog(null, "Ha digitado el cero");
                break;
            }
        }while(numero != 0);
    
        JOptionPane.showMessageDialog(null, "La sumatoria de los numeros digitados es: "+suma);
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        sumaNumeros();
    }
    
}
