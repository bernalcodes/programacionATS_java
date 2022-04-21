/*
 Ejercicio 5: Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100, y
 luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor con respecto al numero buscado.
 El proceso termina cuando el usuario acierta y mostrar el numero de intentos.
 */
package ejercicio5;
import java.util.Scanner;
// import java.util.Random; // Random random = new Random(); -> int x = random.nextInt(50); (0-50) System.out.print(random);
/**
 *
 * @author felipe
 */
public class Ejercicio5 {
    
    public static final Scanner input = new Scanner(System.in); // making input a class field for scanner availability throughout different methods
    /**
     * @param args the command line arguments
     */
    static void guessingGame(){
        int max = 100,min = 0,user,cont=0;
        int guess = (int)(Math.random()*(max-min+1)+min); // int randomNumber = (int)(Math.random()*(max-min+1)+min);
        
        do{
            System.out.print("Adivine el numero entre "+min+" y "+max+": ");
            user = input.nextInt();
            ++cont;
            if(user == guess){
                System.out.println("¡Acerto en "+cont+" intentos!");
            }else{
                if(guess > user){
                    System.out.println("Intente de nuevo, el numero es mayor");
                }else{
                    System.out.println("Intente de nuevo, el numero es menor");
                }
            }
        }while(user != guess);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        guessingGame();
    }
    
}
