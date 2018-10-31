package com.digitalhouse.recyclerviewpractica;

public class AndroidVersion {
    // Atributos
    private String nombre;
    private Integer imagen;

    // Constructor
    public AndroidVersion(String nombre, Integer imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    // GETTER AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "nombre='" + nombre + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
