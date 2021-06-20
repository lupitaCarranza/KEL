package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ingresos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        TextView textview;

        textview = findViewById(R.id.btn_reg_am1);
        textview.setOnClickListener(v -> {
            gas();
        });
    }

    private void gas(){
        Intent intent = new Intent(ingresos.this, gastos.class);
        startActivity(intent);
    }
}