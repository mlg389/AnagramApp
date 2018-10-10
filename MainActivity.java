package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {
    private Button SelectLevelButton;
    private Button AboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SelectLevelButton = (Button) findViewById(R.id.SelectLevelButton);
        SelectLevelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevelSelectionPage();
            }
        });

        AboutButton = (Button) findViewById(R.id.AboutButton);
        AboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutPage();
            }
        });
    }

    public void openLevelSelectionPage() {
        Intent intent = new Intent(this, LevelSelectionPage.class);
        startActivity(intent);
    }

    public void openAboutPage() {
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }

}
