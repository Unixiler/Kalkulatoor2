package com.example.kalkulatoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View; //Added this import for onButtonClick View
import android.widget.EditText; //Added this import for onButtonClick View
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //My code
    public void onButtonClick(View v){
        EditText el1  = (EditText)findViewById(R.id.num1);
        EditText el2  = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.resText);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));
    }


}
