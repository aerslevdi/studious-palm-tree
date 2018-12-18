package com.example.digital.paginationpractica.dao;

import com.example.digital.paginationpractica.model.ContenedorPost;
import com.example.digital.paginationpractica.model.Post;
import com.example.digital.paginationpractica.util.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaoInternetPost extends DaoHelper{
    public static final String BASE_URL = "http://blooming-garden-41675.herokuapp.com/";
    private ServicePost servicePost;

    public DaoInternetPost() {
        super(BASE_URL);
        servicePost = retrofit.create(ServicePost.class);
    }
    //POR CADA METODO DEL SERVICE CREO UN METODO ASINCRONICO (LISTENERS)


    public void getContenedorPostFromInternet(Integer offset, Integer limit, final ResultListener<List<Post>> listenerController){
       Call<ContenedorPost> call = servicePost.getContenedorPost(offset, limit);
       call.enqueue(new Callback<ContenedorPost>() {
           @Override
           public void onResponse(Call<ContenedorPost> call, Response<ContenedorPost> response) {
               if (response.code()>= 200 && response.code()<300){
                   ContenedorPost contenedorPost = response.body();
                   listenerController.finish(contenedorPost.getResult());
               }
           }

           @Override
           public void onFailure(Call<ContenedorPost> call, Throwable t) {

           }
       });
    }
}
