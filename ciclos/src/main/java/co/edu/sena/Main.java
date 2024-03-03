package co.edu.sena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1: Múltiplos de 3 entre 1 y 100
        System.out.println("Ejemplo 1: Múltiplos de 3 entre 1 y 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // Ejemplo 2: Números impares entre 0 y 100
        System.out.println("Ejemplo 2: Números impares entre 0 y 100");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Ejemplo 3: Números pares entre 1 y 100
        System.out.println("Ejemplo 3: Números pares entre 1 y 100");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Ejemplo 4: Cuadrados de los números del 1 al 30
        System.out.println("Ejemplo 4: Cuadrados de los números del 1 al 30");
        for (int i = 1; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
        }
        System.out.println("\n");

        // Ejemplo 5: Suma de los cuadrados de los primeros cien números naturales
        System.out.println("Ejemplo 5: Suma de los cuadrados de los primeros cien números naturales");
        int sumaCuadrados = 0;
        for (int i = 1; i <= 100; i++) {
            sumaCuadrados += i * i;
        }
        System.out.println("La suma de los cuadrados es: " + sumaCuadrados + "\n");

        // Ejemplo 6: Números entre dos valores en secuencia ascendente
        System.out.println("Ejemplo 6: Números entre dos valores en secuencia ascendente");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número (mayor que el primero): ");
        int num2 = scanner.nextInt();
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Ejemplo 7: Suma de números ingresados por teclado hasta que se digite cero
        System.out.println("Ejemplo 7: Suma de números ingresados por teclado hasta que se digite cero");
        int sumaTeclado = 0;
        int numeroTeclado;
        do {
            System.out.print("Ingrese un número (ingrese 0 para terminar): ");
            numeroTeclado = scanner.nextInt();
            sumaTeclado += numeroTeclado;
        } while (numeroTeclado != 0);
        System.out.println("La suma de los números ingresados es: " + sumaTeclado);

        scanner.close();
    }
}
