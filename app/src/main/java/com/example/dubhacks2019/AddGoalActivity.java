package com.example.dubhacks2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class AddGoalActivity extends AppCompatActivity{

    EditText NewGoal;
    EditText Description;
    EditText GoalLength;
    TextView NewGoalText;
    TextView DescriptionText;
    TextView GoalLengthText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goals_screen);

        final Button button = findViewById(R.id.ConfirmButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddGoalActivity.this, MainActivity.class));
                NewGoal   = (EditText)findViewById(R.id.NewGoal);
                String Goal = NewGoal.getText().toString();

                Description   = (EditText)findViewById(R.id.Description);
                String Desc = Description.getText().toString();

                GoalLength   = (EditText)findViewById(R.id.GoalLength);
                String Goallen = GoalLength.getText().toString();

            }
        });
        }


    @Override
    protected void onStart() {
        super.onStart();
    }

    }

