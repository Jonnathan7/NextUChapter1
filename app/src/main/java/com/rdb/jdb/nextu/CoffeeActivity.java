package com.rdb.jdb.nextu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CoffeeActivity extends AppCompatActivity {

    private TextView entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        entrada = (TextView)findViewById(R.id.tvEntrada);
        String strCadena = getIntent().getStringExtra("fullName");
        entrada.setText("Welcome " + strCadena);
    }
}
