package com.example.acengganteng.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView share1,isi1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share1 = (TextView) findViewById(R.id.share);
        isi1 = (TextView) findViewById(R.id.isi);

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_TEXT,isi1.getText().toString());
        i.setType("text/plain");
        startActivity(i);
            }
        });

    }}
