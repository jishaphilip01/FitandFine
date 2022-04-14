package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calorie_burnt extends AppCompatActivity {
    TextView textView3;
    EditText editTextNumberDecimal3, editTextNumberDecimal4, editTextNumberDecimal5;
    Button submit_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_burnt);

        textView3 = (TextView)findViewById(R.id.textView3);
        editTextNumberDecimal3 = (EditText)findViewById(R.id.editTextNumberDecimal3);
        editTextNumberDecimal4 = (EditText)findViewById(R.id.editTextNumberDecimal4);
        editTextNumberDecimal5 = (EditText)findViewById(R.id.editTextNumberDecimal5);

        submit_button1 = findViewById(R.id.submit_button1);

        submit_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextNumberDecimal3.getText().toString().trim().equals(""))
                {
                    editTextNumberDecimal3.setError( "This field is required!" );
                }
                else if(editTextNumberDecimal4.getText().toString().trim().equals(""))
                {
                    editTextNumberDecimal4.setError( "This field is required!" );
                }
                else if(editTextNumberDecimal5.getText().toString().trim().equals(""))
                {
                    editTextNumberDecimal5.setError( "This field is required!" );
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), calorie_results.class);
                    startActivity(intent);
                }
            }
        });
    }
}