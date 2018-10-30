package com.example.digital.diariocorneta.DAO;

import com.example.digital.diariocorneta.Model.Noticia;

import java.util.ArrayList;
import java.util.List;

public class DAOInternet {

    public List<Noticia> obtenerListaDeNoticias(){

        List<Noticia> noticias = new ArrayList<>();
        noticias.add(new Noticia("Llueve", "Llueve", "Yo"));
        noticias.add(new Noticia("Nieva","Nieva", "Yo"));
        noticias.add(new Noticia("Llueven sapos", "Llueven sapos", "Yo"));
        noticias.add(new Noticia("Tsunami", "Tsunami", "Yo"));
        noticias.add(new Noticia("Tornado", "Tornado", "Yo"));
        noticias.add(new Noticia("Tifon", "Tifon", "Yo"));
        noticias.add(new Noticia("Niebla", "Niebla", "Yo"));
        noticias.add(new Noticia("Apocalipsis", "Apocalipsis", "Yo"));



        return noticias;
    }
}
