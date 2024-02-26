package co.edu.sena;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del teclado

/**
 * Programa para sumar dos números ingresados por el usuario.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt(); 

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt(); 

        int suma = numero1 + numero2; 

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        
        scanner.close();
    }
}
