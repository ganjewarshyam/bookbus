package com.example.lenovo.myproject1;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class newpassword extends AppCompatActivity {
    Bundle bun;
    Database db;
    String str2,str1;
    EditText pass,con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpassword);
//      try {
          db = new Database(newpassword.this);

          pass = (EditText) findViewById(R.id.editText8);
          con = (EditText) findViewById(R.id.editText9);
          bun = getIntent().getExtras();
          str2 = bun.getString("uname");
          str1 = bun.getString("mov");
//      }catch (Exception e){
//          Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
//      }
    }
    public void next(View v) {

        try {
            SQLiteDatabase sq = db.getWritableDatabase();
            if (pass.getText().toString().length() == 0) {
                Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            } else if (con.getText().toString().length() == 0) {
                Toast.makeText(this, "confirm password", Toast.LENGTH_SHORT).show();
            } else if (pass.getText().toString().equals(con.getText().toString()) == false) {
                Toast.makeText(this, "not matched", Toast.LENGTH_SHORT).show();
            } else {
               // ContentValues cv=new ContentValues();
                sq.execSQL("UPDATE user_detail SET use_password='"+pass.getText().toString()+"' WHERE use_name='"+str2+"'AND fav='"+str1+"' ");
                //cv.put("use_password", pass.getText().toString());

               // long l= sq.update("user_detail", cv, "use_name=? AND fav=?", new String[]{str2,str1});


              //  if(l>0)
                //{
                  //  Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();

                //}else{
                  //  Toast.makeText(this, "Not Update", Toast.LENGTH_SHORT).show();
                //}
                Intent i = new Intent(newpassword.this, MainActivity.class);
                startActivity(i);
            }
        }catch (Exception e){
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
