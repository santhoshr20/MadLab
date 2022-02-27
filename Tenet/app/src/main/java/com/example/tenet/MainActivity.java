package com.example.tenet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.webView);
        wv.loadUrl("https://www.espncricinfo.com/");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opt1:
                wv = findViewById(R.id.webView);
                wv.loadUrl("file:///android_asset/f1.html");
                return true;
            case R.id.opt2:
                wv = findViewById(R.id.webView);
                wv.loadUrl("file:///android_asset/f2.html");
                return true;

            default:return super.onOptionsItemSelected(item);

        }
    }

}