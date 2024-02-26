package co.edu.sena;

import java.util.Scanner;

/**
 * Programa para calcular la longitud y el área de una circunferencia,
y del circulo inscrito
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingresar el radio de la circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        //Calcular la longitud de la circunferencia (2 * pi * radio)
        double longitudCircunferencia = 2 * Math.PI * radio;

        //Calcular el área de la circunferencia (pi * radio^2)
        double areaCircunferencia = Math.PI * Math.pow(radio, 2);

        //Calcular el área del círculo inscrito (pi * radio^2)
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2);

        //Mostrar los resultados
        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);
        System.out.println("Área de la circunferencia: " + areaCircunferencia);
        System.out.println("Área del círculo inscrito: " + areaCirculoInscrito);

        scanner.close();
    }
}
