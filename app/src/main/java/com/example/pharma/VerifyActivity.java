package com.example.pharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

public class VerifyActivity extends AppCompatActivity implements View.OnClickListener {

    Pinview pinview;

    private Button verifyBtn;
    private Button gobackBtn;
    private Button resendCodeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        pinview = (Pinview) findViewById(R.id.pinView);

        verifyBtn = (Button) findViewById(R.id.verifyBtn);
        gobackBtn = (Button) findViewById(R.id.gobackBtn);
        resendCodeBtn = (Button) findViewById(R.id.resendCodeBtn);

        pinview.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean fromUser) {
                Toast.makeText(VerifyActivity.this, pinview.getValue(), Toast.LENGTH_SHORT);
            }
        });

        verifyBtn.setOnClickListener(this);
        gobackBtn.setOnClickListener(this);
        resendCodeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == verifyBtn){

            if(getIntent().getStringExtra("from").equals("forgotPass")) {
                Intent intent = new Intent(VerifyActivity.this, ResetPassActivity.class);
                startActivity(intent);
                finish();
            }

            else if(getIntent().getStringExtra("from").equals("signup")) {
                Intent intent = new Intent(VerifyActivity.this, MainAppActivity.class);
                startActivity(intent);
                finish();
            }
        }

        else if(v == gobackBtn){

            if(getIntent().getStringExtra("from").equals("forgotPass")) {
                Intent intent = new Intent(VerifyActivity.this, ForgotPassActivity.class);
                startActivity(intent);
                finish();
            }

            else if(getIntent().getStringExtra("from").equals("signup")) {
                Intent intent = new Intent(VerifyActivity.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        }

        else if(v == resendCodeBtn){

        }
    }
}
