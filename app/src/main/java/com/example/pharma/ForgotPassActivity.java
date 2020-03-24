package com.example.pharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotPassActivity extends AppCompatActivity implements View.OnClickListener {

    private Button continueBtn;
    private Button gobackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        continueBtn = (Button) findViewById(R.id.continueBtn);
        gobackBtn = (Button) findViewById(R.id.gobackBtn);

        continueBtn.setOnClickListener(this);
        gobackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == continueBtn){
            Intent intent = new Intent(ForgotPassActivity.this, VerifyActivity.class).putExtra("from", "forgotPass");
            startActivity(intent);
            finish();
        }

        else if(v == gobackBtn){
            Intent intent = new Intent(ForgotPassActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
