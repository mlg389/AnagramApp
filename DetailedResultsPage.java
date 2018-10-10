package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
CAN'T ACTUALLY REACH RIGHT NOW - tied to post game options page
 */

public class DetailedResultsPage extends AppCompatActivity {
    private Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_game_options_page);

        BackButton = (Button) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
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
