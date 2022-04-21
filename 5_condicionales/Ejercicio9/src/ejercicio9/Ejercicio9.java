/*
 Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses
 son de 30 dias
 */
package ejercicio9;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dd,mm,yy;
        
        do{
            dd = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
            mm = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
            yy = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

            if((dd > 30 || dd < 0) || (mm > 12 || mm < 0) || yy < 0){
                JOptionPane.showMessageDialog(null,"Alguno de los datos ingresados es incorrecto");
            }
        }while((dd > 30 || dd < 0) || (mm > 12 || mm < 0) || yy < 0);
        
        JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+dd+"/"+mm+"/"+yy);
    }
}
