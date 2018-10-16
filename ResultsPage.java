package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;



public class ResultsPage extends AppCompatActivity {
    private Button NextButton;
    private TextView PercentageView, CorrectView, MissedView;
    private int questionsCorrect, questionsMissed;
    private double percentage;
    private String percentageString, correctString, missedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        PercentageView = (TextView) findViewById(R.id.PercentageView);
        CorrectView = (TextView) findViewById(R.id.CorrectView);
        MissedView = (TextView) findViewById(R.id.MissedView);

        questionsMissed = GameplayPage.getWordsIncorrect();
        questionsCorrect = 6 - questionsMissed;
        percentage = questionsCorrect/6.0 * 100.0;

        percentageString = Double.toString(percentage) + "%";
        correctString = Integer.toString(questionsCorrect) + " question(s) correct out of 6";
        missedString = Integer.toString(questionsMissed) + " questions missed";

        PercentageView.setText(percentageString);
        CorrectView.setText(correctString);
        MissedView.setText(missedString);

        NextButton = (Button) findViewById(R.id.NextButton);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPostGameOptionsPage();
            }
        });
    }

    public void openPostGameOptionsPage() {
        Intent intent = new Intent(this, PostGameOptionsPage.class);
        startActivity(intent);
    }
}
