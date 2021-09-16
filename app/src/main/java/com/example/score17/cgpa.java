package com.example.score17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class cgpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);
        TextView t = findViewById(R.id.t);
        t.setText("CGPA Calculator");
        ImageView a = findViewById(R.id.back);
        ImageView ay = findViewById(R.id.info);
        ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cgpa.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        RelativeLayout r1 = findViewById(R.id.t11);
        RelativeLayout r2 = findViewById(R.id.t12);
        RelativeLayout r3 = findViewById(R.id.t23);
        RelativeLayout r4 = findViewById(R.id.t24);
        RelativeLayout r5 = findViewById(R.id.t35);
        RelativeLayout r6 = findViewById(R.id.t36);
        RelativeLayout r7 = findViewById(R.id.t47);
        RelativeLayout r8 = findViewById(R.id.t48);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c1.class));
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c2.class));
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c3.class));
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c4.class));
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c5.class));
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c6.class));
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c7.class));
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cgpa.this,c8.class));
            }
        });

    }

}