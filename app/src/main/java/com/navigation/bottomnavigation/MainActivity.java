package com.navigation.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //Declaring variables
    BottomNavigationView bottomNavigationView;
    TextView textView;
    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing variables
        bottomNavigationView = findViewById(R.id.botton_navigation);
        textView = findViewById(R.id.text_view);
        frameLayout = findViewById(R.id.frame_containerj);

        //setting frame background color
        frameLayout.setBackgroundColor(Color.CYAN);
        textView.setText("Home");
        //action
        bottomNavigationView.setOnNavigationItemSelectedListener(nav);


    }

    //action function

    private BottomNavigationView.OnNavigationItemSelectedListener nav = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    frameLayout.setBackgroundColor(Color.CYAN);
                    textView.setText("Home");
                    break;
                case R.id.navigation_favourite:
                    frameLayout.setBackgroundColor(Color.MAGENTA);
                    textView.setText("Favourite");
                    break;
                case R.id.navigation_family:
                    frameLayout.setBackgroundColor(Color.DKGRAY);
                    textView.setText("Family");
                    break;
            }


            return true;
        }
    };
}