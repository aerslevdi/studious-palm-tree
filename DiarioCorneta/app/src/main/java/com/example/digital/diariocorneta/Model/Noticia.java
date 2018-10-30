package com.example.digital.diariocorneta.Model;

import java.util.Date;

public class Noticia {

    //ATRIBUTOS

    private String title;
    private Date date = new Date();
    private String description;
    private String author;

    //CONSTRUCTOR


    public Noticia(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    //SETTER / GETTER


    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    //METODOS

    @Override
    public String toString() {
        return "Noticia {" + title + "\'" + date + "\'" + description + "\'" + author + "}";
    }
}
