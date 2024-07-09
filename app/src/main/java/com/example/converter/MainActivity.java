package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userInputDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dollarConvert(View view){
        userInputDesign = findViewById(R.id.userInput);

        String userInputValue = userInputDesign.getText().toString();

        double userInputDouble = Double.parseDouble(userInputValue);

        double outputDouble = userInputDouble * 76.31;

        String outputString = String.valueOf(outputDouble);

        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();



    }
}