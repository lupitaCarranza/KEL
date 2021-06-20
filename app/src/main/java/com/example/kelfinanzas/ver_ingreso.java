package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ver_ingreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ingreso);

        TextView textview;

        textview = findViewById(R.id.btn_reg_am1);
        textview.setOnClickListener(v -> {
            reg1();
        });
    }

    private void reg1(){
        Intent intent = new Intent(ver_ingreso.this, MainActivity.class);
        startActivity(intent);
    }
}