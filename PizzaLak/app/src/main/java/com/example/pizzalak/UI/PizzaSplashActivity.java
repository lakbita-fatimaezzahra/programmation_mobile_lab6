package com.example.pizzalak.UI;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzalak.R;

public class PizzaSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ignored) {}

            startActivity(new Intent(PizzaSplashActivity.this, ListPizzaActivity.class));
            finish();
        });

        thread.start();
    }
}