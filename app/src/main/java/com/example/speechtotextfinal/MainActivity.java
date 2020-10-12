package com.example.speechtotextfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.speechtotext2.sst_without_google_dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent gecis =new Intent(this,sst_with_google_dialog.class);
        final Intent gecis2 =new Intent(this, sst_without_google_dialog.class);
        Button b1=findViewById(R.id.button2);
        Button b2= findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(gecis2);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(gecis);
            }
        });

    }
}
