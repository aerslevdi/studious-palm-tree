package com.example.digital.diariocorneta.DAO;

import com.example.digital.diariocorneta.Model.Noticia;

import java.util.ArrayList;
import java.util.List;

public class DAOArchivo {
    public List<Noticia> obtenerListaDeNoticiasDeArchivo (){
        List<Noticia> noticias = new ArrayList<>();
        noticias.add(new Noticia("Whoop whoop", "That's the sound of da police", "Yo"));
        noticias.add(new Noticia("Shot through the heart","And you're to blame", "Yo"));
        noticias.add(new Noticia("I love rock'n'roll", "So put another dime in the jukebox, baby", "Yo"));
        noticias.add(new Noticia("We will, we will", "ROCK YOU!", "Yo"));
        noticias.add(new Noticia("Good golly, miss Molly", "sure like to ball ", "Yo"));
        noticias.add(new Noticia("It ain't me, it ain't me", "Ain't no fortunate son, no", "Yo"));
        noticias.add(new Noticia("I believe in a thing called love", "Just listen to the rhythm of my heart", "Yo"));
        noticias.add(new Noticia("I wanna rock!", "ROCK!", "Yo"));


        return noticias;
    }
}
