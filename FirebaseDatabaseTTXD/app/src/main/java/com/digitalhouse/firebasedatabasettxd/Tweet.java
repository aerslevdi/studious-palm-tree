package com.digitalhouse.firebasedatabasettxd;

public class Tweet {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private String lastTweet;

    // CONSTRUCTOR VACIO (NECESARIO PARA FIREBASE)
    public Tweet(){

    }

    // CONSTRUCTOR
    public Tweet(String nombre, String apellido, String lastTweet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.lastTweet = lastTweet;
    }

    /// GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLastTweet() {
        return lastTweet;
    }


    @Override
    public String toString() {
        return "Tweet{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", lastTweet='" + lastTweet + '\'' +
                '}';
    }
}
