package com.example.kelfinanzas;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class primera_pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);
        TextView textview,textview2;

        textview = findViewById(R.id.btn_ir_login);
        textview.setOnClickListener(v -> {
            login();
        });
        textview2 = findViewById(R.id.btn_ir_registro);
        textview2.setOnClickListener(v ->{
            registro();
        });

    }

    private void login(){
        Intent intentlog = new Intent(primera_pantalla.this, login.class);
        startActivity(intentlog);
    }

    private void registro(){
        Intent intentreg = new Intent(primera_pantalla.this, registro.class);
        startActivity(intentreg);
    }
}