/*
 Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado
 de coeficientes reales
 
 ax² + bx + c = 0
 
 x = (-b +|- sqrt(b² - 4ac) / (2a)
 
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
    public static void main(String[] args) {
        float parte1,parte2A,parte2B,resA,resB;
        
        float a = Float.parseFloat(JOptionPane.showInputDialog("a: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("b: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("c: "));
        
        parte1 = (float)(Math.pow(b,2) - (4*a*c));
         
        if(parte1 < 0){
            JOptionPane.showMessageDialog(null, "Valores invalidos, raiz negativa");
        }else{
            parte2A = (float)((-1*b)+Math.sqrt(parte1));
            resA = parte2A / (2*a);
            parte2B = (float)((-1*b)-Math.sqrt(parte1));
            resB = parte2B / (2*a);
            JOptionPane.showMessageDialog(null,"Raiz 1: "+resA+"    Raiz 2: "+resB);
        }        
    }
}
