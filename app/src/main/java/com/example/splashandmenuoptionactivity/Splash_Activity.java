package com.example.splashandmenuoptionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    sleep(5000);
                } catch (Exception e) {
                    Toast.makeText(Splash_Activity.this, "e.getMessage()", Toast.LENGTH_SHORT).show();
                } finally {
                    Intent intent = new Intent(Splash_Activity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();



    }
}