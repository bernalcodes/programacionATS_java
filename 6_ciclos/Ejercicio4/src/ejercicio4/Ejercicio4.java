/*
 Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se
 han introducido
 */
package ejercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    static void contadorNumeros(){
        int cont = 0;
        int numero;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            ++cont;
            if(numero < 0){
                JOptionPane.showMessageDialog(null, "Ha digitado un numero negativo");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Ha digitado "+cont+" hasta ahora");
            }
        }while(numero >= 0);
        
        JOptionPane.showMessageDialog(null, "Ha digitado "+cont+" numeros en total");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        contadorNumeros();
    }
    
}
