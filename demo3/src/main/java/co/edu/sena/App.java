package co.edu.sena;

import java.util.Scanner;

/**
 * Programa para convertir una cantidad de euros a dólares.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();

        
        double tasaCambio = 0.92;

        double dolares = euros * tasaCambio;

        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");

        scanner.close();
    }
}
