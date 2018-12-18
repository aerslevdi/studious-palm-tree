package com.example.digital.myapplication.Model;

import java.util.List;

public class ContenedoraColores {

    private List<MiColor> colores;

    public ContenedoraColores(List<MiColor> colores) {
        this.colores = colores;
    }

    public List<MiColor> getColores() {
        return colores;
    }

    @Override
    public String toString() {
        return "ContenedoraColores{" +
                "colores=" + colores +
                '}';
    }
}
