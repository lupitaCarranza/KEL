package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        TextView textview;

        textview = findViewById(R.id.btn_ir_bg);
        textview.setOnClickListener(v -> {
            balance();
        });
    }

    private void balance(){
        Intent intent = new Intent(registro.this, balance_general.class);
        startActivity(intent);
    }
}