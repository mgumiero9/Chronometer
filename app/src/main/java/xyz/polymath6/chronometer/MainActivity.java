package xyz.polymath6.chronometer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button myButtonStart, myButtonStop, myButtonRestart, myButtonSet, myButtonClear;
    Chronometer myFocus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonStart = (Button) findViewById(R.id.buttonStart);
        myButtonStop = (Button) findViewById(R.id.buttonStop);
        myButtonRestart = (Button) findViewById(R.id.buttonRestart);
        myButtonSet = (Button) findViewById(R.id.buttonSet);
        myButtonClear = (Button) findViewById(R.id.buttonClear);
        myFocus = (Chronometer) findViewById(R.id.chronometer1);

        myButtonStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                 myFocus.start();
            }
        });

        myButtonStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myFocus.stop();
            }
        });

        myButtonRestart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myFocus.setBase(SystemClock.elapsedRealtime());
            }
        });

        myButtonSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myFocus.setFormat("Formated Time - %s");
            }
        });

        myButtonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myFocus.setFormat(null);
            }
        });
    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
}
