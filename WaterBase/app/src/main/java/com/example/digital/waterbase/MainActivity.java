package com.example.digital.waterbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabase= FirebaseDatabase.getInstance();
        DatabaseReference raiz = mDatabase.getReference();
        DatabaseReference timeLine =  raiz.child("timeLine");
        DatabaseReference id = timeLine.push();
        id.setValue(new Tweet(id.getKey(),"Juan", "Ann", "ihaidsuaaaaaaaaaaadoasihodais"));
        //timeLine.addListenerForSingleValueEvent(new ValueEventListener() {
      //      @Override
        // for (DataSnapshot childSnapShot: dataSnapshot.getChildren()){
           //         Tweet tweet = childSnapShot.getValue(Tweet.class);
             //       Toast.makeText(MainActivity.this, tweet.toString(), Toast.LENGTH_LONG).show();

               // }
            //}

            //@Override
            //public void onCancelled(DatabaseError databaseError) {

            //}
        //});
    }
}
