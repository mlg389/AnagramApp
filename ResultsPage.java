package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/*
CAN'T ACTUALLY REACH RIGHT NOW
 */

public class ResultsPage extends AppCompatActivity {
    private Button NextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

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
