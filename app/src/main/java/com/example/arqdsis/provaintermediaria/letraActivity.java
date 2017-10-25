package com.example.arqdsis.provaintermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
//*William Cordeiro Fonseca - 201517063
public class letraActivity extends Activity {
    //*William Cordeiro Fonseca - 201517063
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra);
        Intent intent = getIntent();
        String message = intent.getStringExtra(numeroActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_letra);
        layout.addView(textView);
    }
}
