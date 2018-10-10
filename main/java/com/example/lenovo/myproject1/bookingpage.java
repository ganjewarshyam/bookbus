package com.example.lenovo.myproject1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class bookingpage extends AppCompatActivity {
    String[] arr={"source","delhi","mumbai","pune"};
    String[] arr1={"destination","delhi","mumbai","pune"};
    Spinner sp,sp1;
    Button bt;
    String str,str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingpage);
        sp=(Spinner)findViewById(R.id.spinner);
        sp1=(Spinner)findViewById(R.id.spinner2);
        bt=(Button)findViewById(R.id.button5);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(bookingpage.this,android.R.layout.simple_list_item_1,arr);
        sp.setAdapter(adapter);
        ArrayAdapter<String>adapter1=new ArrayAdapter<String>(bookingpage.this,android.R.layout.simple_list_item_1,arr1);
        sp1.setAdapter(adapter1);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(bookingpage.this, ""+arr[position], Toast.LENGTH_SHORT).show();
                str=arr[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(bookingpage.this, "please select source", Toast.LENGTH_SHORT).show();
            }
        });
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(bookingpage.this, ""+arr1[position], Toast.LENGTH_SHORT).show();
                str1=arr[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(bookingpage.this, "please select destination", Toast.LENGTH_SHORT).show();
            }

        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create object of SharedPreferences.
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(bookingpage.this);
                //now get Editor
                SharedPreferences.Editor editor = sharedPref.edit();
                //put your value
                editor.putString("source",str1);
                editor.putString("destination",str);
                //commits your edits
                editor.commit();

                Intent i=new Intent(bookingpage.this,datepick.class);
                i.putExtra("source",str);
                i.putExtra("destination",str1);
                startActivity(i);
            }
        });

    }
}
