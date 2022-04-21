/*
 Ejercicio 13: Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros negativos
 y la cantidad de ceros
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class Ejercicio13 {
    public static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    static void mediaNumeros(){
        float numero,p=0,sumap=0,n=0,suman=0,c=0;
        for(int i=0;i<10;++i){
            System.out.print("Digite un numero: ");
            numero = input.nextFloat();
            if(numero == 0){
                ++c;
            }else if(numero > 0){
                ++p;
                sumap+=numero;
            }else{
                ++n;
                suman+=numero;
            }
        }
        
        if(p == 0){
            System.out.println("No se ingresaron numeros positivos");
        }else{
            System.out.println("Se ingresaron un total de "+(int)p+" numeros positivos, con una media de: "+(sumap/p));
        }
        
        if(n == 0){
            System.out.println("No se ingresaron numeros negativos");
        }else{
            System.out.println("Se ingresaron un total de "+(int)n+" numeros negativos, con una media de: "+(suman/n));
        }
        
        if(c == 0){
            System.out.println("No se ingresaron ceros");
        }else{
            System.out.println("Se ingresaron un total de "+(int)c+" ceros");
        }
    }
    
    public static void main(String[] args) {
        mediaNumeros();
    }
    
}
