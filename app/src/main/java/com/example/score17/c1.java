package com.example.score17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class c1 extends AppCompatActivity {
    RelativeLayout d;
    TextInputEditText a;
    TextView tt;
    RelativeLayout f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);
        TextView t = findViewById(R.id.t);
        t.setText("Sem - 1 CGPA");
        ImageView ac = findViewById(R.id.back);
        ImageView ay = findViewById(R.id.info);
        ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c1.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        a=findViewById(R.id.ee1);
        d=findViewById(R.id.disp);
        tt=findViewById(R.id.dist);
        f=findViewById(R.id.b1);
        g=findViewById(R.id.share);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double value=0;
                final String temp=a.getText().toString();
                if(temp.isEmpty()){
                    a.setError("Please enter a value");
                    a.requestFocus();
                }
                else{
                        value=Double.parseDouble(temp);
                        if(value<10 || value==10){
                            d.setVisibility(View.VISIBLE);
                            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(a.getWindowToken(), 0);
                            a.setText("");
                            tt.setText(temp);
                            TextView ss1=findViewById(R.id.ss1);
                            ss1.setText(temp);
                            d.setVisibility(View.VISIBLE);
                            g.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                                    String shareBody = "Hey here's my score obtained through *SCORE 17* application,"+'\n'+'\n'+"*GPA [Sem - 1] :* "+temp+'\n'+'\n'+"*CGPA till Sem - 1 :* "+ temp+'\n'+'\n'+"Now check yours using *SCORE 17* using the link below ,"+'\n'+"www.google.com";
                                    intent.setType("text/plain");
                                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                                    intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                                    startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
                                }
                            });
                        }
                        else{
                            a.setText("");
                            a.setError("Enter a valid GPA");
                            a.requestFocus();
                        }

                }
            }
        });
    }
}