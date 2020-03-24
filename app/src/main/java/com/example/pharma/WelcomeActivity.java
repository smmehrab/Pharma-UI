package com.example.pharma;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class WelcomeActivity extends AppCompatActivity {

    private int progress;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        progressBar = (ProgressBar) findViewById(R.id.welcome_screen_progress_bar);

        Thread thread = new Thread(){
            @Override
            public void run() {
                doWork();
                startApp();
            }
        };

        thread.start();
    }

    public void startApp(){
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void doWork(){
        for(progress=20;progress<=100;progress+=80) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
