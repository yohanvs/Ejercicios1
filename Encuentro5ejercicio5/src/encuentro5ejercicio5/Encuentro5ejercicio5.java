
package encuentro5ejercicio5;

import java.util.Scanner;


public class Encuentro5ejercicio5 {

    
public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese un valor entero");
    int num1 = leer.nextInt();
    System.out.println("Ingrese otro valor entero");
    int num2 = leer.nextInt();

    if (num1 < 45) {
        System.out.println("El valor de " +num1+ " es menor a 45");
        }else {
            System.out.println("El valor de " +num1+ " es mayor a 45");
            
            }
    
    if (num2 < 45) {
        System.out.println("El valor de " +num2+  " es menor a 45");
        }else {
            System.out.println("El valor de " +num2+ " es mayor a 45");
            
            }
    
 }
} 
        
    
    

