package com.example.repasexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btWidget, btIntent, btBlock;
    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicialitzar butons:
        btWidget = findViewById(R.id.widget);
        btIntent = findViewById(R.id.intents);
        btBlock = findViewById(R.id.blockVertical);

        //Introduir variables array botons:
        buttons = new Button[]{btWidget, btIntent, btBlock};

        //Detectar clic botons:
        for(Button button : buttons ){
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        //Redireccionar a una altre Activity:
        if (v.getId() == R.id.widget) {
            Intent intent = new Intent(this, WidgetActivity.class);
            startActivity(intent);
        }
        else
        {
            if (v.getId() == R.id.intents) {
                Intent intent = new Intent(this, IntentsActivity.class);
                startActivity(intent);
            }
            else {
                if (v.getId() == R.id.blockVertical) {
                    Intent intent = new Intent(this, BlockverticalActivity.class);
                    startActivity(intent);
                }
            }
        }
    }
}