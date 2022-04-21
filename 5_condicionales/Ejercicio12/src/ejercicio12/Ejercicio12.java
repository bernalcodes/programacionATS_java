/*
 Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente
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
    public static void main(String[] args) {
        float nota;
        do{
            nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0 y 10: "));
        }while(nota < 0 || nota > 10);
        
        if(nota >= 0 && nota < 6){
            JOptionPane.showMessageDialog(null, "Su nota fue: Insuficiente");
        }else if(nota >= 6 && nota < 8){
            JOptionPane.showMessageDialog(null, "Su nota fue: Suficiente");
        }else if(nota >= 8 && nota < 9){
            JOptionPane.showMessageDialog(null, "Su nota fue: Bien");
        }else if(nota >= 9 && nota < 10){
            JOptionPane.showMessageDialog(null, "Su nota fue: Notable");
        }else{
            JOptionPane.showMessageDialog(null, "Su nota fue: Sobresaliente");
        }
    }
    
}
