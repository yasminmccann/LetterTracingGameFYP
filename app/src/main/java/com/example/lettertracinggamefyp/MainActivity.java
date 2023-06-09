package com.example.lettertracinggamefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tracinglibrary.bean.LetterFactory;
import com.example.tracinglibrary.view.TracingLetterView;

public class MainActivity extends AppCompatActivity {

    private TracingLetterView letterView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letterView = findViewById(R.id.letter);
        letterView.setLetterChar(LetterFactory.A);
        letterView.setPointColor(Color.BLUE);
        letterView.setInstructMode(true);
        letterView.setTracingListener(new TracingLetterView.TracingListener() {
            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,
                        "tracing finished", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : " + x + " y : " + y);
            }
        });
    }
}