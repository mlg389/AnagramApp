package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameplayPage extends AppCompatActivity {
    private Button SubmitButton;
    private Button SkipButton;
    private Button QuitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay_page);

        SubmitButton = (Button) findViewById(R.id.SubmitButton);
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameplayPage();
            }
        });

        SkipButton = (Button) findViewById(R.id.SkipButton);
        SkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameplayPage();
            }
        });

        QuitButton = (Button) findViewById(R.id.QuitButton);
        QuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });
    }

    public void openGameplayPage() {
        Intent intent = new Intent(this, GameplayPage.class);
        startActivity(intent);
    }

    public void openHomePage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
