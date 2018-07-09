package com.swetajain.cricket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sixScorePointsA = findViewById(R.id.six_points_button_a);
        Button sixScorePointsB = findViewById(R.id.six_points_button_b);
        Button fourScorePointsA = findViewById(R.id.four_points_button_a);
        Button fourScorePointsB = findViewById(R.id.four_points_button_b);
        Button oneScorePointsA = findViewById(R.id.one_point_button_a);
        Button oneScorePointsB = findViewById(R.id.one_point_button_b);
        Button resetAll = findViewById(R.id.reset_button);
        final TextView scoreTeamA = findViewById(R.id.score_team_one);
        final TextView scoreTeamB = findViewById(R.id.score_team_two);
        Toast.makeText(MainActivity.this,"Welcome! tap the buttons to get the runs!",Toast.LENGTH_LONG).show();
        fourScorePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = Integer.parseInt(scoreTeamA.getText().toString());
                scoreA = scoreA + 4;
                scoreTeamA.setText(String.valueOf(scoreA));
                }
        });
        fourScorePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = Integer.parseInt(scoreTeamB.getText().toString());
                scoreB = scoreB + 4;
                scoreTeamB.setText(String.valueOf(scoreB));
                }
        });
        sixScorePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = Integer.parseInt(scoreTeamA.getText().toString());
                scoreA = scoreA + 6;
                scoreTeamA.setText(String.valueOf(scoreA));
            }
        });
        sixScorePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = Integer.parseInt(scoreTeamB.getText().toString());
                scoreB = scoreB + 6;
                scoreTeamB.setText(String.valueOf(scoreB));
            }
        });
        oneScorePointsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = Integer.parseInt(scoreTeamA.getText().toString());
                scoreA = scoreA + 1;
                scoreTeamA.setText(String.valueOf(scoreA));
            }
        });
        oneScorePointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = Integer.parseInt(scoreTeamB.getText().toString());
                scoreB = scoreB + 1;
                scoreTeamB.setText(String.valueOf(scoreB));
            }
        });
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA.setText("0");
                scoreTeamB.setText("0");
                Toast.makeText(MainActivity.this, "Reset done! Play Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}