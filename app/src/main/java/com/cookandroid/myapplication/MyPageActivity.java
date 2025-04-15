package com.cookandroid.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView;

import com.google.firebase.auth.FirebaseAuth;

public class MyPageActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button homeButton, categoryButton, myFitButton, myPageButton;
    private EditText pwEdt, idEdt;
    private Button gosignupButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();

        public void onStart() {
            super.onStart();
            FirebassUser currentUser = mAuth.getCurrentUser();
            if(currentUser != null) {
                reload();
            }
        }
    }
}
