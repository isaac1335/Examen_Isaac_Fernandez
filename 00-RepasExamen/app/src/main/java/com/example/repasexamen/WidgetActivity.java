package com.example.repasexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WidgetActivity extends AppCompatActivity implements View.OnClickListener {
    Button btEnviar;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        //Inicialitzar btEnviar:
        btEnviar = findViewById(R.id.enviar);
        btEnviar.setOnClickListener(this);

        //Inicialitzar text:
        text = (EditText) findViewById(R.id.textEnviar);
    }

    @Override
    public void onClick(View v) {
        //Enviar contingut a un altre activity:
        if (v.getId() == R.id.enviar) {
            String contingutText = text.getText().toString();
            Intent intent = new Intent(this, WidgetrecibedActivity.class);
            intent.putExtra("idText1", contingutText);
            startActivity(intent);
        }
    }
}