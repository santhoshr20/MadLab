package com.example.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = findViewById(R.id.button2);
        db = new DBHelper(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer buf = new StringBuffer();
                String name = ((EditText)findViewById(R.id.editTextTextPersonName)).getText().toString();
                buf.append(name+"\n");
                String age = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
                buf.append(age+"\n");
                String date = ((EditText)findViewById(R.id.editTextDate)).getText().toString();
                buf.append(date+"\n");
                RadioGroup rg = findViewById(R.id.rg1);
                int selectedid = rg.getCheckedRadioButtonId();
                RadioButton selRadio = (RadioButton) findViewById(selectedid);
                buf.append(selRadio.getText().toString()+"\n");
                String checkedValues = "";
                CheckBox c1 = findViewById(R.id.checkBox);
                if(c1.isChecked()) {
                    String val = c1.getText().toString();
                    checkedValues += val;
                    buf.append(val+"\n");
                }
                CheckBox c2 = findViewById(R.id.checkBox2);
                if(c2.isChecked()) {
                    String val = c2.getText().toString();
                    checkedValues += val;
                    buf.append(val+"\n");
                }
                String rad = selRadio.getText().toString();
                if(name == null || age == null || date == null || rad == null || checkedValues == null)
                    System.out.println("Nullllllllll");
                else
                    System.out.println("NOt null");
                Boolean inserted = db.insertData(name, age, date, rad, checkedValues);
                if(inserted == true)
                    Toast.makeText(MainActivity.this, "Successfully inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Insertion failed", Toast.LENGTH_LONG).show();
                Intent i=new Intent(MainActivity.this,summa.class);
                i.putExtra("All",buf.toString());
                startActivity(i);
            }
        });
    }
}