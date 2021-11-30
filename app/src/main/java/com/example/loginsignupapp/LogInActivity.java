package com.example.loginsignupapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginsignupapp.FirebaseServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

class LogIn extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private FirebaseServices fbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        etUsername = findViewById(R.id.etUsernameMain);

        etPassword = findViewById(R.id.etPasswordMain);

        fbs = FirebaseServices.getInstance();

    }


    public void login(View view) {


        // TODO: 1- Get data from screen

        String username = etUsername.getText().toString();

        String password = etUsername.getText().toString();


        // TODO: 2- Data validation

        if (username.trim().isEmpty() || password.trim().isEmpty()) {

            Toast.makeText(this, "Username or password is missing!", Toast.LENGTH_SHORT).show();

            return;

        }


        // TODO: 3- Check username and password with Firebase Authentication

        FirebaseAuth auth;
        auth.signInWithEmailAndPassword(username, password)

                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override

                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            // TODO: commands if successful

                        } else {


                            Toast.makeText(MainActivity.this, "Username or password is empty!", Toast.LENGTH_SHORT).show();

                            return;

                        }

                    }

                });
    }
}

