package com.example.trabalho_pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registro);
        setTitle("Ola, <nome do usuário>");
    }

    public void abrirTelaNovoRegistro(View view) {
        Intent intent = new Intent(this, NovoRegistro.class);
        startActivity(intent);
    }
}