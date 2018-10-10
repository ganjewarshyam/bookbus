package com.example.lenovo.myproject1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt;
Database db;
EditText et,et1;
String str,str1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.signin);
        et=(EditText)findViewById(R.id.username);
        et1=(EditText)findViewById(R.id.editText3);
        db=new Database(MainActivity.this);
      bt.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              str=et.getText().toString();
              str1=et1.getText().toString();

              SQLiteDatabase sd=db.getReadableDatabase();

              Cursor c = sd.rawQuery("SELECT use_name,use_password FROM user_detail WHERE use_name='" + str + "' AND use_password='"+str1+"'", null);
              if (c.moveToFirst()) {
                  do {

                      if (c.getString(0).equals(str)&&c.getString(1).equals(str1)) {
                          Intent i=new Intent(MainActivity.this,finalpage.class);
                          startActivity(i);

                      } else {
                          Toast.makeText(MainActivity.this, "enter correct username and password", Toast.LENGTH_SHORT).show();
                      }
                  } while (c.moveToNext());
              }

          }
      });




    }

    public void signup(View v){
        Intent i=new Intent(MainActivity.this,signup.class);
        startActivity(i);

    }

    public void forgotpassword(View v){
        Intent i=new Intent(MainActivity.this,forgotpassword.class);
        startActivity(i);

    }
}
