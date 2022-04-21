/*
 Ejercicio 4: En MegaPlaza se hace un 20% de dcto a los clientes cuya compra supere los $300
 ¿Cual sera la cantidad que pagara una persona por su compra?
 */
package ejercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float totalCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor total de su compra: "));
        
        if(totalCompra > 300){
            totalCompra-=totalCompra*0.2;
            JOptionPane.showMessageDialog(null, "El valor a cancelar con 20% de descuento es de $"+totalCompra);
        }else{
            JOptionPane.showMessageDialog(null, "El valor a cancelar es de $"+String.format("%.0f", totalCompra)+", sin descuento");
        }
    }
    
}
