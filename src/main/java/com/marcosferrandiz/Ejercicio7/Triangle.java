// Triangle.java
package com.marcosferrandiz.Ejercicio7;

import java.util.Scanner;

public class Triangle extends Figura {
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
    }
}