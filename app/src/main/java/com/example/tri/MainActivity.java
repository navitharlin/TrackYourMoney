package com.example.tri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tri.R;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.UsernameEnt);
        passwordEditText = findViewById(R.id.PasswordEnt);
        loginButton = findViewById(R.id.LoginBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameEditText.getText().length() > 0 && passwordEditText.getText().length() > 0) {
                    String toastMessage = "Username: " + usernameEditText.getText().toString() + ", Password: " + passwordEditText.getText().toString();
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                    openMainActivity2();
                } else {
                    String toastMessage = "Username or Password are not populated";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}