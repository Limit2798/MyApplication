package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonAnswer1;
    private Button mButtonAnswer2;
    private Button mButtonAnswer3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonAnswer1 = (Button)findViewById(R.id.answer1);
        mButtonAnswer2 = (Button)findViewById(R.id.answer2);
        mButtonAnswer3 = (Button)findViewById(R.id.answer3);

        updateQuestion();

        //Start Button1
        mButtonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logic

                if(mButtonAnswer1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End Button1
        //Start Button2
        mButtonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logic

                if(mButtonAnswer2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }


        });
        //End Button2
        //Start Button3
        mButtonAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logic

                if(mButtonAnswer3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }


        });
        //End Button3
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonAnswer1.setText(mQuestionLibrary.getAnswer1(mQuestionNumber));
        mButtonAnswer2.setText(mQuestionLibrary.getAnswer2(mQuestionNumber));
        mButtonAnswer3.setText(mQuestionLibrary.getAnswer3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

    }

    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }


}