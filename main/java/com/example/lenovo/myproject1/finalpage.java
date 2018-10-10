package com.example.lenovo.myproject1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finalpage extends AppCompatActivity {
    Button bt,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalpage);
        bt=(Button)findViewById(R.id.button7);
        b1=(Button)findViewById(R.id.button10);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(finalpage.this,bookingpage.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(finalpage.this);

                String sou = sharedPref.getString("source", "Not Available");
                String des = sharedPref.getString("destination", "Not Available");
                Intent i=new Intent(finalpage.this,datepick.class);
                i.putExtra("source",sou);
                i.putExtra("destination",des);
                startActivity(i);
            }
        });
    }
}
