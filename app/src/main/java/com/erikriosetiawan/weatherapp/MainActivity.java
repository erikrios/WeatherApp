package com.erikriosetiawan.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewSunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSunny = findViewById(R.id.image);
        imageViewSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNightIntent = new Intent(MainActivity.this, NightActivity.class);
                startActivity(toNightIntent);

                Toast.makeText(MainActivity.this, "Beralih ke mode malam", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
