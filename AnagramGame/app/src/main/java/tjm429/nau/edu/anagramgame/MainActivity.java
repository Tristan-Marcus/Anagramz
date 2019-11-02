package tjm429.nau.edu.anagramgame;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static Button difficulties;
    Button about;
    Button newGame;
    Button easy;
    int buttonText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.btn_settings);
        newGame = findViewById(R.id.btn_newGame);
        difficulties = findViewById(R.id.btn_difficult);
        easy = findViewById(R.id.btn_dif_easy);
        buttonText = difficulties.getText().length();



        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fp = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(fp);
            }
        });

        difficulties.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent fp = new Intent(getApplicationContext(),PopupActivity.class);
                startActivity(fp);
            }
        });

        newGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(PopupActivity.easy == true)
                {
                    Intent fp = new Intent(getApplicationContext(),GameActivity.class);
                    startActivity(fp);
                    return;
                }
                if(PopupActivity.medium == true)
                {
                    Intent fp = new Intent(getApplicationContext(),GameActivity2.class);
                    startActivity(fp);
                    return;
                }
                if(PopupActivity.hard == true)
                {
                    Intent fp = new Intent(getApplicationContext(),GameActivity3.class);
                    startActivity(fp);
                    return;
                }
                else {
                    int black = Color.BLACK;
                    int white = Color.WHITE;

                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("")
                    .setCancelable(false)
                    .setMessage("Please choose a difficulty")
                    .setPositiveButton("Okay", null);

                    AlertDialog dialog = alert.create();
                    dialog.show();
                    dialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(black);
                    }
            }
        });
    }
}
