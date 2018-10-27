package com.example.administrador.cartaoaniversario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView vencedor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        vencedor = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        vencedor.setText(bundle.getString("RESULTADO"));
    }
}
