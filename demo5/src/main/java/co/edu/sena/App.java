package co.edu.sena;

import java.util.Scanner;

/**
 * Programa para calcular el área y el volumen de un cilindro.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingresar el radio de la base del cilindro (r)
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        //Ingresar la altura del cilindro (h)
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        //Calcular el área de la base del cilindro
        double areaBase = Math.PI * Math.pow(radio, 2);

        //Calcular el área lateral del cilindro
        double areaLateral = 2 * Math.PI * radio * altura;

        //Calcular el área total del cilindro
        double areaTotal = areaBase + areaLateral;

        //Calcular el volumen del cilindro
        double volumen = areaBase * altura;

        //Mostrar los resultados
        System.out.println("Área de la base del cilindro: " + areaBase);
        System.out.println("Área lateral del cilindro: " + areaLateral);
        System.out.println("Área total del cilindro: " + areaTotal);
        System.out.println("Volumen del cilindro: " + volumen);

        scanner.close();
    }
}
