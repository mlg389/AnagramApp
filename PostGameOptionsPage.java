package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class PostGameOptionsPage extends AppCompatActivity {
    private Button DetailsButton;
    private Button HomeButton;
    private Button NewLevelButton;
    private Button RepeatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_game_options_page);

        DetailsButton = (Button) findViewById(R.id.DetailsButton);
        DetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailedResultsPage();
            }
        });

        HomeButton = (Button) findViewById(R.id.HomeButton);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });

        NewLevelButton = (Button) findViewById(R.id.NewLevelButton);
        NewLevelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevelSelectionPage();
            }
        });

        RepeatButton = (Button) findViewById(R.id.RepeatButton);
        RepeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameplayPage();
            }
        });

    }

    public void openDetailedResultsPage() {
        Intent intent = new Intent(this, DetailedResultsPage.class);
        startActivity(intent);
    }

    public void openHomePage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openLevelSelectionPage() {
        Intent intent = new Intent(this, LevelSelectionPage.class);
        startActivity(intent);
    }

    public void openGameplayPage() {
        Intent intent = new Intent(this, GameplayPage.class);
        startActivity(intent);
    }
}
