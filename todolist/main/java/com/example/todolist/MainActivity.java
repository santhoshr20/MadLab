package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button todo1=findViewById(R.id.button1);
        todo1.setOnClickListener(view-> {
                    Intent activity1 = new Intent(MainActivity.this, Activity1.class);
                    startActivity(activity1);

                });
        Button todo2=findViewById(R.id.button2);
        todo2.setOnClickListener(view->{
            Intent activity2=new Intent(MainActivity.this,Activity2.class);
            startActivity(activity2);


        });

        Button todo3=findViewById(R.id.button3);
        todo3.setOnClickListener(view->{
            Intent activity3=new Intent(MainActivity.this,Activity3.class);
            startActivity(activity3);
        });

        Button todo4=findViewById(R.id.button4);
        todo4.setOnClickListener(view->{
            Intent activity4=new Intent(MainActivity.this,Activity4.class);
            startActivity(activity4);
        });

        Button todo5=findViewById(R.id.button5);
        todo5.setOnClickListener(view->{
            Intent activity5=new Intent(MainActivity.this,Activity5.class);
            startActivity(activity5);
        });
    }
}