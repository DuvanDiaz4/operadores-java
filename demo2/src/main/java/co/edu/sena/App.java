package co.edu.sena;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del teclado

/**
 * Programa para calcular el cuadrado de un número ingresado por el usuario.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del teclado

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble(); // Leer el número desde el teclado

        double cuadrado = Math.pow(numero, 2); // Calcular el cuadrado del número usando la función Math.pow()

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
