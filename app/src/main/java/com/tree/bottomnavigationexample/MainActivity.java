package com.tree.bottomnavigationexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_monster,
                R.id.navigation_slug,
                R.id.navigation_pizza,
                R.id.navigation_cake).build();

        NavigationUI.setupActionBarWithNavController(MainActivity.this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}