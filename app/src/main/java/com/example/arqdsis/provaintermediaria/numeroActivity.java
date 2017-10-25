package com.example.arqdsis.provaintermediaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//*William Cordeiro Fonseca - 201517063
public class numeroActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.arqdsis.provaintermediaria.MESSAGE";
    //*William Cordeiro Fonseca - 201517063
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero);
    }
    //*William Cordeiro Fonseca - 201517063
    public void enviarNumero(View view)
    {
        Intent intent = new Intent(this, letraActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        char[] stringChar = message.toCharArray();
        for (int i = 0; i < stringChar.length; i++) {
            if (stringChar[i] == 'a' || stringChar[i] == 'b' || stringChar[i] == 'c') {
                stringChar[i] = '2';
            }
            if (stringChar[i] == 'd' || stringChar[i] == 'e' || stringChar[i] == 'f') {
                stringChar[i] = '3';
            }
            if (stringChar[i] == 'g' || stringChar[i] == 'h' || stringChar[i] == 'i') {
                stringChar[i] = '4';
            }
            if (stringChar[i] == 'j' || stringChar[i] == 'k' || stringChar[i] == 'l') {
                stringChar[i] = '5';
            }
            if (stringChar[i] == 'm' || stringChar[i] == 'n' || stringChar[i] == 'o') {
                stringChar[i] = '6';
            }
            if (stringChar[i] == 'p' || stringChar[i] == 'q' || stringChar[i] == 'r' || stringChar[i] == 's') {
                stringChar[i] = '7';
            }
            if (stringChar[i] == 't' || stringChar[i] == 'u' || stringChar[i] == 'v') {
                stringChar[i] = '8';
            }
            if (stringChar[i] == 'w' || stringChar[i] == 'x' || stringChar[i] == 'y' || stringChar[i] == 'z') {
                stringChar[i] = '7';
            }
        }
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
