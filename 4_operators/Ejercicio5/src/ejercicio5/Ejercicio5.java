/*
 Ejercicio 5: La calificacion final de un estudiante de informatica se calcula con base a las calificaciones de cuatro aspectos
 de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial y examen final. Sabien que las 
 calificaciones anteriores entran en la calificacion final con ponderacions del 10%, 25%, 25% y 40%, hacer un program que calcule
 e imprima la calificacion final obtenida por un estudiante
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float notaFinal;
        float[] registroNotas = new float[4];
        String[] tipoNotas = new String[]{"Participacion","Primer examen parcial","Segundo examen parcial","Examen final"};
        
        for(int i=0;i<4;++i){
            System.out.print("Nota - "+tipoNotas[i]+": ");
            registroNotas[i] = input.nextFloat();
        }
        
        notaFinal = (registroNotas[0]*0.1f)+((registroNotas[1]+registroNotas[2])*0.25f)+(registroNotas[3]*0.4f);
        
        System.out.println("Su nota final es: "+notaFinal);
    }
    
}
