package com.cookandroid.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CreateAccount extends AppCompatActivity {
    private PreviewView previewView;
    private FirebaseAuth mAuth;
    private Button homeButton, categoryButton, myFitButton, myPageButton;
    private EditText idEditText, passwordEditText, heightEditText, weightEditText;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);

        mAuth = FirebaseAuth.getInstance();

        idEditText = findViewById(R.id.idEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signupButton = findViewById(R.id.singupButton);
        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        myFitButton = findViewById(R.id.myFitButton);
        myPageButton = findViewById(R.id.myPageButton);

        signupButton.setOnClickListener(v -> signupUser());

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(intent);
            }
        });

        categoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateAccount.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        myFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateAccount.this, MyFitActivity.class);
                startActivity(intent);
            }
        });

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateAccount.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }

    private void signupUser() {
        String id = idEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if(id.isEmpty() || password.length() < 6) {
            Toast.makeText(this, "아이디를 입력하고 비밀번호는 6자 이상이어야 합니다.",
                    Toast.LENGTH_SHORT).show();
            return;
        }

    }
}