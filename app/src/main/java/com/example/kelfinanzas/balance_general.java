package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class balance_general extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_general);

        TextView textview;

        textview = findViewById(R.id.btn_balance_gen);
        textview.setOnClickListener(v -> {
            ing();
        });
    }

    private void ing(){
        Intent intent = new Intent(balance_general.this, ingresos.class);
        startActivity(intent);
    }
}