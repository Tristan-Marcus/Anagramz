package tjm429.nau.edu.anagramgame;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class ResultsActivity3 extends AppCompatActivity {

    Button main;
    String one;
    String two;
    String three;
    String four;
    String five;
    String realone;
    String realtwo;
    String realthree;
    String realfour;
    String realfive;

    TextView oneView;
    TextView oneViewC;
    TextView twoView;
    TextView twoViewC;
    TextView threeView;
    TextView threeViewC;
    TextView fourView;
    TextView fourViewC;
    TextView fiveView;
    TextView fiveViewC;
    TextView score;

    int counter;
    int green;
    int red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results3);

        main = findViewById(R.id.btn_results_mainMenu);
        green = Color.GREEN;
        red = Color.RED;
        counter = 0;
        oneView = findViewById(R.id.textView);
        oneViewC = findViewById(R.id.textView7);
        twoView = findViewById(R.id.textView8);
        twoViewC = findViewById(R.id.textView9);
        threeView = findViewById(R.id.textView10);
        threeViewC = findViewById(R.id.textView11);
        fourView = findViewById(R.id.textView13);
        fourViewC = findViewById(R.id.textView14);
        fiveView = findViewById(R.id.textView12);
        fiveViewC = findViewById(R.id.textView15);
        score = findViewById(R.id.textView16);

        if(GameActivity3.answers[0] == null)
        {
            one = "_ _ _ _ _ _ _";
        }
        else {
            one = GameActivity3.answers[0];
        }
        if(GameActivity3.answers[1] == null)
        {
            two = "_ _ _ _ _ _ _";
        }
        else {
            two = GameActivity3.answers[1];
        }
        if(GameActivity3.answers[2] == null)
        {
            three = "_ _ _ _ _ _ _";
        }
        else {
            three = GameActivity3.answers[2];
        }
        if(GameActivity3.answers[3] == null)
        {
            four = "_ _ _ _ _ _ _";
        }
        else {
            four = GameActivity3.answers[3];
        }

        if(GameActivity3.answers[4] == null)
        {
            five = "_ _ _ _ _ _ _";
        }
        else {
            five = GameActivity3.answers[4];
        }

        oneView.setText(oneView.getText() + " " + one);
        twoView.setText(twoView.getText() + " "+ two);
        threeView.setText(threeView.getText() + " "+ three);
        fourView.setText(fourView.getText() + " "+ four);
        fiveView.setText(fiveView.getText() + " "+ five);

        if(GameActivity3.correctAnswers[0] == null)
        {
            realone = "Timed Out";
            oneViewC.setText(realone);
        }
        else {
            realone = GameActivity3.correctAnswers[0];
            oneViewC.setText("Correct: " +  realone);
        }

        if(GameActivity3.correctAnswers[1] == null)
        {
            realtwo = "Timed Out";
            twoViewC.setText(realtwo);
        }
        else {
            realtwo = GameActivity3.correctAnswers[1];
            twoViewC.setText("Correct: " +  realtwo);
        }

        if(GameActivity3.correctAnswers[2] == null)
        {
            realthree = "Timed Out";
            threeViewC.setText(realthree);
        }
        else {
            realthree = GameActivity3.correctAnswers[2];
            threeViewC.setText("Correct: " +  realthree);
        }

        if(GameActivity3.correctAnswers[3] == null)
        {
            realfour = "Timed Out";
            fourViewC.setText(realfour);
        }
        else {
            realfour = GameActivity3.correctAnswers[3];
            fourViewC.setText("Correct: " +  realfour);
        }
        if(GameActivity3.correctAnswers[4] == null)
        {
            realfive = "Timed Out";
            fiveViewC.setText(realfive);
        }
        else {
            realfive = GameActivity3.correctAnswers[4];
            fiveViewC.setText("Correct: " +  realfive);
        }

        if(one.equals(realone))
        {
            oneView.setTextColor(green);
            oneViewC.setTextColor(green);
            counter++;
        }
        else
        {
            oneView.setTextColor(red);
            oneViewC.setTextColor(red);
        }
        if(two.equals(realtwo))
        {
            twoView.setTextColor(green);
            twoViewC.setTextColor(green);
            counter++;
        }
        else
        {
            twoView.setTextColor(red);
            twoViewC.setTextColor(red);
        }
        if(three.equals(realthree))
        {
            threeView.setTextColor(green);
            threeViewC.setTextColor(green);
            counter++;
        }
        else
        {
            threeView.setTextColor(red);
            threeViewC.setTextColor(red);
        }
        if(four.equals(realfour))
        {
            fourView.setTextColor(green);
            fourViewC.setTextColor(green);
            counter++;
        }
        else
        {
            fourView.setTextColor(red);
            fourViewC.setTextColor(red);
        }
        if(five.equals(realfive))
        {
            fiveView.setTextColor(green);
            fiveViewC.setTextColor(green);
            counter++;
        }
        else
        {
            fiveView.setTextColor(red);
            fiveViewC.setTextColor(red);
        }
        score.setText(counter + score.getText().toString());
        main.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GameActivity3.correctAnswers = new String[GameActivity3.correctAnswers.length];
                GameActivity3.answers = new String[GameActivity3.answers.length];
                Intent fp = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(fp);
            }
        });
    }
}