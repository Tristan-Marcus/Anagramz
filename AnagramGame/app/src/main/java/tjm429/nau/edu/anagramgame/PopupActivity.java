package tjm429.nau.edu.anagramgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class PopupActivity extends AppCompatActivity {

    public static boolean easy;
    public static boolean medium;
    public static boolean hard;
    Button one;
    Button two;
    Button three;
    Button difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        difficulty = findViewById(R.id.btn_difficult);
        one = findViewById(R.id.btn_dif_easy);
        two = findViewById(R.id.btn_dif_medium);
        three = findViewById(R.id.btn_dif_hard);

        one.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.difficulties.setText("Easy");
                easy = true;
                medium = false;
                hard = false;
                finish();
            }
        });

        two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.difficulties.setText("Medium");
                easy = false;
                medium = true;
                hard = false;
                finish();
            }
        });

        three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.difficulties.setText("Hard");
                easy = false;
                medium = false;
                hard = true;
                finish();
            }
        });

    }

}
