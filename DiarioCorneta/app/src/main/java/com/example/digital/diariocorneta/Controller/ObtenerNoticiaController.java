package com.example.digital.diariocorneta.Controller;

import com.example.digital.diariocorneta.DAO.DAOArchivo;
import com.example.digital.diariocorneta.DAO.DAOInternet;
import com.example.digital.diariocorneta.Model.Noticia;

import java.util.List;

public class ObtenerNoticiaController {

    public List<Noticia> obtenerNoticias() {
        List<Noticia> noticias;

        if (hayInternet()){
            DAOInternet daoInternet = new DAOInternet();
            noticias = daoInternet.obtenerListaDeNoticias();
        } else {
            DAOArchivo daoArchivo = new DAOArchivo();
            noticias = daoArchivo.obtenerListaDeNoticiasDeArchivo();

        }
        return noticias;
    }
    public boolean hayInternet(){
        return true;
    }
}
