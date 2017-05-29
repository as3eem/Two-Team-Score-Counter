package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        public void plusThreeScoreA(View v){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);

    }


    public void resetToZero(View v) {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    public void plusTwoScoreA(View v){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);

    }
    public void plusOneScoreA(View v){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void plusThreeScoreB(View v){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    public void plusTwoScoreB(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    public void plusOneScoreB(View v){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    /**
         * Displays the given score for Team A.
         */
        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    }

