package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class suggest_exercise extends AppCompatActivity {

    TextView textView4;
    EditText editTextNumber2;
    Button submit_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest_exercise);

        submit_button2 = (Button) findViewById(R.id.submit_button2);
        textView4 = (TextView) findViewById(R.id.textView4);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);

        submit_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextNumber2.getText().toString().trim().equals(""))
                {
                    editTextNumber2.setError( "This field is required!" );
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), suggestions.class);
                    startActivity(intent);
                }
            }
        });

    }
}