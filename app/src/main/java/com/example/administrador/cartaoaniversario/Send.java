package com.example.administrador.cartaoaniversario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Send extends AppCompatActivity {

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        textResult = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        textResult.setText(bundle.getString("MEUTEXTO"));
    }


}
