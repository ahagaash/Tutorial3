package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

// Get the Intent that started this activity and extract the  string

    Intent i = getIntent();
    String message = i.getStringExtra(firstActivity.EXTRA_MESSAGE1);

    // Capture the layout's TextView and set the string as its text
    TextView textView = findViewById(R.id.text1);
        textView.setText(message);

        // Capture the layout's TextView and set the string as its text
        TextView textView2 = findViewById(R.id.text);
        textView.setText(message);


}
}