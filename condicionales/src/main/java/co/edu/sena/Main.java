package co.edu.sena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1: Determinar si un número ingresado es positivo o negativo
        System.out.print("Ejemplo 1: Ingrese un número: ");
        int numero1 = scanner.nextInt();
        if (numero1 > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero1 == 0) {
            System.out.println("El número ingresado es cero.");
        } else {
            System.out.println("El número ingresado es negativo.");
        }
        System.out.println();

        // Ejemplo 2: Determinar el mayor y menor de dos números
        System.out.print("Ejemplo 2: Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Ambos números son iguales.");
        } else if (num1 > num2) {
            System.out.println("El mayor es " + num1 + " y el menor es " + num2 + ".");
        } else {
            System.out.println("El mayor es " + num2 + " y el menor es " + num1 + ".");
        }
        System.out.println();

        // Ejemplo 3: Encontrar el menor y mayor de tres números
        System.out.print("Ejemplo 3: Ingrese el primer número: ");
        int numA = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numB = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numC = scanner.nextInt();
        int min = numA;
        int max = numA;
        if (numB < min) min = numB;
        if (numC < min) min = numC;
        if (numB > max) max = numB;
        if (numC > max) max = numC;
        System.out.println("El menor de los tres números es: " + min);
        System.out.println("El mayor de los tres números es: " + max);
        System.out.println();

        // Ejemplo 4: Determinar si un año es bisiesto
        System.out.print("Ejemplo 4: Ingrese un año: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
        System.out.println();

        // Ejemplo 5: Sumar dos números si al menos uno de ellos es negativo, en caso contrario multiplicarlos
        System.out.print("Ejemplo 5: Ingrese el primer número: ");
        int numX = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numY = scanner.nextInt();
        if (numX < 0 || numY < 0) {
            int suma = numX + numY;
            System.out.println("La suma de los números es: " + suma);
        } else {
            int producto = numX * numY;
            System.out.println("El producto de los números es: " + producto);
        }
        System.out.println();

        // Ejemplo 6: Determinar el cociente entre dos números, considerando división por cero
        System.out.print("Ejemplo 6: Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();
        if (denominador == 0) {
            System.out.println("Error: La división por cero no está definida.");
        } else {
            double cociente = (double) numerador / denominador;
            System.out.println("El cociente es: " + cociente);
        }
        System.out.println();

        // Ejemplo 7: Dados dos números A y B, sumarlos si A es menor que B o sino restarlos
        System.out.print("Ejemplo 7: Ingrese el número A: ");
        int numA7 = scanner.nextInt();
        System.out.print("Ingrese el número B: ");
        int numB7 = scanner.nextInt();
        if (numA7 < numB7) {
            int sumaResta = numA7 + numB7;
            System.out.println("La suma de A y B es: " + sumaResta);
        } else {
            int resta = numA7 - numB7;
            System.out.println("La resta de A y B es: " + resta);
        }

        scanner.close();
    }
}
