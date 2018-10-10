package com.example.lenovo.myproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }
    public void next(View v){
        Intent i=new Intent(otp.this,newpassword.class);
        startActivity(i);

    }
}
