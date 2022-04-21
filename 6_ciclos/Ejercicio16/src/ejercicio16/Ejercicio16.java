/*
 Ejercicio 16: Pide un numero (que debe estaar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
 */
package ejercicio16;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    static void mostrarTabla(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 10: "));
        StringBuilder string = new StringBuilder();
        
        for(int i=1;i<=12;++i){
            string.append(numero+" * "+(i)+" = "+(numero*i)).append("\n");
        }
        
        String out = string.substring(0,string.length()-1);
        
        JOptionPane.showMessageDialog(null, out);
    }    
    
    public static void main(String[] args) {
        mostrarTabla();
    }
    
}
