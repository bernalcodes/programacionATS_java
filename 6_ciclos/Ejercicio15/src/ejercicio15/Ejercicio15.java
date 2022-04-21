/*
 Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores
 de 18 años, y la cantidad de alumnos que miden mas de 1.75
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
class Estudiante{
    float estatura,edad;
    public Estudiante(float _edad,float _estatura){
        edad = _edad;
        estatura = _estatura;
    }
}

public class Ejercicio15 {
    public static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        int mayores=0,masAltos=0;
        float edad,estatura,edadMedia=0,estaturaMedia=0;
        
        for(int i=0;i<5;++i){
            System.out.print("Digite la edad del estudiante #"+(i+1)+": ");
            edad = input.nextFloat();
            
            edadMedia += edad;
            
            System.out.print("Digite la estatura del estudiante #"+(i+1)+": ");
            estatura = input.nextFloat();
            
            estaturaMedia += estatura;
            
            estudiantes[i] = new Estudiante(edad,estatura);
            
            if(estudiantes[i].edad > 18){
                mayores++;
            }
            
            if(estudiantes[i].estatura > 1.75){
                masAltos++;
            }
        }
        
        System.out.println("El promedio de edad es de: "+(edadMedia/5)+" años");
        System.out.println("El promedio de estatura es de: "+(estaturaMedia/5)+"cm");
        System.out.println("Hay "+mayores+" alumnos mayores de 18 años");
        System.out.println("Hay "+masAltos+" alumnos que miden mas de 1.75cm");

        
    }
    
}
