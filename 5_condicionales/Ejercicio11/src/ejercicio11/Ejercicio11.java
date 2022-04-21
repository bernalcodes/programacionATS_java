/*
 Ejercicio 11: Contruir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro
 operaciones aritmeticas basicas (suma, resta, producto, cociente) con valores numericos enteros. El usuario debe especificar la operacion
 con el primer caracter del primer parametro de la linea de comandos: S o s pra la suma, R o r para la resta, P, p, M o m para
 el producto y D o d para la division
 */
package ejercicio11;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        char opc = JOptionPane.showInputDialog("\tIndique la operacion:\n\n1- Suma (+)\n2- Resta (-)\n3- Producto (*)\n4- Cociente (/)\n\nOpcion: ").charAt(0);
        
        switch(opc){
            case '+':
                JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+(num1+num2));
                break;
            case '-':
                JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*':
                JOptionPane.showMessageDialog(null, num1+" * "+num2+" = "+(num1*num2));
                break;
            case '/':
                JOptionPane.showMessageDialog(null, num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR: Opcion invalida");
                break;
        }
    }
    
}
