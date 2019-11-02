package tjm429.nau.edu.anagramgame;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class GameActivity2 extends AppCompatActivity {

    Button letter1;
    Button letter2;
    Button letter3;
    Button letter4;
    Button letter5;
    Button clear;
    Button backspace;
    Button submit;
    Button skip;
    TextView amount;
    TextView display;
    TextView timerText;
    CountDownTimer timer;
    long timeLeftMilliseconds = 120000; // 2 minutes

    String button1letter;
    String button2letter;
    String button3letter;
    String button4letter;
    String button5letter;
    int length;
    String displayText;
    int white;
    int gray;
    String order;
    String[] stack = new String[5];
    int answerCounter;
    public static String[] answers = new String[6];
    public static String[] correctAnswers = new String[25];
    int count;
    String newWord;
    String firstWord;
    String[] wordList =
            {
                "BLOCK", "MAJOR", "QUICK", "BANJO", "ENJOY", "BLAZE", "ALONE", "BEACH", "BEARD", "BLACK",
                "BRIEF", "BRIDE", "BRICK", "BRAVE", "CAMEL" ,"CANDY", "CHALK", "CHASE",
                "CLAMP", "COUNT", "COVER" ,"COUGH", "CRAMP", "COURT", "CRAFT", "CRASH", "CRIME" ,
                "DRAIN", "DRAFT", "DOZEN" ,"DRIVE", "EIGHT", "EQUAL", "FAINT", "FORCE", "GRAPE", "GLAZE" ,
                "GRAPH", "GROUP", "HINGE" ,"NOISE", "JUICE", "LARGE", "PATCH", "PEARL", "PEACH", "POLAR" ,
                "PRIDE", "QUOTE", "QUIET" ,"REALM", "REPLY", "ROAST", "ROUND", "SCALE", "SHADE", "TOXIC" ,
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        letter1 = findViewById(R.id.letter1);
        letter2 = findViewById(R.id.letter2);
        letter3 = findViewById(R.id.letter3);
        letter4 = findViewById(R.id.letter4);
        letter5 = findViewById(R.id.letter5);
        clear = findViewById(R.id.btn_clear);
        backspace = findViewById(R.id.btn_backspace);
        submit = findViewById(R.id.btn_submit);
        skip = findViewById(R.id.btn_skip);
        amount = findViewById(R.id.textView3);
        display = findViewById(R.id.display);
        white = Color.WHITE;
        gray = Color.GRAY;
        display.setTextColor(white);
        order = "";
        length = 0;
        displayText = display.getText().toString();
        count = 4;
        answerCounter = 0;
        timerText = findViewById(R.id.timer);

        String startingWord = getRandomWord();
        correctAnswers[answerCounter] = startingWord;
        firstWord = shuffle(startingWord);
        letter1.setText("" + firstWord.charAt(0));
        letter2.setText("" + firstWord.charAt(1));
        letter3.setText("" + firstWord.charAt(2));
        letter4.setText("" + firstWord.charAt(3));
        letter5.setText("" + firstWord.charAt(4));
        button1letter = letter1.getText().toString();
        button2letter = letter2.getText().toString();
        button3letter = letter3.getText().toString();
        button4letter = letter4.getText().toString();
        button5letter = letter5.getText().toString();

        letter1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter1.setTextColor(gray);
                display.setText(display.getText() + letter1.getText().toString());
                letter1.setEnabled(false);
                if(stack[4] == null)
                {
                    stack[4] = "button1";
                }
                else if(stack[3] == null)
                {
                    stack[3] = "button1";
                }
                else if(stack[2] == null)
                {
                    stack[2] = "button1";
                }
                else if(stack[1] == null)
                {
                    stack[1] = "button1";
                }
                else if(stack[0] == null)
                {
                    stack[0] = "button1";
                }
            }
        });

        letter2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter2.setTextColor(gray);
                display.setText(display.getText() + letter2.getText().toString());
                letter2.setEnabled(false);
                order += "2";
                if(stack[4] == null)
                {
                    stack[4] = "button2";
                }
                else if(stack[3] == null)
                {
                    stack[3] = "button2";
                }
                else if(stack[2] == null)
                {
                    stack[2] = "button2";
                }
                else if(stack[1] == null)
                {
                    stack[1] = "button2";
                }
                else if(stack[0] == null)
                {
                    stack[0] = "button2";
                }
            }
        });

        letter3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter3.setTextColor(gray);
                display.setText(display.getText() + letter3.getText().toString());
                letter3.setEnabled(false);
                order += "3";
                if(stack[4] == null)
                {
                    stack[4] = "button3";
                }
                else if(stack[3] == null)
                {
                    stack[3] = "button3";
                }
                else if(stack[2] == null)
                {
                    stack[2] = "button3";
                }
                else if(stack[1] == null)
                {
                    stack[1] = "button3";
                }
                else if(stack[0] == null)
                {
                    stack[0] = "button3";
                }
            }
        });

        letter4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter4.setTextColor(gray);
                display.setText(display.getText() + letter4.getText().toString());
                letter4.setEnabled(false);
                order += "4";
                if(stack[4] == null)
                {
                    stack[4] = "button4";
                }
                else if(stack[3] == null)
                {
                    stack[3] = "button4";
                }
                else if(stack[2] == null)
                {
                    stack[2] = "button4";
                }
                else if(stack[1] == null)
                {
                    stack[1] = "button4";
                }
                else if(stack[0] == null)
                {
                    stack[0] = "button4";
                }
            }
        });

        letter5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter5.setTextColor(gray);
                display.setText(display.getText() + letter5.getText().toString());
                letter5.setEnabled(false);
                order += "4";
                if(stack[4] == null)
                {
                    stack[4] = "button5";
                }
                else if(stack[3] == null)
                {
                    stack[3] = "button5";
                }
                else if(stack[2] == null)
                {
                    stack[2] = "button5";
                }
                else if(stack[1] == null)
                {
                    stack[1] = "button5";
                }
                else if(stack[0] == null)
                {
                    stack[0] = "button5";
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                letter1.setTextColor(white);
                letter2.setTextColor(white);
                letter3.setTextColor(white);
                letter4.setTextColor(white);
                letter5.setTextColor(white);
                display.setText("");
                letter1.setEnabled(true);
                letter2.setEnabled(true);
                letter3.setEnabled(true);
                letter4.setEnabled(true);
                letter5.setEnabled(true);
                order = "";
            }
        });

        backspace.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                char firstLetter = letter1.getText().toString().charAt(0);
                String stringFirstLetter = Character.toString(firstLetter);

                char secondLetter = letter2.getText().toString().charAt(0);
                String stringSecondLetter = Character.toString(secondLetter);

                char thirdLetter = letter3.getText().toString().charAt(0);
                String stringThirdLetter = Character.toString(thirdLetter);

                char fourthLetter = letter4.getText().toString().charAt(0);
                String stringFourthLetter = Character.toString(fourthLetter);

                char fifthLetter = letter5.getText().toString().charAt(0);
                String stringFifthLetter = Character.toString(fifthLetter);

                String text = display.getText().toString();
                if (text.length() > 0) {

                    if (display.getText().toString().endsWith(stringFirstLetter)) {
                        letter1.setTextColor(white);
                        letter1.setEnabled(true);
                        display.setText
                                (display.getText().toString().substring(
                                        0, display.getText().toString().length() - 1)
                                );
                        return;
                    }
                    if (display.getText().toString().endsWith(stringSecondLetter)) {
                        letter2.setTextColor(white);
                        letter2.setEnabled(true);
                        display.setText
                                (display.getText().toString().substring(
                                        0, display.getText().toString().length() - 1)
                                );
                        return;
                    }
                    if (display.getText().toString().endsWith(stringThirdLetter)) {
                        letter3.setTextColor(white);
                        letter3.setEnabled(true);
                        display.setText
                                (display.getText().toString().substring(
                                        0, display.getText().toString().length() - 1)
                                );
                        return;
                    }
                    if (display.getText().toString().endsWith(stringFourthLetter)) {
                        letter4.setTextColor(white);
                        letter4.setEnabled(true);
                        display.setText
                                (display.getText().toString().substring(
                                        0, display.getText().toString().length() - 1)
                                );
                        return;
                    }
                    if (display.getText().toString().endsWith(stringFifthLetter)) {
                        letter5.setTextColor(white);
                        letter5.setEnabled(true);
                        display.setText
                                (display.getText().toString().substring(
                                        0, display.getText().toString().length() - 1)
                                );
                        return;
                    }
                }
            }

        });

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(display.getText().toString().length() == 5)
                {
                    submit.setEnabled(true);
                    count--;
                    answers[answerCounter] = display.getText().toString();
                    answerCounter++;
                    display.setText("");
                    letter1.setEnabled(true);
                    letter1.setTextColor(white);
                    letter2.setEnabled(true);
                    letter2.setTextColor(white);
                    letter3.setEnabled(true);
                    letter3.setTextColor(white);
                    letter4.setEnabled(true);
                    letter4.setTextColor(white);
                    letter5.setEnabled(true);
                    letter5.setTextColor(white);
                    stack[0] = null;
                    stack[1] = null;
                    stack[2] = null;
                    stack[3] = null;
                    stack[4] = null;

                    if(count != -1)
                    {
                    String startingWord = getRandomWord();
                    firstWord = shuffle(startingWord);
                    letter1.setText("" + firstWord.charAt(0));
                    letter2.setText("" + firstWord.charAt(1));
                    letter3.setText("" + firstWord.charAt(2));
                    letter4.setText("" + firstWord.charAt(3));
                    letter5.setText("" + firstWord.charAt(4));
                    correctAnswers[answerCounter] = startingWord;
                    }

                    if (count < 5) {
                        if(count == -1)
                        {
                            amount.setText("Left: 0");
                        }
                        else {
                            amount.setText("Left: " + count);
                        }
                    }
                    if (count == -1) {
                        timer.cancel();
                        Intent fp = new Intent(getApplicationContext(), ResultsActivity2.class);
                        startActivity(fp);
                        PopupActivity.easy = false;
                        return;
                    }
                }
            }
        });

        skip.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                count--;
                answers[answerCounter] = "_ _ _ _ _ _";
                answerCounter++;


                if(count != -1)
                {
                    String startingWord = getRandomWord();
                    firstWord = shuffle(startingWord);
                    letter1.setText("" + firstWord.charAt(0));
                    letter2.setText("" + firstWord.charAt(1));
                    letter3.setText("" + firstWord.charAt(2));
                    letter4.setText("" + firstWord.charAt(3));
                    letter5.setText("" + firstWord.charAt(4));
                    correctAnswers[answerCounter] = startingWord;
                }

                display.setText("");
                letter1.setEnabled(true);
                letter1.setTextColor(white);
                letter2.setEnabled(true);
                letter2.setTextColor(white);
                letter3.setEnabled(true);
                letter3.setTextColor(white);
                letter4.setEnabled(true);
                letter4.setTextColor(white);
                letter5.setEnabled(true);
                letter5.setTextColor(white);
                stack[0] = null;
                stack[1] = null;
                stack[2] = null;
                stack[3] = null;
                stack[4] = null;

                if (count < 5) {
                    if(count == -1)
                    {
                        amount.setText("Left: 0");
                    }
                    else {
                        amount.setText("Left: " + count);
                    }
                }
                if (count == -1) {
                    timer.cancel();
                    skip.setEnabled(false);
                    Intent fp = new Intent(getApplicationContext(), ResultsActivity2.class);
                    startActivity(fp);
                    PopupActivity.medium = false;
                    return;
                }
            }
        });

        startTimer();
    }

    public static String shuffle(String s)
    {
        String preShuffle = s;
        String shuffledString = "";

        while (s.length() != 0)
        {
            int index = (int) Math.floor(Math.random() * s.length());
            char c = s.charAt(index);
            s = s.substring(0,index)+s.substring(index+1);
            shuffledString += c;
        }
        if(preShuffle.equals(shuffledString))
        {
            shuffle(s);
        }
        return shuffledString;
    }

    public String getRandomWord()
    {
        double randomNumber = Math.floor( Math.random() * (wordList.length) );
        int intRandom;
        intRandom = (int)randomNumber;
        if(wordList[intRandom] == null)
        {
            return getRandomWord();
        }
        newWord = wordList[intRandom];
        wordList[intRandom] = null;
        return newWord;
    }

    public void startTimer()
    {
        timer = new CountDownTimer( timeLeftMilliseconds, 1000 )
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                timeLeftMilliseconds = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish()
            {
                timer.cancel();
                Intent activateResult = new Intent(getApplicationContext(), ResultsActivity2.class);
                startActivity(activateResult);
                PopupActivity.medium = false;
            }
        }.start();
    }

    public void updateTimer()
    {
        int minutes = (int) timeLeftMilliseconds / 60000;
        int seconds = (int) timeLeftMilliseconds % 60000 / 1000;
        int red = Color.RED;

        String timeLeftDisplay;

        timeLeftDisplay = "" + minutes;
        timeLeftDisplay += ":";

        if( seconds < 10 )
        {
            timeLeftDisplay += "0";
        }

        if(minutes == 0 && seconds < 11)
        {
            timerText.setTextColor(red);
        }

        timeLeftDisplay += seconds;

        timerText.setText( timeLeftDisplay );

    }

}