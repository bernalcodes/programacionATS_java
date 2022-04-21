/*
 Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
 manera:
 - Si trabaja 40h o menos, se le paga $16 por hora
 - Si trabaja mas de 40h, se le paga $16 por cada una de las primeras 40h y $20 por cada hora extra
 */
package ejercicio5;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float horasSemanales = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas laboradas durante la semana: "));
        
        float extras,salario;
        
        if(horasSemanales > 40){
            extras = horasSemanales - 40;
            salario = (40*16) + (extras*20);
            JOptionPane.showMessageDialog(null, "Su salario para la semana sera de $"+String.format("%.0f", salario)+" con "+String.format("%.0f", horasSemanales)+"h laboradas");
        }else{
            salario = horasSemanales * 16;
            JOptionPane.showMessageDialog(null, "Su salario para la semana sera de $"+String.format("%.0f", salario)+" con "+String.format("%.0f", horasSemanales)+"h laboradas");
        }
    }
}
