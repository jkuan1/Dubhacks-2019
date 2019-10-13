package com.example.dubhacks2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {

    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_settings);

        final Button button = findViewById(R.id.LogoutButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //startActivity(new Intent(SettingsActivity.this, LoginActivity.class));
                switch (v.getId()) {
                // ...
                case R.id.LogoutButton:
                    System.out.println("Logout is pressed");
                    signOut();
                    break;
                // ...
            }
            }
        });

//        @Override
//        public void onClick(View v) {
//            switch (v.getId()) {
//                // ...
//                case R.id.LogoutButton:
//                    signOut();
//                    break;
//                // ...
//            }
//        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        // ...
                        System.out.println("onComplete Status");
                        startActivity(new Intent(SettingsActivity.this, LoginActivity.class));
                    }
                });
    }
}
