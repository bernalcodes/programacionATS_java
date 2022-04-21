/*
 Ejercicio 7: Pedir tres numeros y mostrarlos ordenados de mayor a menor
 */
package ejercicio7;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int aux;
        
        for(int i=0;i<3;++i){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion ["+i+"]: "));
        }
        
        for(int i=0;i<2;++i){
            for(int j=1;j<3;++j){
                if(numeros[i]<numeros[j]){
                    aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        
        for(int i=0;i<3;++i){
            JOptionPane.showMessageDialog(null, "numeros["+i+"] = "+numeros[i]);
        }
        
    }
    
}
