package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.activities.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Home extends BaseActivity {


    BottomNavigationView bnv;

    FirebaseDatabase pointsdb;
    DatabaseReference pointsref;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupToolbar();
        setTitle("Home");

        bnv = findViewById(R.id.bottom_navigation);
        bnv.getMenu().findItem(R.id.action_book).setChecked(true);

        getSupportFragmentManager().beginTransaction().replace(R.id.RLhome, new Explore()).commit();
    }
}
