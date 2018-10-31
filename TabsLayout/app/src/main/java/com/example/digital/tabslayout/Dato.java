package com.example.digital.tabslayout;

public class Dato {

    private String title;
    private Integer image;
    private String color;


    public Dato(String title, Integer image, String color) {
        this.title = title;
        this.image = image;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public Integer getImage() {
        return image;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
