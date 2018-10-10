package com.example.lenovo.myproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class datepick extends AppCompatActivity {

    EditText et;

    String str3,str4,str5;
    Bundle bun;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datepick);

        bt=(Button)findViewById(R.id.button6);
        et=(EditText)findViewById(R.id.editText10);

        bun=getIntent().getExtras();
        str4=bun.getString("source");
        str5=bun.getString("destination");

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et.getText().toString().length()==0){
                    Toast.makeText(datepick.this, "enter date first", Toast.LENGTH_SHORT).show();
                }else{
                    str3 = et.getText().toString();
                    Intent i = new Intent(datepick.this, list.class);
                    i.putExtra("source", str4);
                    i.putExtra("destination", str5);
                    i.putExtra("date", str3);
                    startActivity(i);
                }
            }
        });
    }
}
