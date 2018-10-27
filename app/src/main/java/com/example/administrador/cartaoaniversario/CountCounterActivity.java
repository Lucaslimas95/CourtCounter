package com.example.administrador.cartaoaniversario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CountCounterActivity extends AppCompatActivity {

    private TextView pontuacaoA;
    private TextView pontuacaoB;
    private String vencedor;
    private int somaA = 0;
    private int somaB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_counter);

        pontuacaoA = (TextView) findViewById(R.id.pontuacaoA);
        pontuacaoB = (TextView) findViewById(R.id.pontuacaoB);
    }

    public void addTeamA(View view){
        if(view.getId() == R.id.adcTresA)
            somaA += 3;
        else if(view.getId() == R.id.adcDoisA)
            somaA += 2;
        else if(view.getId() == R.id.freeA)
            somaA += 1;

        pontuacaoA.setText(String.valueOf(somaA));
    }

    public void addTeamB(View view){
        if(view.getId() == R.id.adcTresB)
            somaB += 3;
        else if(view.getId() == R.id.adcDoisB)
            somaB += 2;
        else if(view.getId() == R.id.freeB)
            somaB += 1;

        pontuacaoB.setText(String.valueOf(somaB));
    }

    public void reusltado(View view){
        Intent intent = new Intent(this, ResultadoActivity.class);
        if(somaA > somaB)
            vencedor = "Team A";
        else if(somaB > somaA)
            vencedor = "Team B";
        else
            vencedor = "Ninguem";
        intent.putExtra("RESULTADO", vencedor + "  Ganhou o Jogo!");
        startActivity(intent);
    }

    public void reset(View view){
        int zerar = 0;
        pontuacaoA.setText(String.valueOf(zerar));
        pontuacaoB.setText(String.valueOf(zerar));
    }
}
