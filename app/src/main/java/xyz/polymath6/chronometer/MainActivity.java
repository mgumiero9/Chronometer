package xyz.polymath6.chronometer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button myButtonStart = (Button) findViewById(R.id.buttonStart);
    Button myButtonStop = (Button) findViewById(R.id.buttonStop);
    Chronometer focus = (Chronometer) findViewById(R.id.chronometer1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, Chronometer.class);
        startActivity(intent);
    }
}
