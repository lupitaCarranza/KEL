package com.example.kelfinanzas;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;


public class primera_pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);
        TextView textView,textView2;


        textView = findViewById(R.id.btn_ir_login);
        textView.setOnClickListener(v -> {

            Intent intent1 = new Intent(primera_pantalla.this, login.class);
            startActivity(intent1);
            Toast.makeText(primera_pantalla.this, "INICIA SESIÓN", Toast.LENGTH_LONG).show();

        });

        textView2 = findViewById(R.id.btn_ir_registro);
        textView2.setOnClickListener(v -> {

            Intent intent2 = new Intent(primera_pantalla.this, registro.class);
            startActivity(intent2);
            Toast.makeText(primera_pantalla.this, "REGISTRATE", Toast.LENGTH_LONG).show();

        });

        /*textview = findViewById(R.id.btn_ir_login);
        textview.setOnClickListener(v -> {
            //login();
            Intent intentlog = new Intent(primera_pantalla.this, login.class);
            startActivity(intentlog);
        });

        textview2 = findViewById(R.id.btn_ir_registro);
        textview2.setOnClickListener(v ->{
            //registro();
            Intent intentreg = new Intent(primera_pantalla.this, registro.class);
            startActivity(intentreg);
        });*/

    }

    /*private void login(){
        Intent intentlog = new Intent(primera_pantalla.this, login.class);
        startActivity(intentlog);
    }

    private void registro(){
        Intent intentreg = new Intent(primera_pantalla.this, registro.class);
        startActivity(intentreg);
    }*/
}