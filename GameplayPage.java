package edu.nau.granroth_m_mitchell_j_anagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameplayPage extends AppCompatActivity {
    private Button SubmitButton;
    private Button SkipButton;
    private Button QuitButton;
    private EditText wordEntered;
    private TextView newWord;
    private TextView questionNumber;

    private int wordsIncorrect;
    private String userAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay_page);

        wordEntered = (EditText) findViewById(R.id.wordEntered);
        newWord = (TextView) findViewById(R.id.newWord);
        questionNumber = (TextView) findViewById(R.id.questionNumber);

        newWord.setText(Anagram.EASY_WORDS[Anagram.getQuestionCounter() - 1]);
        wordEntered.setText("");

        SubmitButton = (Button) findViewById(R.id.SubmitButton);
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswers = (wordEntered.getText().toString());
                validate();

                if(Anagram.getQuestionCounter() == 7) {
                    openResultsPage();
                }
            }
        });

        SkipButton = (Button) findViewById(R.id.SkipButton);
        SkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //userAnswers[Anagram.getQuestionCounter() - 1] = (wordEntered.getText().toString());
                wordsIncorrect++;
                validate();
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

    public void openResultsPage() {
        Intent intent = new Intent(this, ResultsPage.class);
        startActivity(intent);
    }

    public void openHomePage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void validate() {
        String wordToCheck = wordEntered.getText().toString();
        if( Anagram.checkWord(wordToCheck) ) {
            Anagram.updateQuestionCounter();
            nextQuestion();
        }
        else {
            wordsIncorrect++;
            Anagram.updateQuestionCounter();
            nextQuestion();
        }
    }

    public void nextQuestion() {
        newWord.setText(Anagram.EASY_WORDS[Anagram.getQuestionCounter() - 1]);
        questionNumber.setText("Question " + Anagram.getQuestionCounter() + "/6");
        wordEntered.setText("");
    }
}
