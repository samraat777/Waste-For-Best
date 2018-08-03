package com.example.sam.wasteforbest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void googleOnclick(View view)
            
    {
    Intent intent=new Intent(this,googleSignUp.class);
    startActivity(intent);
    }
    public void phoneOnclick(View view)
    {
        Intent intent=new Intent(this,phoneSignUp.class);
        startActivity(intent);
    }
    public void gmailOnclick(View view)
    {
        Intent intent=new Intent(this,gmailSignUp.class);
        startActivity(intent);
    }
    public void loginOnclick(View view)
    {
        Intent intent=new Intent(this,loginPage.class);
        startActivity(intent);
    } 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
