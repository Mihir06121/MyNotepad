package com.example.mynotepad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    TextView textView_two;
    String st;
    Button button_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView_two = (TextView) findViewById(R.id.textView_two);
        st=getIntent().getExtras().getString("Value");
        textView_two.setText(" Welcome ");
        textView_two.append(st);
        textView_two.append("!");

        Intent in = getIntent();
        button_two = (Button) findViewById (R.id.button);
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}
