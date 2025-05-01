package com.marcosferrandiz;

public class Trabajador implements TrabajadorInterfaz2 {
    private String nombre;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        //Metodos para trbajar, que espero que no trabaje mucho
    }
}
