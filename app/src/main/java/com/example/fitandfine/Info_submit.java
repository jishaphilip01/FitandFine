package com.example.fitandfine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Info_submit extends AppCompatActivity {

    TextView textView2;
    EditText editTextTextPersonName;
    EditText editTextTextPersonName2;
    EditText editTextNumber;
    EditText editTextNumberDecimal;
    EditText editTextNumberDecimal2;
    Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_submit);

        submit_button = (Button) findViewById(R.id.submit_button);

        textView2 = (TextView)findViewById(R.id.textView2);
        editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        editTextNumberDecimal = (EditText)findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal2 = (EditText)findViewById(R.id.editTextNumberDecimal2);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( editTextTextPersonName.getText().toString().trim().equals(""))
                {
                    editTextTextPersonName.setError( "This field is required!" );
                }

                else if(editTextTextPersonName2.getText().toString().trim().equals(""))
                {
                    editTextTextPersonName.setError( "This field is required!" );
                }

                else if(editTextNumber.getText().toString().trim().equals(""))
                {
                    editTextNumber.setError( "This field is required!" );
                }

                else if(editTextNumberDecimal.getText().toString().trim().equals(""))
                {
                    editTextNumberDecimal.setError( "This field is required!" );
                }
                else if(editTextNumberDecimal2.getText().toString().trim().equals(""))
                {
                    editTextNumberDecimal2.setError( "This field is required!" );
                }

                else{
                    Intent intent = new Intent(getApplicationContext(), select_options.class);
                    startActivity(intent);
                }
            }
        });

    }
}