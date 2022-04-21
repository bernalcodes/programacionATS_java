/*
 Ejercicio 13: Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares,
 con el siguiente menu de opciones:
 - Ingresar dinero a la cuenta
 - Retirar dinero de la cuenta
 - Salir
 */
package ejercicio13;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio13 programa = new Ejercicio13();
        programa.menu();
    }
    
    public void menu(){
        int band = 1;
        int saldo = 1000;
        while(band == 1){
            int opc = Integer.parseInt(JOptionPane.showInputDialog("\t.:MENU PRINCIPAL:.\n"
                    + "\n1- Ver saldo disponible"
                    + "\n2- Ingresar dinero a la cuenta"
                    + "\n3- Retirar dinero de la cuenta"
                    + "\n4- Salir"
                    + "\n\nOpcion: "));
            
            switch(opc){
                case 1:
                    mostrarSaldo(saldo);
                    break;
                case 2:
                    saldo = ingresarDinero(saldo);
                    mostrarSaldo(saldo);
                    break;
                case 3:
                    saldo = retirarDinero(saldo);
                    mostrarSaldo(saldo);
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
    
    public void mostrarSaldo(int saldo){
        JOptionPane.showMessageDialog(null, "Su saldo actual es de $"+saldo+" dolares");
    }
    
    public int ingresarDinero(int saldo){
        int ingreso;
        do{
            ingreso = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea ingresar a la cuenta: "));
            if(ingreso < 0){
                JOptionPane.showMessageDialog(null, "ERROR: Valor ingresado debe ser mayor o igual a 0");
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea ingresar a la cuenta: "));
            }
        }while(ingreso < 0);
        saldo += ingreso;
        JOptionPane.showMessageDialog(null, "Ha ingresado a su cuenta $"+ingreso+" dolares");
        return saldo;
    }
    
    public int retirarDinero(int saldo){
        int retiro;
        do{
            retiro = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar de la cuenta: "));
            if(retiro < 0){
                JOptionPane.showMessageDialog(null, "ERROR: Valor ingresado debe ser mayor o igual a 0");
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar de la cuenta: "));
            }else if(retiro > saldo){
                JOptionPane.showMessageDialog(null, "ERROR: Valor ingresado debe ser menor o igual al saldo disponible");
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea retirar de la cuenta: "));
            }
        }while(retiro < 0 || retiro > saldo);
        saldo -= retiro;
        JOptionPane.showMessageDialog(null, "Ha reitrado de su cuenta $"+retiro+" dolares");
        return saldo;
    }
}