package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ver_gastos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_gastos);

        TextView textview;

        textview = findViewById(R.id.btn_reg_am2);
        textview.setOnClickListener(v -> {
            reg2();
        });
    }
    private void reg2(){
        Intent intent = new Intent(ver_gastos.this, MainActivity.class);
        startActivity(intent);
    }
}