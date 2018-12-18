package com.digitalhouse.paginacion.controller;

import android.content.Context;

import com.digitalhouse.paginacion.dao.DaoInternetPost;
import com.digitalhouse.paginacion.model.Post;
import com.digitalhouse.paginacion.util.ResultListener;
import com.digitalhouse.paginacion.util.Util;

import java.util.List;
import java.util.PropertyResourceBundle;

public class PostController {
    private static final Integer LIMIT = 10;
    private Integer offset = 0;
    private Boolean isEnd = false;

    public Boolean getEnd() {
        return isEnd;
    }

    public void getContenedorPost(Context context, final ResultListener<List<Post>> listenerView) {
        if (Util.hayInternet(context)) {
            DaoInternetPost daoInternetPost = new DaoInternetPost();
            daoInternetPost.getContenedorPostFromInternet(offset, LIMIT, new ResultListener<List<Post>>() {
                @Override
                public void finish(List<Post> resultado) {
                    if (resultado.size() > 0){
                    offset = offset + LIMIT;
                    listenerView.finish(resultado);
                    }else {
                        isEnd = true;
                    }
                }
            });
        }
    }
    //RESETEAR CONTROLLER
    public void reset(){
        isEnd = false;
        offset = 0;
    }
}
