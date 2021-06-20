package com.example.kelfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview,perfil,gts,graf;

        perfil = findViewById(R.id.btn_ir_datos_perfil);
        perfil.setOnClickListener(v -> {
            per();
        });

        textview = findViewById(R.id.btn_ir_ing);
        textview.setOnClickListener(v -> {
            vering();
        });

        gts = findViewById(R.id.btn_ir_gas);
        gts.setOnClickListener(v -> {
            vergts();
        });

        graf = findViewById(R.id.btn_ir_grafica);
        graf.setOnClickListener(v -> {
            vergraf();
        });
    }

    private void per(){
        Intent intentper = new Intent(MainActivity.this, datos_perfil.class);
        startActivity(intentper);
    }
    private void vering(){
        Intent intentvi = new Intent(MainActivity.this, ver_ingreso.class);
        startActivity(intentvi);
    }
    private void vergts(){
        Intent intentvg = new Intent(MainActivity.this, ver_gastos.class);
        startActivity(intentvg);
    }

    private void vergraf(){
        Intent intentgraf = new Intent(MainActivity.this, grafica.class );
        startActivity(intentgraf);
    }
}