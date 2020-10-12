package com.example.speechtotext2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.speechtotextfinal.R;

import java.util.ArrayList;

public class sst_without_google_dialog extends AppCompatActivity {
    SpeechRecognizer spr;
    Intent intent;
    ArrayList<String> words;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sst_without_google_dialog);
        Button b1 = findViewById(R.id.start);
        Button b2= findViewById(R.id.stop);
        textView=findViewById(R.id.textArea);
        checkPermission();
        convert();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRec();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopRec();
            }
        });
    }
    public void checkPermission()
    {

        if (!(ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)== PackageManager.PERMISSION_GRANTED))
        {
            ActivityCompat.requestPermissions(this,new String[]
                    {
                            Manifest.permission.RECORD_AUDIO},1);
        }

    }
    public void convert()
    {
        spr= SpeechRecognizer.createSpeechRecognizer(this);
        intent= new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        spr.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) {

            }

            @Override
            public void onBeginningOfSpeech() {
                Toast.makeText(sst_without_google_dialog.this,"Dinleniliyor...",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRmsChanged(float rmsdB) {

            }

            @Override
            public void onBufferReceived(byte[] buffer) {

            }

            @Override
            public void onEndOfSpeech() {
                Toast.makeText(sst_without_google_dialog.this,"Kayıt durdu.",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(int error) {

            }

            @Override
            public void onResults(Bundle results) {
                words = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);

                if (words!=null)
                {
                    textView.setText(words.get(0));
                }

            }

            @Override
            public void onPartialResults(Bundle partialResults) {

            }

            @Override
            public void onEvent(int eventType, Bundle params) {

            }
        });
    }


    public void startRec()
    {
        textView.setText("");
        spr.startListening(intent);

    }
    public void stopRec()
    {
        spr.stopListening();
    }
    }

