package com.example.score17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class g8 extends AppCompatActivity {
    RadioGroup a,b,c;
    RadioButton A,B,C;
    RelativeLayout button;
    RelativeLayout rl;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g8);
        TextView t = findViewById(R.id.t);
        t.setText("Sem - 8 GPA");
        ImageView ax = findViewById(R.id.back);
        ax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView ay = findViewById(R.id.info);
        ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(g8.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        a= findViewById(R.id.ab);
        rl=findViewById(R.id.disp);
        tt=findViewById(R.id.dist);
        b= findViewById(R.id.bb);
        c= findViewById(R.id.cb);
        button = findViewById(R.id.calcb);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pra=3,prb=3,prc=10;
                int aa=a.getCheckedRadioButtonId();
                int bb=b.getCheckedRadioButtonId();
                int cc=c.getCheckedRadioButtonId();



                A=findViewById(aa);
                B=findViewById(bb);
                C=findViewById(cc);

                if(a.getCheckedRadioButtonId() != -1 && b.getCheckedRadioButtonId() != -1 && c.getCheckedRadioButtonId() != -1){
                    String a1= A.getText().toString();
                    String a2= B.getText().toString();
                    String a3= C.getText().toString();

                    switch (a1) {
                        case "O":
                            pra *= 10;
                            break;
                        case "A+":
                            pra *= 9;
                            break;
                        case "A":
                            pra *= 8;
                            break;
                        case "B+":
                            pra *= 7;
                            break;
                        case "B":
                            pra *= 6;
                            break;
                        case "RA":
                            pra = 0;
                            break;
                        default:
                            break;
                    }

                    switch (a2) {
                        case "O":
                            prb *= 10;
                            break;
                        case "A+":
                            prb *= 9;
                            break;
                        case "A":
                            prb *= 8;
                            break;
                        case "B+":
                            prb *= 7;
                            break;
                        case "B":
                            prb *= 6;
                            break;
                        case "RA":
                            prb = 0;
                            break;
                        default:

                            break;
                    }

                    switch (a3) {
                        case "O":
                            prc *= 10;
                            break;
                        case "A+":
                            prc *= 9;
                            break;
                        case "A":
                            prc *= 8;
                            break;
                        case "B+":
                            prc *= 7;
                            break;
                        case "B":
                            prc *= 6;
                            break;
                        case "RA":
                            prc = 0;
                            break;
                        default:
                            break;
                    }



                    double z = pra+prb+prc;
                    double res = z/16;
                    final String s =Double.toString(res);

                    rl.setVisibility(View.VISIBLE);
                    tt.setText(s);
                    ScrollView sv = (ScrollView)findViewById(R.id.scroll);
                    sv.scrollTo(0, rl.getBottom());
                    RelativeLayout xx=findViewById(R.id.snd);
                    xx.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                            String shareBody = "Hey here's my score obtained through *SCORE 17* application,"+'\n'+'\n'+"*GPA [Sem - 8] :* "+s+'\n'+'\n'+"Now check yours using *SCORE 17* using the link below ,"+'\n'+"www.google.com";
                            intent.setType("text/plain");
                            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                            startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
                        }
                    });
                }
                else {
                    Toast.makeText(g8.this, "Check all fields!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}