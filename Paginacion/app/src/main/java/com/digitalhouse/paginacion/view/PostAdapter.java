package com.digitalhouse.paginacion.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitalhouse.paginacion.R;
import com.digitalhouse.paginacion.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {
    private List<Post> postList = new ArrayList<>();
    public void cargarDatos(List<Post>posts){
        postList.addAll(posts);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_layout, viewGroup, false);
        return new PostHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder postHolder, int i) {
        Post post = postList.get(i);
        postHolder.cargar(post);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostHolder extends RecyclerView.ViewHolder{
        private TextView textViewTitle;
        private TextView textViewBody;

        public PostHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewBody = itemView.findViewById(R.id.textViewBody);
        }

        public void cargar(Post post){
            textViewTitle.setText(post.getTitle());
            textViewBody.setText(post.getBody());
        }
    }

    public void reset(){
        postList = new ArrayList<>();
        notifyDataSetChanged();
    }
}
