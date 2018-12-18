package com.example.digitalhouse.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class DetailActivity extends AppCompatActivity {
    private Bundle unBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.digitalhouse.appbar.R.layout.activity_second);


        // Recibo el Intent
        Intent unIntent = getIntent();
        // Extraigo el Bundle
        unBundle = unIntent.getExtras();

        // Creo el Fragment
        Fragment unFragment2 = new Fragment2();
        // Le paso el Bundle al Fragment por Argumentos
        unFragment2.setArguments(unBundle);

        // Pido el fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Pido una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // Agrego el fragment en el contenedor
        fragmentTransaction.add(com.example.digitalhouse.appbar.R.id.rootSecondActivity, unFragment2);
        // Ejecuto la transaccion
        fragmentTransaction.commit();
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home){
////            NavUtils.navigateUpFromSameTask(this);
////            return true;
//
//            Intent upIntent = NavUtils.getParentActivityIntent(this);
//            if (NavUtils.shouldUpRecreateTask(this, upIntent)) {
//                // This activity is NOT part of this app's task, so create a new task
//                // when navigating up, with a synthesized back stack.
//                TaskStackBuilder.create(this)
//                        // Add all of this activity's parents to the back stack
//                        .addNextIntentWithParentStack(upIntent)
//                        // Navigate up to the closest parent
//                        .startActivities();
//            } else {
//                // This activity is part of this app's task, so simply
//                // navigate up to the logical parent activity.
//                NavUtils.navigateUpTo(this, upIntent);
//            }
//
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
