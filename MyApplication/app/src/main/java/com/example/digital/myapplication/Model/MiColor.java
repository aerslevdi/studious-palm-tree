package com.example.digital.myapplication.Model;

public class MiColor {
    private String nombre;
    private String codigo;

    public MiColor(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "MiColor{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
