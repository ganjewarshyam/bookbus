package com.example.lenovo.myproject1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class available extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    Bundle bun;
    String busid;
    Database db;
    int i,a;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);
        try {
            c1 = (CheckBox) findViewById(R.id.checkBox13);
            c2 = (CheckBox) findViewById(R.id.checkBox12);
            c3 = (CheckBox) findViewById(R.id.checkBox11);
            c4 = (CheckBox) findViewById(R.id.checkBox10);
            c5 = (CheckBox) findViewById(R.id.checkBox9);
            c6 = (CheckBox) findViewById(R.id.checkBox8);
            c7 = (CheckBox) findViewById(R.id.checkBox7);
            c8 = (CheckBox) findViewById(R.id.checkBox6);
            c9 = (CheckBox) findViewById(R.id.checkBox5);
            c10 = (CheckBox) findViewById(R.id.checkBox3);
            c11 = (CheckBox) findViewById(R.id.checkBox2);
            c12 = (CheckBox) findViewById(R.id.checkBox);
            bt=(Button)findViewById(R.id.button2);
            bun = getIntent().getExtras();
            busid = bun.getString("bus_id");
            a = bun.getInt("AVALAIBILITY");
            db = new Database(available.this);

            SQLiteDatabase sd = db.getReadableDatabase();
            Cursor c = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='1'", null);
            if (c.moveToFirst()) {
                do {

                    if (c.getString(0).equals("true")) {
                        c1.setChecked(true);
                        c1.setClickable(false);
                    } else {
                        c1.setChecked(false);
                    }
                } while (c.moveToNext());
            }

            Cursor ca = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='2'", null);
            if (ca.moveToFirst()) {
                do {
                    if (ca.getString(0).equals("true")) {
                        c2.setChecked(true);
                        c2.setClickable(false);
                    } else {
                        c2.setChecked(false);
                    }
                } while (ca.moveToNext());
            }


            Cursor cb = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='3'", null);
            if (cb.moveToFirst()) {
                do {
                    if (cb.getString(0).equals("true")) {
                        c3.setChecked(true);
                        c3.setClickable(false);
                    } else {
                        c3.setChecked(false);
                    }
                } while (cb.moveToNext());
            }

            Cursor cc = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='4'", null);
            if (cc.moveToFirst()) {
                do {
                    if (cc.getString(0).equals("true")) {
                        c4.setChecked(true);
                        c4.setClickable(false);
                    } else {
                        c4.setChecked(false);
                    }
                } while (cc.moveToNext());
            }

            Cursor cd = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='5'", null);
            if (cd.moveToFirst()) {
                do {
                    if (cd.getString(0).equals("true")) {
                        c5.setChecked(true);
                        c5.setClickable(false);
                    } else {
                        c5.setChecked(false);
                    }
                } while (cd.moveToNext());
            }

            Cursor ce = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='6'", null);
            if (ce.moveToFirst()) {
                do {
                    if (ce.getString(0).equals("true")) {
                        c6.setChecked(true);
                        c6.setClickable(false);
                    } else {
                        c6.setChecked(false);
                    }
                } while (ce.moveToNext());
            }
            Cursor cf = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='7'", null);
            if (cf.moveToFirst()) {
                do {
                    if (cf.getString(0).equals("true")) {
                        c7.setChecked(true);
                        c7.setClickable(false);
                    } else {
                        c7.setChecked(false);
                    }
                } while (cf.moveToNext());
            }

            Cursor cg = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='8'", null);
            if (cg.moveToFirst()) {
                do {
                    if (cg.getString(0).equals("true")) {
                        c8.setChecked(true);
                        c8.setClickable(false);
                    } else {
                        c8.setChecked(false);
                    }
                } while (cg.moveToNext());
            }

            Cursor ch = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='9'", null);
            if (ch.moveToFirst()) {
                do {
                    if (ch.getString(0).equals("true")) {
                        c9.setChecked(true);
                        c9.setClickable(false);
                    } else {
                        c9.setChecked(false);
                    }
                } while (ch.moveToNext());
            }
            Cursor ci = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='10'", null);
            if (ci.moveToFirst()) {
                do {
                    if (ci.getString(0).equals("true")) {
                        c10.setChecked(true);
                        c10.setClickable(false);
                    } else {
                        c10.setChecked(false);
                    }
                } while (ci.moveToNext());
            }

            Cursor cj = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='11'", null);
            if (cj.moveToFirst()) {
                do {
                    if (cj.getString(0).equals("true")) {
                        c11.setChecked(true);
                        c11.setClickable(false);
                    } else {
                        c11.setChecked(false);
                    }
                } while (cj.moveToNext());
            }

            Cursor ck = sd.rawQuery("SELECT status FROM bus_avai WHERE bus_id='" + busid + "' AND seat_no='12'", null);
            if (ck.moveToFirst()) {
                do {
                    if (ck.getString(0).equals("true")) {
                        c12.setChecked(true);
                        c12.setClickable(false);
                    } else {
                        c12.setChecked(false);
                    }
                } while (ck.moveToNext());
            }
        }catch (Exception e)
        {
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_LONG).show();
        }
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd1 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd1.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='1' ");
                }
                else{
                    sd1.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='1' ");
                    i--;
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            SQLiteDatabase sd2 = db.getWritableDatabase();
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd2.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='2' ");
                }
                else{
                    i--;
                    sd2.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='2' ");
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            SQLiteDatabase sd3 = db.getWritableDatabase();
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd3.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='3' ");
                }
                else{
                    i--;
                    sd3.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='3' ");
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd4 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd4.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='4' ");
                }
                else{
                    i--;
                    sd4.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='4' ");
                }
            }
        });
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd5 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd5.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='5' ");
                }
                else{
                    i--;
                    sd5.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='5' ");
                }
            }
        });
        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd6 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd6.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='6' ");
                }
                else{
                    i--;
                    sd6.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='6' ");
                }
            }
        });
        c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd7 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd7.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='7' ");
                }
                else{
                    i--;
                    sd7.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='7' ");
                }
            }
        });
        c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd8 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd8.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='8' ");
                }
                else{
                    i--;
                    sd8.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='8' ");
                }
            }
        });
        c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd9 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd9.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='9' ");
                }
                else{
                    i--;
                    sd9.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='9' ");
                }
            }
        });
        c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd10 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd10.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='10' ");
                }
                else{
                    i--;
                    sd10.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='10' ");
                }
            }
        });
        c11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd11 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd11.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='11' ");
                }
                else{
                    i--;
                    sd11.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='11' ");
                }
            }
        });
        c12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            SQLiteDatabase sd12 = db.getWritableDatabase();
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    i++;
                    sd12.execSQL("UPDATE bus_avai SET status='true' WHERE bus_id='"+busid+"' AND seat_no='12' ");
                }
                else{
                    i--;
                    sd12.execSQL("UPDATE bus_avai SET status='false' WHERE bus_id='"+busid+"' AND seat_no='12' ");
                }
            }
        });
    }
    public void count(View v){
        int b=a-i;
        SQLiteDatabase sd13 = db.getWritableDatabase();
        Toast.makeText(this, "booked seats is/are"+i, Toast.LENGTH_SHORT).show();
        sd13.execSQL("UPDATE bus SET AVALAIBILITY='"+b+"' WHERE bus_id='"+busid+"' ");
        Intent i=new Intent(available.this,MainActivity.class);
        startActivity(i);
    }
}
