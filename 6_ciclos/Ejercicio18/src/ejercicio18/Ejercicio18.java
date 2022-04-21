/*
 Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio
 por litro. Solo existen tres productos con precios:
 1- 0,6 USD/litro
 2- 3 USD/litro
 3- 1.25 EUR/litro
 */
package ejercicio18;
// import javax.swing.JOptionPane;
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
    Factura(int _codigoArticulo,double _litrosVendidos){
        this.codigoArticulo = _codigoArticulo;
        this.litrosVendidos = _litrosVendidos;
        switch(this.codigoArticulo){
            case 1:
                this.precioLitro = 0.6;
                break;
            case 2:
                this.precioLitro = 3;
                break;
            case 3:
                this.precioLitro = 1.25;
                break;
        }
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

public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Factura factura = new Factura(1,25);
        System.out.println(factura.getTotalVenta());
    }
    
}
