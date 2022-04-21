/*
 Ciclos
 */
package ciclos;

/**
 *
 * @author felipe
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 0;
       while(i<10){
           System.out.println(i);
           ++i;
       }
       
       System.out.println("\n");
       
       int j = 0;
       
       do{
           System.out.println(j);
           ++j;
       }while(j == 0);
       
        System.out.println("\n");
       
       for(int k=0;k<10;++k){
           System.out.println(k);
       }
    }
    
}
