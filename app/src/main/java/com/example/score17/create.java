package com.example.score17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class create extends AppCompatActivity {
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        final EditText a = findViewById(R.id.editText);
        final EditText b = findViewById(R.id.editText2);
        RelativeLayout c =findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        c.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(create.this,"Enter all fields !",Toast.LENGTH_SHORT).show();
                }
                else {
                    mAuth.createUserWithEmailAndPassword(aa,bb).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if(task.isSuccessful()){
                                            Toast.makeText(create.this, "Verify your email and sign in", Toast.LENGTH_SHORT).show();
                                            startActivity(new Intent(create.this,login.class));
                                            finish();
                                        }else{
                                            String abc = task.getException().toString();
                                            Toast.makeText(create.this,"Error : "+abc, Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }
                            else{
                                String ab = task.getException().toString();
                                Toast.makeText(create.this,"Error : "+ab, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}