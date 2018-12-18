package com.digitalhouse.viewpager;

public class Dato {
    // Atributo
    private String title;
    private Integer image;
    private String color;

    // Constructor
    public Dato(String title, Integer image, String color) {
        this.title = title;
        this.image = image;
        this.color = color;
    }

    // Getter
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
        return "Dato{" +
                "title='" + title + '\'' +
                ", image=" + image +
                ", color='" + color + '\'' +
                '}';
    }
}
