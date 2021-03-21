package com.ac.id.umn.uts_30830;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openLogin();
                }
            });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openLogin(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

    }

    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);

    }
}