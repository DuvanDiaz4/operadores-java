package co.edu.sena;

import java.util.Scanner; 

/**
 * Programa para calcular el cuadrado de un número ingresado por el usuario.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble(); 

        double cuadrado = Math.pow(numero, 2); 

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
