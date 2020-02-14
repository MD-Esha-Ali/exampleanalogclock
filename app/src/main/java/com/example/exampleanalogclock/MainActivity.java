package com.example.exampleanalogclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AnalogClock analogClock;
    @Override
    protected void onCreate(Bundle   savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.AnalogClockId){
            Toast.makeText(MainActivity.this,"Analog Clock is Clicked.",Toast.LENGTH_SHORT).show();
        }
    }
}
