package com.example.pr_14borisovf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ves);
    }
    public void ff(View v){
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}