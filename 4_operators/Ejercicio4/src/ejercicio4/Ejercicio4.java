/*
 Ejercicio 4: Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales,
 mas una comision de $150 por cada carro vendido, mas el 5% del valor de la venta por carro. Cada mes el capturista
 de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario
 mensual de un vendedor dado.
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final float SAL_MEN = 1000;
        
        int qCarros;
        double sumaCostos=0,salarioFinal;
        
        System.out.print("Cuantos carros vendio este mes: ");
        qCarros = input.nextInt();
        
        double[] cCarros = new double[qCarros];
        
        for(int i=0;i<qCarros;++i){
            System.out.print("Indique el costo de venta del carro #"+(i+1)+": ");
            cCarros[i] = input.nextDouble();
            sumaCostos+=cCarros[i];
        }
        
        salarioFinal = (150 * cCarros.length) + (sumaCostos * 0.05) + SAL_MEN;
        
        System.out.println("Su salario para este mes sera de $"+salarioFinal);
    }
}