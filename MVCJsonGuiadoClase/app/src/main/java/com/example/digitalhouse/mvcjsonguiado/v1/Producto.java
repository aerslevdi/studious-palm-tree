package com.example.digitalhouse.mvcjsonguiado.v1;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class Producto {
    private String nombre;
    private String descripcion;
    private Double precio;

    public Producto(String nombre, String descripcion, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
