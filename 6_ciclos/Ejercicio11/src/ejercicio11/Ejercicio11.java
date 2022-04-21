/*
 Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numeros impares
 */
package ejercicio11;
/**
 *
 * @author felipe
 */
public class Ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for(int i=0;i<=20;i+=2){
            producto *= i;
        } 
         */
        
        int i=1,cont=0,prod=1;
        
        while(cont < 10){
            if(i % 2 != 0){
                System.out.println(i);
                prod*=i;
                ++cont;
            }
            ++i;
        }
        
        System.out.println("El producto de los primeros "+cont+" numeros impares es: "+prod);
    }
    
}
