package com.example.tri;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button Expenses = (Button) findViewById(R.id.ExpensesBtn);
        Button Goal = (Button) findViewById(R.id.GoalBtn);
        Button Report = (Button) findViewById(R.id.ReportBtn);
        Expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startInt = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(startInt);
            }


        });
        Goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startInt = new Intent(getApplicationContext(),GoalActivity.class);
                startActivity(startInt);

            }
        });
        Report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startInt = new Intent(getApplicationContext(),ReportActivity.class);
                startActivity(startInt);

            }
        });


    }
}