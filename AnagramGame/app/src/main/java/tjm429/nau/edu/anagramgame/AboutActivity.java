package tjm429.nau.edu.anagramgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class AboutActivity extends AppCompatActivity {

    Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        main = findViewById(R.id.btn_mainMenu);

        main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent fp = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(fp);
            }
        });
    }
}