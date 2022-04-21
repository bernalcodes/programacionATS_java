/*
 Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
 de sus horas semanales trabajadas y de su salario por hora
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SALARIO_HORA = 35000;
        float[] registro = new float[5];
        float suma=0;
        String[] semana = {"lunes","martes","miercoles","jueves","viernes"};
        
        for(int i=0;i<5;++i){
            System.out.print("Digite las horas trabajadas el "+semana[i]+": ");
            registro[i] = input.nextFloat();
            suma += registro[i];
        }
        
        System.out.println("\nSu salario semanal por "+suma+" horas trabajadas es de $"+(suma*SALARIO_HORA));
        
    }
    
}
