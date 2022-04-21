/*
 Ejercicio 10: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 dias. Sin
 años bisiestos
 */
package ejercicio10;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dd,mm,yy;
        
        do{
            dd = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
            mm = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
            yy = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
            
            if(dd > 31 || dd < 0){
                JOptionPane.showMessageDialog(null, "ERROR: Valor 'dia' incorrecto.");
            }
            
            if(mm > 12 || mm < 0){
                JOptionPane.showMessageDialog(null, "ERROR: Valor 'mes' incorrecto.");
            }

            if(yy < 0){
                JOptionPane.showMessageDialog(null, "ERROR: Valor 'año' incorrecto.");
            }
        }while((dd > 31 || dd < 0) || (mm > 12 || mm < 0) || yy < 0);
        
        while(((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 30) || (mm == 2 && dd > 28)){
            if(((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 30) || (mm == 2 && dd > 28)){
                JOptionPane.showMessageDialog(null, "ERROR: Valor 'dia' no concuerda con valor 'mes'. Debe ser menor.");
                dd = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
            }
        }
        
        JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+dd+"/"+mm+"/"+yy);
    }
    
}
