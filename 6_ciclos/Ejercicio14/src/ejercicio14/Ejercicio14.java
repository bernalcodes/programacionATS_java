/*
 Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000
 */
package ejercicio14;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    static void sueldos(){
        int sueldo,suma=0,mayores=0;
        for(int i=0;i<10;++i){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Indique el sueldo: "));
            suma+=sueldo;
            if(sueldo > 1000){
                ++mayores;
            }
        }
        JOptionPane.showMessageDialog(null, "La sumatoria de los sueldos es: "+suma);
        JOptionPane.showMessageDialog(null, "Hay "+mayores+" sueldos mayores a $1000");
    }
    
    public static void main(String[] args) {
        sueldos();
    }
}
