package com.digitalhouse.paginacion.view;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.digitalhouse.paginacion.R;
import com.digitalhouse.paginacion.controller.PostController;
import com.digitalhouse.paginacion.model.Post;
import com.digitalhouse.paginacion.util.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PostAdapter adapter;
    private PostController postController;
    private Boolean isLoading = false;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                adapter.reset();
                postController.reset();
                loadPost();

            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new PostAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (postController.getEnd()) {
                    return;
                }
                Integer total = linearLayoutManager.getItemCount();
                Integer lastItem = linearLayoutManager.findLastVisibleItemPosition();
                if (lastItem +3 <= total && !isLoading){
                    loadPost();
                }
            }
        });


        postController = new PostController();
        loadPost();
    }
    public void loadPost(){
        isLoading = true;
        postController.getContenedorPost(this, new ResultListener<List<Post>>() {
            @Override
            public void finish(List<Post> resultado) {
                adapter.cargarDatos(resultado);
                isLoading = false;
                swipeRefreshLayout;

            }
        });
    }
}
