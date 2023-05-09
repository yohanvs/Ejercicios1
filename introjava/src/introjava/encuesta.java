
package introjava;

import java.util.Scanner;

public class encuesta {

        
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Preguntar al usuario por el nombre de la película
    System.out.println("Por favor, ingresa el nombre de la película: ");
    String pelicula = input.nextLine();

    int calificacion;
    do {
        // Preguntar al usuario por la calificación de la película
        System.out.println("¿Cómo calificas la película del 1 al 5?: ");
        calificacion = input.nextInt();
// Verificar si la calificación es válida
        if (calificacion < 1 || calificacion > 5) {
            System.out.println("Por favor, ingresa una calificación válida del 1 al 5.");
        }
    } while (calificacion < 1 || calificacion > 5);

    // Mostrar un mensaje de acuerdo a la calificación
    switch (calificacion) {
        case 1: System.out.println("Lo siento mucho que no te haya gustado " + pelicula);
        case 2: System.out.println("Gracias por tu opinión sobre " + pelicula);
        case 3: System.out.println("¡Está bien! A algunas personas les gustó " + pelicula);
        case 4: System.out.println("¡Genial! Me alegro de que te haya gustado " + pelicula);
        case 5: System.out.println("¡Excelente! " + pelicula + " es una gran película");
    }
}
}
    

