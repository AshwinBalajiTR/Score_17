package com.example.score17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText a = findViewById(R.id.editText);
        final EditText b = findViewById(R.id.editText2);
        TextView c = findViewById(R.id.textView);
        TextView d = findViewById(R.id.textView3);
        RelativeLayout e =findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,Reset.class));
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,create.class));
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa = a.getText().toString();
                String bb = b.getText().toString();
                if(aa.isEmpty() && !bb.isEmpty()){
                    a.setError("Enter email !");
                    a.requestFocus();
                }
                else if(!aa.isEmpty() && bb.isEmpty()){
                    b.setError("Enter password !");
                    b.requestFocus();
                }
                else if(aa.isEmpty() && bb.isEmpty()){
                    Toast.makeText(login.this,"Enter all fields !",Toast.LENGTH_SHORT).show();
                }
                else {
                    mAuth.signInWithEmailAndPassword(aa,bb).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                if(mAuth.getCurrentUser().isEmailVerified()){
                                    startActivity(new Intent(login.this,first.class));
                                    finish();
                                }
                                else {
                                    Toast.makeText(login.this, "Verify your email and sign in ", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else {
                                String av = task.getException().toString();
                                Toast.makeText(login.this, "Error : "+av, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        if(mAuth.getCurrentUser()!=null && mAuth.getCurrentUser().isEmailVerified()){
            startActivity(new Intent(login.this,first.class));
            finish();
        }
    }
}