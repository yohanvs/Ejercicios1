/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author i5
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Scanner leer = new Scanner(System.in);
    boolean verdadero = leer.nextBoolean() ;
    double midouble = leer.nextDouble();
    char miChar = leer.next().charAt(0);
    System.out.println("El valor del booleano es: " + verdadero);
    System.out.println("Mi Double es: " +midouble);
    System.out.println("Mi char es: " +miChar);
    
    
    
    
    }
    

}