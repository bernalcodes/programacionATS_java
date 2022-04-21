/*
 Ejercicio 14: Hacer un programa que pase de kg a otra unidadad de medida de masa,
 mostrar en pantalla un menu con las opciones posibles
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
    static double pedirDatos(double masaInicial){
        masaInicial = Float.parseFloat(JOptionPane.showInputDialog("Indique la masa que desea convertir: "));
        return masaInicial;
    }
    
    static void menu(){
        int band = 1;
        int opc;
        double masaInicial = 0;
        double masaFinal;
        while(band == 1){
            opc = Integer.parseInt(JOptionPane.showInputDialog("\t.:MENU PRINCIPAL:.\n"
            +"\n1- Kg a g"
            +"\n2- Kg a lb"
            +"\n3- Kg a t"
            +"\n4- Salir"
            +"\n\nOpcion: "));
            
            switch(opc){
                case 1:
                    masaInicial = pedirDatos(masaInicial);
                    masaFinal = masaInicial * 1000;
                    JOptionPane.showMessageDialog(null, masaInicial+"kg = "+masaFinal+"g");
                    break;
                case 2:
                    masaInicial = pedirDatos(masaInicial);
                    masaFinal = masaInicial / 453.59;
                    JOptionPane.showMessageDialog(null, masaInicial+"kg = "+masaFinal+"lb");
                    break;
                case 3:
                    masaInicial = pedirDatos(masaInicial);
                    masaFinal = masaInicial / 1000;
                    JOptionPane.showMessageDialog(null, masaInicial+"kg = "+masaFinal+"t");
                    break;
                case 4:
                    band = 2;
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERROR: Opcion incorrecta");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        menu();
    }    
}
