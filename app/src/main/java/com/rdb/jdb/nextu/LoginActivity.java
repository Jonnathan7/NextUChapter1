package com.rdb.jdb.nextu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView mensaje;
    private EditText entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mensaje = (TextView)findViewById(R.id.tvMensaje);
        entrada = (EditText)findViewById(R.id.etInput);

        /*
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://microsoft.com"));
        startActivity(intent);
        */
/*
        Intent intent1 = new Intent(Intent.ACTION_DIAL);
        startActivity(intent1);*/
        /*
        Intent intent2 = new Intent(Intent.ACTION_WEB_SEARCH);
        startActivity(intent2);*/

        //Intent callIntent = new Intent(Intent.ACTION_DIAL);
        //callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_NO_USER_ACTION);
        //callIntent.setData(Uri.parse("tel://979340749"));
        //startActivity(callIntent);
    }

    public void mostrarMensaje(View view)
    {
        String strCadena = getString(R.string.cadena) + " " + entrada.getText();
        mensaje.setText(strCadena);
    }

    public void navegacion(View view)
    {
        Intent intent = new Intent(this, TableActivity.class);
        intent.putExtra("nombre", entrada.getText().toString());
        startActivity(intent);
    }

    public void navegacion2(View view)
    {
        Intent intent = new Intent(this, CoffeeActivity.class);
        intent.putExtra("fullName", entrada.getText().toString());
        startActivity(intent);
    }

    public void onClickLlamada(View v) {

        //Intent i = new Intent(android.content.Intent.ACTION_DIAL,
          //      Uri.parse("tel:+3748593458")); //

        try {
            Intent i = new Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:+51979340717"));
            startActivity(i);
        }
        catch (SecurityException ex){
            Toast.makeText(this, "No se pude realizar la llamada", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMapa(View v) {
        float latitude = 37.456456f;
        float longitude = -156.8767f;
        String url = String.format("geo:%f, %f", latitude, longitude);
        Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(url));
        startActivity(i);
    }
}
