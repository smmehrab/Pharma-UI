package com.example.pharma;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginBtn;
    private Button signupBtn;
    private Button forgotPassBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.loginBtn);
        signupBtn = (Button) findViewById(R.id.signupBtn);
        forgotPassBtn = (Button) findViewById(R.id.forgotPassBtn);

        loginBtn.setOnClickListener(this);
        signupBtn.setOnClickListener(this);
        forgotPassBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == loginBtn){
            Intent intent = new Intent(LoginActivity.this, MainAppActivity.class);
            startActivity(intent);
            finish();
        }

        else if(v == signupBtn){
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
            finish();
        }

        else if(v == forgotPassBtn){
            Intent intent = new Intent(LoginActivity.this, ForgotPassActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
