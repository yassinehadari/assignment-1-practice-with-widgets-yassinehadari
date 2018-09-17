package com.example.dell.tp1;

import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textE;
    TextView textV;
    Button bouton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textE = (EditText) findViewById(R.id.editText);
        textV = (TextView) findViewById(R.id.textView);
        bouton = (Button) findViewById(R.id.button);

        //When button is clicked
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txt = textE.getText().toString();
                textV.setText(txt);

            }
        });
    }
}
