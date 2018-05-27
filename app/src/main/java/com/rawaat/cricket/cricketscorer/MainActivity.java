package com.rawaat.cricket.cricketscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int ballsA = 0;
    int ballsB = 0;
    int oversA = 0;
    int oversB = 0;
    int[] team = new int[5000];
    int Tn = 0;
    int[] lastScoreA = new int[5000];
    int[] lastBallA = new int[5000];
    int An = 0;
    int[] lastScoreB = new int[5000];
    int[] lastBallB = new int[5000];
    int Bn = 0;

    private AdView adView;

    public void undo(View view){
        if(scoreA == 0 && scoreB == 0 && ballsA == 0 && ballsB == 0)
            return;

        if(Tn != 0)
            Tn--;
        if(team[Tn] == 1){
            if(An != 0)
                An--;
            scoreA = scoreA - lastScoreA[An];
            ballsA = ballsA - lastBallA[An];

            displayBallsTeamA(ballsA);
            displayForTeamA(scoreA);

            return;
        }
        if(team[Tn] == 2){
            if(Bn != 0)
                Bn--;
            scoreB = scoreB - lastScoreB[Bn];
            ballsB = ballsB - lastBallB[Bn];

            displayBallsTeamB(ballsB);
            displayForTeamB(scoreB);

            return;
        }
    }

    public void updateA(){
        team[Tn] = 1;
        Tn++;
    }
    public void updateB(){
        team[Tn] = 2;
        Tn++;
    }

    public void ASix(View view){
        lastScoreA[An] = 6;
        lastBallA[An] = 1;
        An++;
        updateA();
        scoreA = scoreA + 6;
        ballsA = ballsA + 1;

        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);
    }
    public void AFour(View view){
        lastScoreA[An] = 4;
        lastBallA[An] = 1;
        An++;
        updateA();
        scoreA = scoreA + 4;
        ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);

    }
    public void AFive(View view){
        lastScoreA[An] = 1;
        lastBallA[An] = 0;
        An++;
        updateA();
        scoreA = scoreA + 1;
        //ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);

    }
    public void AThree(View view){
        lastScoreA[An] = 3;
        lastBallA[An] = 1;
        An++;
        updateA();
        scoreA = scoreA + 3;
        ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);

    }
    public void ATwo(View view){
        lastScoreA[An] = 2;
        lastBallA[An] = 1;
        An++;
        updateA();
        scoreA = scoreA + 2;
        ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);

    }
    public void AOne(View view){
        lastScoreA[An] = 1;
        lastBallA[An] = 1;
        An++;
        updateA();
        scoreA = scoreA + 1;
        ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
        displayForTeamA(scoreA);

    }
    public void ADot(View view){
        lastScoreA[An] = 0;
        lastBallA[An] = 1;
        An++;
        updateA();
        ballsA = ballsA + 1;
        displayBallsTeamA(ballsA);
    }

    public void BSix(View view){
        lastScoreB[Bn] = 6;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        scoreB = scoreB + 6;
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BFour(View view){
        lastScoreB[Bn] = 4;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        scoreB = scoreB + 4;
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BFive(View view){
        lastScoreB[Bn] = 1;
        lastBallB[Bn] = 0;
        Bn++;
        updateB();
        scoreB = scoreB + 1;
        //ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BThree(View view){
        lastScoreB[Bn] = 3;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        scoreB = scoreB + 3;
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BTwo(View view){
        lastScoreB[Bn] = 2;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        scoreB = scoreB + 2;
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BOne(View view){
        lastScoreB[Bn] = 1;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        scoreB = scoreB + 1;
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
        displayForTeamB(scoreB);

    }
    public void BDot(View view){
        lastScoreB[Bn] = 0;
        lastBallB[Bn] = 1;
        Bn++;
        updateB();
        ballsB = ballsB + 1;
        displayBallsTeamB(ballsB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        ballsA = 0;
        ballsB = 0;
        oversA = 0;
        oversB = 0;

        for(int i=0; i<An; i++)
            lastScoreA[i]=0;
        for(int j=0; j<An; j++)
            lastScoreB[j]=0;
        for(int k=0; k<Tn; k++)
            team[k] = 0;
        An = 0;
        Bn = 0;
        Tn = 0;

        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayBallsTeamA(ballsA);
        displayBallsTeamB(ballsB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBallsTeamA(int ball) {
        oversA = ball / 6;
        TextView scoreView = (TextView) findViewById(R.id.teamABalls);
        scoreView.setText(oversA + "." + ball % 6);
    }
    public void displayBallsTeamB(int ballB) {
        oversB = ballB / 6;
        TextView scoreView = (TextView) findViewById(R.id.teamBBalls);
        scoreView.setText(oversB + "." + ballB % 6);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5745553077662469~9672682031");

        adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        //AdRequest adRequest = new AdRequest.Builder().addTestDevice("580CFCFEDAF14C12BB430E6A11B4DD38").build();
        adView.loadAd(adRequest);
    }

    @Override
    protected void onPause() {
        adView.pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        adView.resume();
    }
}
