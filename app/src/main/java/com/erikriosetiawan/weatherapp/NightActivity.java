package com.erikriosetiawan.weatherapp;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class NightActivity extends AppCompatActivity {

    ImageView imageViewNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.colorTextOne));
        }

        imageViewNight = findViewById(R.id.image);
        imageViewNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSunnyIntent = new Intent(NightActivity.this, MainActivity.class);
                startActivity(toSunnyIntent);

                Toast.makeText(NightActivity.this, "Beralih ke mode siang", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
