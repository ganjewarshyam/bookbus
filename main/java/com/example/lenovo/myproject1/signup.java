package com.example.lenovo.myproject1;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
      EditText use,email,pass,con,contact,favo1;
Database db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        use=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        contact=(EditText)findViewById(R.id.editText4);
        pass=(EditText)findViewById(R.id.editText5);
        con=(EditText)findViewById(R.id.editText7);
        favo1=(EditText)findViewById(R.id.favo);
        db=new Database(signup.this);
    }
    public void done(View v){
        if(use.getText().toString().length()==0)
        {
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        }else if(email.getText().toString().length()==0)
        {
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        }else if(contact.getText().toString().length()==0)
        {
            Toast.makeText(this, "Enter Contact", Toast.LENGTH_SHORT).show();
        }else if(pass.getText().toString().length()==0)
        {
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        }else if(con.getText().toString().length()==0)
        {
            Toast.makeText(this, "confirm password", Toast.LENGTH_SHORT).show();
        }else if(pass.getText().toString().equals(con.getText().toString())==false)
        {
            Toast.makeText(this, "not matched", Toast.LENGTH_SHORT).show();
        }else if(favo1.getText().toString().length()==0)
        {
            Toast.makeText(this, "Enter favourite movie", Toast.LENGTH_SHORT).show();
        }else
        {
            SQLiteDatabase sd=db.getWritableDatabase();
            ContentValues cv=new ContentValues();

            cv.put("use_name", use.getText().toString());
            cv.put("use_email", email.getText().toString());
            cv.put("use_contact", contact.getText().toString());
            cv.put("use_password", pass.getText().toString());
            cv.put("fav",favo1.getText().toString());

            long l= sd.insert("user_detail", null, cv);

            if(l>0)
            {
                Toast.makeText(this, "Insert", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Not Insert", Toast.LENGTH_SHORT).show();
            }

           Intent i=new Intent(signup.this,MainActivity.class);
            startActivity(i);


        }
    }
}
