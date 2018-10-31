package com.example.digital.recyclerviewlist;

public class Pelicula {

    //Atributos

    private  String  titulo;
    private Integer imagen;
    private Integer valoracion;

    //Constructor


    public Pelicula(String titulo, Integer imagen, Integer valoracion) {
        this.titulo = titulo;
        this.imagen = imagen;
        if (valoracion>=0 && valoracion <=5) {
            this.valoracion = valoracion;
        }
    }

    //Getter/Setter


    public Integer getValoracion() {
        return valoracion;
    }

    public Integer getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setValoracion(Integer valoracion) {
        if (valoracion>=0 && valoracion <=5 ) {
            this.valoracion = valoracion;
        }
    }

    //Metodos


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", imagen=" + imagen +
                ", valoracion=" + valoracion +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        Pelicula otraPelicula = (Pelicula) obj;
        return this.titulo.equals(otraPelicula.getTitulo());
    }
}
