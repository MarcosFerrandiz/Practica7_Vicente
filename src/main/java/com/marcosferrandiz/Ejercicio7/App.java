package com.marcosferrandiz.Ejercicio7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Calculadora de Área - Seleccione una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            Figura figura = null;
            switch (option) {
                case 1:
                    figura = new Circle();
                    break;
                case 2:
                    figura = new Square();
                    break;
                case 3:
                    figura = new Triangle();
                    break;
                case 4:
                    figura = new Rectangle();
                    break;
                case 5:
                    figura = new Pentagon();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
        scanner.close();    }
}
