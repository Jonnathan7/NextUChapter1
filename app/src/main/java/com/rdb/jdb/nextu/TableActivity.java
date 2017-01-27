package com.rdb.jdb.nextu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    private TextView mensaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        mensaje2 = (TextView)findViewById(R.id.tv32);
        String cadena = getIntent().getStringExtra("nombre");
        mensaje2.setText("Bienvennido a la segunda Activity: " + cadena);
    }

}
