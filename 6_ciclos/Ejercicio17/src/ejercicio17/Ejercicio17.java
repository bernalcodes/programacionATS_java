/*
 Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
 facturas. En cada factura figura:
 - el código del articulo
 - la cantidad vendida en litros y
 - el precio por litro.
 Se pide de 5 facturas introducidas: facturacion total, cantidad en litros vendidos del aritculo 1 y cuantas facturas se emitieron de mas
 de $600
 */
package ejercicio17;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
class Factura{
    
    // class attributes
    private int codigoArticulo;
    private double litrosVendidos;
    private double precioLitro;
    private double totalVenta;
    
    // class constructor
    Factura(int _codigoArticulo,double _litrosVendidos,double _precioLitro){
        codigoArticulo = _codigoArticulo;
        litrosVendidos = _litrosVendidos;
        precioLitro = _precioLitro;
    }
    
    // setters and getters
    public void setCodigo(int _codigoArticulo){
        codigoArticulo = _codigoArticulo;
    }
    public void setLitros(double _litrosVendidos){
        litrosVendidos = _litrosVendidos;
    }
    public void setPrecioLitro(double _precioLitro){
        precioLitro = _precioLitro;
    }
    public void setTotalVenta(){
        totalVenta = litrosVendidos * precioLitro;
    }
    public double getCodigo(){
        return codigoArticulo;
    }
    public double getLitros(){
        return litrosVendidos;
    }
    public double getPrecioLitro(){
        return precioLitro;
    }
    public double getTotalVenta(){
        return totalVenta;
    }
}

public class Ejercicio17 {
    
    /**
     * @param args the command line arguments
     */
    static void calcularFactura(){
        int codigo,mayores600=0,facturaTotal=0,litrosArticulo1=0;
        double litrosVendidos,precioLitro;
        Factura[] facturas = new Factura[5];
        
        for(int i=0;i<5;++i){
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el codigo de la factura #"+(i+1)+": ","Codigo factura",JOptionPane.INFORMATION_MESSAGE));
            litrosVendidos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de litros vendidos para la factura #"+(i+1)+": ","Litros vendidos",JOptionPane.INFORMATION_MESSAGE));
            precioLitro = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio por litro vendido para la factura #"+(i+1)+": ","Litros vendidos",JOptionPane.INFORMATION_MESSAGE));
            
            facturas[i] = new Factura(codigo,litrosVendidos,precioLitro);
            
            facturas[i].setTotalVenta();
            
            facturaTotal += facturas[i].getTotalVenta();
            
            if(facturas[i].getCodigo() == 1){
                litrosArticulo1 += facturas[i].getLitros();
            }
            
            if(facturas[i].getTotalVenta()> 600){
                mayores600++;
            }            
        }
        
        StringBuilder string = new StringBuilder();
        
        string = string.append("Facturacion total: $"+facturaTotal+"\n").append("Litros vendidos del articulo #1: "+litrosArticulo1+"lt\n").append("Se emitieron "+mayores600+" facturas mayores a $600\n");
        
        JOptionPane.showMessageDialog(null, string,"String",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        calcularFactura();
    }
    
}
