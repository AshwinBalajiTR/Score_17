package com.example.score17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Reset extends AppCompatActivity {
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        final EditText a = findViewById(R.id.editText);
        RelativeLayout b = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aa = a.getText().toString();
                if(aa.isEmpty()){
                    a.setError("Enter a email !");
                    a.requestFocus();
                }
                else {
                    mAuth.sendPasswordResetEmail(aa).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Reset.this, "Password reset link sent to youe mail id", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Reset.this,login.class));
                                finish();
                            }
                            else{
                                String aaa = task.getException().toString();
                                Toast.makeText(Reset.this, "Error : "+aaa, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }
}