package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textview;

        textview = findViewById(R.id.login);
        textview.setOnClickListener(v -> {
            prin();
        });
    }
    private void prin(){
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity(intent);
    }
}