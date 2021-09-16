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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class c6 extends AppCompatActivity {
    TextInputEditText a,b,c,d,h,i;
    RelativeLayout e;
    RelativeLayout f,g;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c6);
        TextView t = findViewById(R.id.t);
        t.setText("Sem - 6 CGPA");
        ImageView ac = findViewById(R.id.back);
        ImageView ay = findViewById(R.id.info);
        ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c6.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        a=findViewById(R.id.ee1);
        i=findViewById(R.id.ee6);
        c=findViewById(R.id.ee3);
        d=findViewById(R.id.ee4);
        h=findViewById(R.id.ee5);
        tt=findViewById(R.id.dist);
        g=findViewById(R.id.snd);
        e=findViewById(R.id.disk);
        b=findViewById(R.id.ee2);
        f=findViewById(R.id.b1);



        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String ta=a.getText().toString();
                final String tb=b.getText().toString();
                final String tc=c.getText().toString();
                final String td=d.getText().toString();
                final String te=h.getText().toString();
                final String tf=i.getText().toString();
                double value=0,vv=0,vc=0,vd=0,ve=0,vf=0;
                String cc="90000000";

                if(ta.isEmpty() && tb.isEmpty() && tc.isEmpty() && td.isEmpty() && te.isEmpty() && tf.isEmpty()){
                    Toast.makeText(c6.this, "Enter all fields!", Toast.LENGTH_LONG).show();
                }

                else if(ta.isEmpty() && (! tb.isEmpty()) && (! tc.isEmpty()) && (! td.isEmpty()) && ! te.isEmpty() && !tf.isEmpty()){
                    a.setError("Please enter a value");
                    a.requestFocus();
                }
                else if(!ta.isEmpty() && (! tb.isEmpty()) && (! tc.isEmpty()) && (! td.isEmpty()) && ! te.isEmpty() && tf.isEmpty()){
                    i.setError("Please enter a value");
                    i.requestFocus();
                }
                else if(! ta.isEmpty() && (! tb.isEmpty()) && (! tc.isEmpty()) && (! td.isEmpty()) && te.isEmpty() && !tf.isEmpty() ){
                    h.setError("Please enter a value");
                    h.requestFocus();
                }
                else if((! ta.isEmpty() )&& (! tb.isEmpty()) &&  tc.isEmpty() && (! td.isEmpty()) && te.isEmpty() && !tf.isEmpty()){
                    c.setError("Please enter a value");
                    c.requestFocus();
                }

                else if((! ta.isEmpty() )&& tb.isEmpty()&& ! tc.isEmpty() && (! td.isEmpty()) && !te.isEmpty() && !tf.isEmpty()){
                    b.setError("Please enter a value");
                    b.requestFocus();
                }
                else if((! ta.isEmpty() )&& (! tb.isEmpty()) && ! tc.isEmpty() &&  td.isEmpty() && ! te.isEmpty() & !tf.isEmpty()){
                    d.setError("Please enter a value");
                    d.requestFocus();
                }
                else if(ta.isEmpty() || tb.isEmpty() || tc.isEmpty() || td.isEmpty() || te.isEmpty() || tf.isEmpty()){
                    Toast.makeText(c6.this, "Fields are missing!", Toast.LENGTH_LONG).show();
                }

                else if(! ta.isEmpty() && ! tb.isEmpty() && ! tb.isEmpty() && ! td.isEmpty() && ! te.isEmpty() && ! tf.isEmpty()){
                    if(! cc.equals(a) ){
                        value=Double.parseDouble(ta);
                        vv=Double.parseDouble(tb);
                        vc=Double.parseDouble(tc);
                        vd=Double.parseDouble(td);
                        ve=Double.parseDouble(te);
                        vf=Double.parseDouble(tf);
                        if((value<10 || value==10) && (vv<10 || vv==10) && (vc<10 || vc==10) && (vd<10 || vd==10) && (ve<10 || ve==10) && (vf<10 || vf==10)){
                            final double sc = ((value*25)+(vv*24)+(vc*24)+(vd*24)+(ve*25)+(vf*24))/146;
                            final String cv = Double.toString(sc);
                            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(a.getWindowToken(), 0);
                            b.setText("");
                            a.setText("");
                            c.setText("");
                            d.setText("");
                            h.setText("");
                            i.setText("");
                            tt.setText(cv);
                            TextView ss1=findViewById(R.id.ss1);
                            TextView ss2=findViewById(R.id.ss2);
                            TextView ss3=findViewById(R.id.ss3);
                            TextView ss4=findViewById(R.id.ss4);
                            TextView ss5=findViewById(R.id.ss5);
                            TextView ss6=findViewById(R.id.ss6);
                            ss1.setText(ta);
                            ss2.setText(tb);
                            ss3.setText(tc);
                            ss4.setText(td);
                            ss5.setText(te);
                            ss6.setText(tf);
                            e.setVisibility(View.VISIBLE);
                            ScrollView sv = (ScrollView)findViewById(R.id.scroll);
                            sv.scrollTo(0, e.getBottom());
                            g.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                                    String shareBody = "Hey here's my score obtained through *SCORE 17* application,"+'\n'+'\n'+"*GPA [Sem - 1] :* "+ta+'\n'+"*GPA [Sem - 2] :* "+tb+'\n'+"*GPA [Sem - 3] :* "+tc+'\n'+"*GPA [Sem - 4] :* "+td+'\n'+"*GPA [Sem - 5] :* "+te+'\n'+"*GPA [Sem - 6] :* "+tf+'\n'+'\n'+"*CGPA till Sem - 6 :* "+ cv+'\n'+'\n'+"Now check yours using *SCORE 17* using the link below ,"+'\n'+"www.google.com";
                                    intent.setType("text/plain");
                                    intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                                    intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                                    startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
                                }
                            });

                        }
                        else if((!(value<10 || value==10)) && (vc<10 || vc==10)&&(vv<10 || vv==10)&&(vd<10 || vd==10)&&(vf<10 || vf==10)&&(ve<10 || ve==10)){
                            a.setText("");
                            a.setError("Enter a valid GPA");
                            a.requestFocus();
                        }
                        else if(((value<10 || value==10)) && (vc<10 || vc==10)&&(vv<10 || vv==10)&&(vd<10 || vd==10)&&!(vf<10 || vf==10)&&(ve<10 || ve==10)){
                            i.setText("");
                            i.setError("Enter a valid GPA");
                            i.requestFocus();
                        }
                        else if(((value<10 || value==10)) && (vc<10 || vc==10)&&(vv<10 || vv==10)&&(vd<10 || vd==10) & !(ve<10 || ve==10)&&(vf<10 || vf==10)){
                            h.setText("");
                            h.setError("Enter a valid GPA");
                            h.requestFocus();
                        }
                        else if((value<10 || value==10) && (vc<10 || vc==10)&&(vv<10 || vv==10)&&(!(vd<10 || vd==10))&&(ve<10 || ve==10) && (vf<10 || vf==10)){
                            d.setText("");
                            d.setError("Enter a valid GPA");
                            d.requestFocus();
                        }
                        else if ((value<10 || value==10) && (!(vv<10 || vv==10)) && (vc<10 || vc==10) && (vd<10 || vd==10)&&(ve<10 || ve==10) && (vf<10 || vf==10)){
                            b.setText("");
                            b.setError("Enter a valid GPA");
                            b.requestFocus();
                        }
                        else if ((value<10 || value==10) && (vv<10 || vv==10) && (!(vc<10 || vc==10)) && (vd<10 || vd==10)&&(ve<10 || ve==10) && (vf<10 || vf==10)){
                            c.setText("");
                            c.setError("Enter a valid GPA");
                            c.requestFocus();
                        }
                        else{
                            a.setText("");
                            b.setText("");
                            c.setText("");
                            d.setText("");
                            h.setText("");
                            i.setText("");
                            Toast.makeText(c6.this, "Enter a valid GPA", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                else{

                }
            }
        });
    }
}