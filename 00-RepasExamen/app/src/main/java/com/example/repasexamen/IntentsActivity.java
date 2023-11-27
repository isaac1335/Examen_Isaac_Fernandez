package com.example.repasexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentsActivity extends AppCompatActivity implements View.OnClickListener {
    Button btNavegador, btTelefon, btEmail, btGps, btBuscador;
    Button buttons[];
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        //Inicialitzar butons;
        btNavegador = findViewById(R.id.navegador);
        btTelefon = findViewById(R.id.telefon);
        btEmail = findViewById(R.id.email);
        btGps = findViewById(R.id.gps);
        btBuscador = findViewById(R.id.buscador);

        //Inicialitzar text;
        text = (EditText) findViewById(R.id.textBuscar);

        //Introduir variables array botons:
        buttons = new Button[]{btNavegador, btTelefon, btEmail, btGps, btBuscador};

        //Detectar clic botons:
        for(Button button : buttons ){
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        //Afegir funcionalitat als botons:
        if (v.getId() == R.id.navegador) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.educem.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.telefon) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:647328384"));
            startActivity(intent);
        }

        if (v.getId() == R.id.email) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("mailto:exemple@gmail.com"));
            startActivity(intent);
        }

        if (v.getId() == R.id.gps) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:41.3, 20.3"));
            startActivity(intent);
        }

        if (v.getId() == R.id.buscador) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, text.getText().toString());
            startActivity(intent);
        }
    }
}