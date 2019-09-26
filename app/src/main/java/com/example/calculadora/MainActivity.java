package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnCalculadora = findViewById(R.id.btnCalculadora);

    btnCalculadora.setOnClickListener(this);

    }

    private void abrirTela(Class tela) {
        // Intent - Criando um caminho para abrir uma nova tela
        Intent intent = new Intent(MainActivity.this, tela);
        // Abrindo tela
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if ( v == btnCalculadora)
            abrirTela(CalculadoraActivity.class);
    }
}
