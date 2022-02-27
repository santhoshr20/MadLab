package com.example.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class summa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summa);
        String all=getIntent().getStringExtra("All");
        AlertDialog.Builder b=new AlertDialog.Builder(summa.this);
        b.setMessage(all);
        b.setCancelable(true);
        b.setTitle("Summa");
        b.show();
    }
}