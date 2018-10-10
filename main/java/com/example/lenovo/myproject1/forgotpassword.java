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

public class forgotpassword extends AppCompatActivity {

    Button bt;
     Database db;
    EditText et,et1;
    String str,str1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        bt=(Button)findViewById(R.id.button2);
        db=new Database(forgotpassword.this);

        et=(EditText)findViewById(R.id.editText);
        et1=(EditText)findViewById(R.id.editText6);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et.getText().toString();
                str1=et1.getText().toString();

                SQLiteDatabase sd=db.getReadableDatabase();
                Cursor c = sd.rawQuery("SELECT use_name,fav FROM user_detail WHERE use_name='" + str + "' AND use_password='"+str1+"'", null);
                if (c.moveToFirst()) {
                    do {

                        if (c.getString(0).equals(str)&&c.getString(1).equals(str1)) {
                            Intent i=new Intent(forgotpassword.this,newpassword.class);
                            i.putExtra("uname",str);
                            i.putExtra("mov",str1);
                            startActivity(i);

                        } else {
                            Toast.makeText(forgotpassword.this, "enter correct username and movie name", Toast.LENGTH_SHORT).show();
                        }
                    } while (c.moveToNext());
                }

            }
        });
    }




}
