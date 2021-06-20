package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class gastos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        TextView textview;

        textview = findViewById(R.id.btn_add3);
        textview.setOnClickListener(v -> {
            tons();
        });
    }

    private void tons(){
        Intent intent = new Intent(gastos.this, exitoso_registro.class);
        startActivity(intent);
    }
}