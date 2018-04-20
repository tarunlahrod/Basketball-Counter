package com.example.dabba.assign15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public int counterA=0,counterB=0;
    TextView scoreA;
    TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = (TextView) findViewById(R.id.t1);
        scoreB = (TextView) findViewById(R.id.t2);
    }

    public void p3a (View view)
    {
        counterA+=3;
        scoreA.setText(""+counterA);
    }

    public void p3b(View view)
    {
        counterB+=3;
        scoreB.setText(""+counterB);
    }

    public void p2a(View view)
    {
        counterA+=2;
        scoreA.setText(""+counterA);
    }

    public void p2b(View view)
    {
        counterB+=2;
        scoreB.setText(""+counterB);
    }

    public void fta(View view)
    {
        counterA++;
        scoreA.setText(""+counterA);
    }

    public void ftb(View view)
    {
        counterB++;
        scoreB.setText(""+counterB);
    }

    public void reset(View view)
    {
        counterA=0;
        counterB=0;
        scoreA.setText(""+counterA);
        scoreB.setText(""+counterB);
    }



}

