package com.example.repasexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WidgetrecibedActivity extends AppCompatActivity {
    TextView textRebut;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgetrecibed);

        textRebut = findViewById(R.id.rebut);

        intent = getIntent();
        if (intent != null) {
            String contingutRebut = intent.getStringExtra("idText1");
            textRebut.setText(contingutRebut);
        }
    }
}