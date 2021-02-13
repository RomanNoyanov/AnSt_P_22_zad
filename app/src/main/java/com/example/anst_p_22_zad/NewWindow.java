package com.example.anst_p_22_zad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
                String message =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView=new TextView(this);
        textView.setTextSize(20);
        textView.setText(message);
        setContentView(textView);
    }
}