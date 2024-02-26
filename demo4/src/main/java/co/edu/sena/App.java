package co.edu.sena;

import java.util.Scanner;

/**
 * Programa para calcular el área y el perímetro de un cuadrado.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double lado = scanner.nextDouble();

        
        double area = Math.pow(lado, 2);

       
        double perimetro = 4 * lado;

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        scanner.close();
    }
}
