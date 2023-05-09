
package introjava;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    byte A;
    byte B;
  
    System.out.println("Ingresa los dos valores");
    A = input.nextByte();
    B = input.nextByte();
    
    byte C =  (byte) (A + B) ;
    
    System.out.println("La Suma de " +A+ " + " +B+ " es " +C );
    }
    
   
}