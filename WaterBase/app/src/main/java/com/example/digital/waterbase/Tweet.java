package com.example.digital.waterbase;

public class Tweet {
    private String nombre;
    private String apellido;
    private String tweet;
    private String id;

    public Tweet(){

    }

    public Tweet(String id,String nombre, String apellido, String tweet) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tweet = tweet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTweet() {
        return tweet;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tweet='" + tweet + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
