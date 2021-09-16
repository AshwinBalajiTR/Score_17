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

public class g4 extends AppCompatActivity {
    RadioGroup a,b,c,d,e,f,g,h,i;
    RadioButton A,B,C,D,E,F,G,H,I;
    RelativeLayout button;
    RelativeLayout rl;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g4);
        TextView t = findViewById(R.id.t);
        t.setText("Sem - 4 GPA");
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
                Toast.makeText(g4.this, "Created by Ashwin Balaji T R", Toast.LENGTH_SHORT).show();
            }
        });
        a= findViewById(R.id.ab);
        rl=findViewById(R.id.disp);
        tt=findViewById(R.id.dist);
        b= findViewById(R.id.bb);
        c= findViewById(R.id.cb);
        d= findViewById(R.id.db);
        e= findViewById(R.id.eb);
        f= findViewById(R.id.fb);
        g= findViewById(R.id.gb);
        h= findViewById(R.id.hb);
        i= findViewById(R.id.ib);
        button = findViewById(R.id.calcb);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pra=4,prb=3,prc=3,prd=3,pre=3,prf=3,prg=2,prh=2,pri=1;
                int aa=a.getCheckedRadioButtonId();
                int bb=b.getCheckedRadioButtonId();
                int cc=c.getCheckedRadioButtonId();
                int dd=d.getCheckedRadioButtonId();
                int ee=e.getCheckedRadioButtonId();
                int ff=f.getCheckedRadioButtonId();
                int gg=g.getCheckedRadioButtonId();
                int hh=h.getCheckedRadioButtonId();
                int ii=i.getCheckedRadioButtonId();

                A=findViewById(aa);
                B=findViewById(bb);
                C=findViewById(cc);
                D=findViewById(dd);
                E=findViewById(ee);
                F=findViewById(ff);
                G=findViewById(gg);
                H=findViewById(hh);
                I=findViewById(ii);

                if(a.getCheckedRadioButtonId() != -1 && b.getCheckedRadioButtonId() != -1 && c.getCheckedRadioButtonId() != -1
                        && d.getCheckedRadioButtonId() != -1 && e.getCheckedRadioButtonId() != -1 && f.getCheckedRadioButtonId() != -1
                        &&g.getCheckedRadioButtonId() != -1 && h.getCheckedRadioButtonId() != -1 && i.getCheckedRadioButtonId() != -1 ){
                    String a1= A.getText().toString();
                    String a2= B.getText().toString();
                    String a3= C.getText().toString();
                    String a4= D.getText().toString();
                    String a5= E.getText().toString();
                    String a6= F.getText().toString();
                    String a7= G.getText().toString();
                    String a8= H.getText().toString();
                    String a9= I.getText().toString();

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

                    switch (a4) {
                        case "O":
                            prd *= 10;
                            break;
                        case "A+":
                            prd *= 9;
                            break;
                        case "A":
                            prd *= 8;
                            break;
                        case "B+":
                            prd *= 7;
                            break;
                        case "B":
                            prd *= 6;
                            break;
                        case "RA":
                            prd = 0;
                            break;
                        default:

                            break;
                    }

                    switch (a5) {
                        case "O":
                            pre *= 10;
                            break;
                        case "A+":
                            pre *= 9;
                            break;
                        case "A":
                            pre *= 8;
                            break;
                        case "B+":
                            pre *= 7;
                            break;
                        case "B":
                            pre *= 6;
                            break;
                        case "RA":
                            pre = 0;
                            break;
                        default:
                            break;
                    }

                    switch (a6) {
                        case "O":
                            prf *= 10;
                            break;
                        case "A+":
                            prf *= 9;
                            break;
                        case "A":
                            prf *= 8;
                            break;
                        case "B+":
                            prf *= 7;
                            break;
                        case "B":
                            prf *= 6;
                            break;
                        case "RA":
                            prf = 0;
                            break;
                        default:
                            break;
                    }

                    switch (a7) {
                        case "O":
                            prg *= 10;
                            break;
                        case "A+":
                            prg *= 9;
                            break;
                        case "A":
                            prg *= 8;
                            break;
                        case "B+":
                            prg *= 7;
                            break;
                        case "B":
                            prg *= 6;
                            break;
                        case "RA":
                            prg = 0;
                            break;
                        default:

                            break;
                    }

                    switch (a8) {
                        case "O":
                            prh *= 10;
                            break;
                        case "A+":
                            prh *= 9;
                            break;
                        case "A":
                            prh *= 8;
                            break;
                        case "B+":
                            prh *= 7;
                            break;
                        case "B":
                            prh *= 6;
                            break;
                        case "RA":
                            prh = 0;
                            break;
                        default:
                            break;
                    }

                    switch (a9) {
                        case "O":
                            pri *= 10;
                            break;
                        case "A+":
                            pri *= 9;
                            break;
                        case "A":
                            pri *= 8;
                            break;
                        case "B+":
                            pri *= 7;
                            break;
                        case "B":
                            pri *= 6;
                            break;
                        case "RA":
                            pri = 0;
                            break;
                        default:
                            break;
                    }



                    double z = pra+prb+prc+prd+pre+prf+prg+prh+pri;
                    double res = z/24;
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
                            String shareBody = "Hey here's my score obtained through *SCORE 17* application,"+'\n'+'\n'+"*GPA [Sem - 4] :* "+s+'\n'+'\n'+"Now check yours using *SCORE 17* using the link below ,"+'\n'+"www.google.com";
                            intent.setType("text/plain");
                            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.share_subject));
                            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                            startActivity(Intent.createChooser(intent, getString(R.string.share_using)));
                        }
                    });
                }
                else {
                    Toast.makeText(g4.this, "Check all fields!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}