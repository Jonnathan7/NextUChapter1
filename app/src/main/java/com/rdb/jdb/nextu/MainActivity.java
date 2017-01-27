package com.rdb.jdb.nextu;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.rdb.jdb.gnlibrary.JbasicLibrary;


import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private ListView listar_sensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = (TextView) findViewById(R.id.textview1);
        texto.setText(R.string.singer);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> sensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        listar_sensores = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<Sensor> arrayAdapter  = new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, sensores);
        listar_sensores.setAdapter(arrayAdapter);

        Log.i("Texto", JbasicLibrary.texto);

//        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE),
//                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
//        String valor = "";
//        valor += event.values[0] + "C";

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
