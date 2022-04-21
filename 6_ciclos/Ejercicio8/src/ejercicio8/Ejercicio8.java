/*
 Ejercicio 8: Pedir un numero n, y mostrar todos los numeros del 1 a n
 */
package ejercicio8;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    static void mostrarNumeros(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int i=1;
        StringBuilder string = new StringBuilder();
        while(i <= n){
            string.append(i).append("\n");
            ++i;
        }
        String finalString = string.substring(0,string.length()-1);
        JOptionPane.showMessageDialog(null, "Los numeros de 1 a "+n+" son:\n"+string);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarNumeros();
    }
    
}
