package com.example.sarahgardiner.sample430;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void onUserLoginClick(View view) {
        Intent intent = new Intent(this, adminMenu.class);
        startActivity(intent);
        finish();
    }

    public void onAdminLoginClick(View view) {
        Intent intent = new Intent(this, adminMenu.class);
        startActivity(intent);
        finish();
    }
}
/*
Tiffany is testing on pushing 
 */