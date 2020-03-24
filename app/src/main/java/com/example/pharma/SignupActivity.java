package com.example.pharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signupBtn;
    private Button gobackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupBtn = (Button) findViewById(R.id.signupBtn);
        gobackBtn = (Button) findViewById(R.id.gobackBtn);

        signupBtn.setOnClickListener(this);
        gobackBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == signupBtn){
            Intent intent = new Intent(SignupActivity.this, VerifyActivity.class).putExtra("from", "signup");
            startActivity(intent);
            finish();
        }

        else if(v == gobackBtn){
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
