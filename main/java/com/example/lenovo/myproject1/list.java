package com.example.lenovo.myproject1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class list extends AppCompatActivity {
    Database db;

    ArrayList<String> b_name = new ArrayList<String>();
    ArrayList<String> time = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();
    ArrayList<Integer> seats = new ArrayList<Integer>();
    ArrayList<String>id=new ArrayList<String>();
    ListView list;
    Bundle bun;
    String str,str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView) findViewById(R.id.list);
        bun=getIntent().getExtras();
        str=bun.getString("source");
        str1=bun.getString("destination");

       str2=bun.getString("date");

        db = new Database(list.this);
        SQLiteDatabase sd = db.getReadableDatabase();
        Cursor c = sd.rawQuery("SELECT bus_id,B_name,TIME,AVALAIBILITY,PRICE FROM bus WHERE SOURCE='"+str+"' AND DESTINATION='"+str1+"' AND DATE='"+str2+"'", null);
        String s1, s2, s4;
        if (c.moveToFirst()) {
            do {
                id.add(c.getString(0));
                s1 = c.getString(1);
                b_name.add(s1);
                s2 = c.getString(2);
                time.add(s2);
                seats.add(c.getInt(3));
                s4 = c.getString(4);
                price.add(s4);


            }
            while (c.moveToNext());

            list.setAdapter(new Data());
        }

    }

    class Data extends BaseAdapter {
        LayoutInflater inf = getLayoutInflater();

        @Override
        public int getCount() {
            return b_name.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inf.inflate(R.layout.custom, null);

            TextView bname, time_t, price_t, avail;
            Button  b2;


            bname = (TextView) convertView.findViewById(R.id.b_name);
            price_t = (TextView) convertView.findViewById(R.id.price);
            time_t = (TextView) convertView.findViewById(R.id.time);
            avail = (TextView) convertView.findViewById(R.id.seats);

            b2 = (Button) convertView.findViewById(R.id.button3);


            bname.setText(b_name.get(position));
            time_t.setText(time.get(position));
            price_t.setText(price.get(position));
            avail.setText(""+seats.get(position));
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent i = new Intent(list.this, available.class);
                        i.putExtra("AVALAIBILITY", seats.get(position));
                        i.putExtra("bus_id", id.get(position));

                        startActivity(i);
                    }
                    catch (Exception e){
                        Toast.makeText(list.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });



            return convertView;
        }
    }
}