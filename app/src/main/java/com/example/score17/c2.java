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

public class c2 extends AppCompatActivity {
    TextInputEditText a,b;
    RelativeLayout e;
    RelativeLayout f,g;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
        TextView t = findViewById(R.id.t);
        t.setText("Sem - 2 CGPA");
        ImageView ac = findViewById(R.id.back);
        ImageView ay = findViewById(R.id.info);
        ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c2.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        a=findViewById(R.id.ee1);
        tt=findViewById(R.id.dist);
        g=findViewById(R.id.share);
        e=findViewById(R.id.disk);
        b=findViewById(R.id.ee2);
        f=findViewById(R.id.b1);


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String t=a.getText().toString();
                final String tp=b.getText().toString();
                double value=0,vv=0;
                String cc="90000000";

                if(t.isEmpty() && tp.isEmpty()){
                    Toast.makeText(c2.this, "Enter all fields!", Toast.LENGTH_LONG).show();
                }

                else if(t.isEmpty() && (! tp.isEmpty())){
                    a.setError("Please enter a value");
                    a.requestFocus();
                }

                else if((! t.isEmpty() )&& tp.isEmpty()){
                    b.setError("Please enter a value");
                    b.requestFocus();
                }

                else if(! t.isEmpty() && ! tp.isEmpty()){
                    if(! cc.equals(a) ){
                        value=Double.parseDouble(t);
                        vv=Double.parseDouble(tp);
                        if((value<10 || value==10) && (vv<10 || vv==10)){
                            final double sc = ((value*25)+(vv*24))/49;
                            final String cv = Double.toString(sc);
                            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(a.getWindowToken(), 0);
                            b.setText("");
                            a.setText("");
                            tt.setText(cv);
                            TextView ss1=findViewById(R.id.ss1);
                            TextView ss2=findViewById(R.id.ss2);
                            ss1.setText(t);
                            ss2.setText(tp);
                            e.setVisibility(View.VISIBLE);
                            g.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                                    String shareBody = "Hey here's my score obtained through *SCORE 17* application,"+'\n'+'\n'+"*GPA [Sem - 1] :* "+t+'\n'+"*GPA [Sem - 2] :* "+tp+'\n'+'\n'+"*CGPA till Sem - 2 :* "+ cv+'\n'+'\n'+"Now check yours using *SCORE 17* using the link below ,"+'\n'+"www.google.com";
                                    intent.setType("text/plain");
                                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                                    intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                                    startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
                                }
                            });

                        }
                        else if((!(value<10 || value==10)) && (vv<10 || vv==10)){
                            a.setText("");
                            a.setError("Enter a valid GPA");
                            a.requestFocus();
                        }
                        else if ((value<10 || value==10) && (!(vv<10 || vv==10))){
                            b.setText("");
                            b.setError("Enter a valid GPA");
                            b.requestFocus();
                        }
                        else{
                            a.setText("");
                            b.setText("");
                            Toast.makeText(c2.this, "Enter a valid GPA !", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else{

                }
            }
        });
    }
}