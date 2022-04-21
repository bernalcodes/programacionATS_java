/*
 Ejercicio 7: Construir un programa que, dado un numero total de horas, devuelve el numero de semanas, dias y horas equivalentes.
 Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */
package ejercicio7;
import javax.swing.JOptionPane;
/**
 *
 * @author felipe
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1 semana = 7 dias = 168 horas
        float horas;
        
        horas = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad de horas: "));
        
        float horasIni = horas;
        int semanas = (int)(Math.floor(horasIni / 168));
        horasIni = (horasIni/168) - semanas;
        int dias = (int)(Math.floor(horasIni * 7));
        horasIni = (horasIni*7) - dias;
        int horasFin = (int)(Math.floor(horasIni * 24));
        JOptionPane.showMessageDialog(null,String.format("%.0f",horas)+" horas equivalen a: "+semanas+" semanas, "+dias+" dias y "+horasFin+" horas");
    
        /*
        Alternativa
        
        semanas = horasTotales / 168;
        dias = (horasTotales % 168) / 24;
        horas = horasTotales % 24;
        */
    
    }
    
}
