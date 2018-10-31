package com.example.digital.pokedex;

public class Pokemon {
    //Atributos
    private String nombre;
    private Integer imagen;
    //Constructor

    public Pokemon(String nombre, Integer imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }


    //Getter/Setter

    public String getNombre() {
        return nombre;
    }

    public Integer getImagen() {
        return imagen;
    }


    //Metodos

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
