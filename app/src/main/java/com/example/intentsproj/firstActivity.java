package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 ="com.example.*";
    public static final String EXTRA_MESSAGE2 = "com.example.*";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondActivity (View v){
        //launch new activity
        //this means current activity

        Intent i =new Intent(this,secondActivity.class);
        startActivity(i);
        int duration = Toast.LENGTH_SHORT;
        Toast toast =Toast.makeText(this,"You just clicked the OK button",duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        EditText editText = (EditText) findViewById(R.id.num1);
        String message = editText.getText().toString();
        i.putExtra(EXTRA_MESSAGE1, message);

        EditText editText2 = (EditText) findViewById(R.id.num2);
        String message2 = editText.getText().toString();
        i.putExtra(EXTRA_MESSAGE2, message2);

    }



}