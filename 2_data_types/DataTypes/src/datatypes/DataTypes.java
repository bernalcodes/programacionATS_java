/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatypes;

/**
 *
 * @author felipe
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte var_byte = 12;
        short var_short = 12456;
        int var_int = 1245656;
        long var_long = 124565667;
        float var_float = 3.45f; // necesario usar la f
        double var_double = 3.4523421;
        char var_char = 'a';
        boolean var_bool = true;
        
        System.out.println("Variable byte: "+var_byte);
        System.out.println("Variable short: "+var_short);
        System.out.println("Variable int: "+var_int);
        System.out.println("Variable long: "+var_long);
        System.out.println("Variable float: "+var_float);
        System.out.println("Variable double: "+var_double);
        System.out.println("Variable char: "+var_char);
        System.out.println("Variable bool: "+var_bool);    
        
        // tipos de datos no primitivos
        Integer var_Integer = null; // null -> variable vacia
        String var_String = "Hola mundo";
        
        System.out.println("Variable Integer: "+var_Integer);
        System.out.println("Variable String: "+var_String);
        System.out.println("var_String.getBytes() = "+var_String.getBytes());
        
        // constantes
        final int CURRENT_YEAR = 2022;
        System.out.println("Variable constante: "+CURRENT_YEAR);
    }
}
