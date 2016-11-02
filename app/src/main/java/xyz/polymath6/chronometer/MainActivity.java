package xyz.polymath6.chronometer;


import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button myButtonStart = (Button) findViewById(R.id.buttonStart);
    Button myButtonStop = (Button) findViewById(R.id.buttonStop);
    Button myButtonRestart = (Button) findViewById(R.id.buttonRestart);
    Button myButtonSet = (Button) findViewById(R.id.buttonSet);
    Button myButtonClear = (Button) findViewById(R.id.buttonClear);
    Chronometer myFocus = (Chronometer) findViewById(R.id.chronometer1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                myFocus.start();
            }
        });

        myButtonStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                myFocus.stop();
            }
        });


        myButtonRestart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                myFocus.setBase(SystemClock.elapsedRealtime());
            }
        });


        myButtonSet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                myFocus.setFormat("Formated Time - %s");
            }
        });


        myButtonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                myFocus.setFormat(null);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
