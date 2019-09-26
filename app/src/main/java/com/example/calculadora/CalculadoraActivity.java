package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener{
    OperacaoActivity operacao;
    EditText valorUm, valorDois;
    Button btnSoma, btnSubtrai, btnDivide, btnMultiplica, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        operacao = new OperacaoActivity();

        valorUm = findViewById(R.id.valorUm);
        valorDois = findViewById(R.id.valorDois);
        btnSoma = findViewById(R.id.btnSoma);
        btnSubtrai = findViewById(R.id.btnSubtrai);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

        valorUm.setError("Informe um Valor");
        valorDois.setError("Informe um Valor");

        btnSoma.setOnClickListener(new View.OnClickListener() {

            String retorno = "";

            @Override
            public void onClick(View v) {
                obterDados();

                retorno = (String.valueOf(operacao.soma()));

                Toast.makeText(CalculadoraActivity.this, "Operação: Adição!" + "\n" + "Resultado:" + "(" + retorno + ")", Toast.LENGTH_LONG).show();

            }
        });

        btnSubtrai.setOnClickListener(new View.OnClickListener() {

            String retorno = "";
            @Override
            public void onClick(View v) {

                obterDados();

                retorno = (String.valueOf(operacao.subtrai()));

                Toast.makeText(CalculadoraActivity.this, "Operação: Subtração!" + "\n" + "Resultado:" + "(" + retorno +")",Toast.LENGTH_LONG).show();

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {

            String retorno = "";
            @Override
            public void onClick(View v) {

                obterDados();

                retorno = (String.valueOf(operacao.divide()));

                Toast.makeText(CalculadoraActivity.this, "Operação: Divisão!" + "\n" + "Resultado:" + "(" + retorno +")",Toast.LENGTH_LONG).show();

            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {

            String retorno = "";
            @Override
            public void onClick(View v) {

                obterDados();

                retorno = (String.valueOf(operacao.multiplica()));

                Toast.makeText(CalculadoraActivity.this, "Operação: Multiplicação!" + "\n" + "Resultado:" + "(" + retorno +")",Toast.LENGTH_LONG).show();

            }
        });
    }

    private void abrirTela(Class tela) {
        // Intent - Criando um caminho para abrir uma nova tela
        Intent intent = new Intent(CalculadoraActivity.this, tela);
        // Abrindo tela
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if ( v == btnVoltar)
            abrirTela(MainActivity.class);
    }

    private void obterDados() {
        operacao.setA(Integer.parseInt(valorUm.getText().toString()));
        operacao.setB(Integer.parseInt(valorDois.getText().toString()));
    }

}
