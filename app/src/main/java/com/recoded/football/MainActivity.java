package com.recoded.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView teamA;
    TextView teamB;
    TextView yellowA;
    TextView redA;
    TextView yellowB;
    TextView redB;
    int scoreA = 0;
    int scoreB = 0;
    int yA = 0;
    int yB = 0;
    int rA = 0;
    int rb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = (TextView) findViewById(R.id.text2);
        teamB = (TextView) findViewById(R.id.text3);
        yellowA = (TextView) findViewById(R.id.yellowA);
        yellowB = (TextView) findViewById(R.id.yellowB);
        redA = (TextView) findViewById(R.id.redA);
        redB = (TextView) findViewById(R.id.redB);
    }

    public void TeamA(int score) {
        teamA.setText(String.valueOf(score));
    }


    public void goalA(View view) {
        scoreA++;
        TeamA(scoreA);
    }

    public void TeamB(int score) {
        teamB.setText(String.valueOf(score));
    }


    public void goalB(View view) {
        scoreB++;
        TeamB(scoreB);
    }

    public void YellowA(int score) {
        yellowA.setText(String.valueOf(score));
    }

    public void cardYA(View view) {
        yA++;
        YellowA(yA);
    }

    public void YellowB(int score) {
        yellowB.setText(String.valueOf(score));
    }

    public void cardYB(View view) {
        yB++;
        YellowB(yB);
    }

    public void RedA(int score) {
        redA.setText(String.valueOf(score));
    }

    public void cardRA(View view) {
        rA++;
        RedA(rA);
        if (rA == 4) {
            Toast.makeText(this, "Tean B wiiner :) .. ", Toast.LENGTH_LONG).show();
            rA = 3;
        }

    }

    public void RedB(int score) {
        redB.setText(String.valueOf(score));
    }

    public void cardRB(View view) {
        rb++;
        RedB(rb);
        if (rb == 4) {
            Toast.makeText(this, "Team A wiiner :) .. ", Toast.LENGTH_LONG).show();
            rb = 3;
        }
    }

    public void rest(View view) {
        scoreA = 0;
        scoreB = 0;
        yA = 0;
        yB = 0;
        rA = 0;
        rb = 0;
        TeamA(scoreA);
        TeamB(scoreB);
        YellowA(yA);
        YellowB(yB);
        RedA(rA);
        RedB(rb);
    }
}
