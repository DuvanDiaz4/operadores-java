package co.edu.sena;

import java.util.Scanner;

/**
 * Programa para calcular el promedio de tres números.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Ingresar los tres números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Paso 2: Calcular el promedio (suma de los números / cantidad de números)
        double promedio = (numero1 + numero2 + numero3) / 3;

        // Paso 3: Mostrar el resultado
        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close();
    }
}
