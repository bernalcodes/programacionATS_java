/*
 Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float[] notas = new float[3];
        float suma=0;
        char opc;
        
        System.out.println("\tREGISTRO DE NOTAS\n");
        for(int i=0;i<3;++i){
            System.out.print("Digite la nota "+(i+1)+": ");
            notas[i] = input.nextFloat();
            suma += notas[i];
        }
        System.out.print("\nDesea ver las notas registradas (y/n): ");
        opc = input.next().charAt(0);
        
        if(opc == 'y' || opc == 'Y'){
            System.out.println("\n");
            for(int i=0;i<3;++i){
                System.out.println("Nota #"+(i+1)+": "+notas[i]);
            }
        }
        
        System.out.println("\nLa sumatoria de las notas es: "+suma);
        
        
    }
    
}
