package marcus.threeinarow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainMenu extends AppCompatActivity {

    Button btnNewGame;
    Button btnNewGameCPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnNewGame = (Button)findViewById(R.id.btnNewGame);
        btnNewGameCPU = (Button)findViewById(R.id.btnNewGameCPU);

        btnNewGame.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),GameScreen.class);
            i.putExtra("option",0);
            startActivity(i);
        });

        btnNewGameCPU.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),DifficultySelectionScreen.class);
            startActivity(i);
        });
    }

}
