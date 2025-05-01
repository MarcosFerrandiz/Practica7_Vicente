package com.marcosferrandiz.Ejercicio7;

public abstract class Figura {
    private double area;

    public abstract void calculateArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
