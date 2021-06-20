package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class datos_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_perfil);

        TextView textview;

        textview = findViewById(R.id.btn_cancelar);
        textview.setOnClickListener(v -> {
            can();
        });
    }

    private void can() {
        Intent intentcan = new Intent(datos_perfil.this, MainActivity.class);
        startActivity(intentcan);
    }
}