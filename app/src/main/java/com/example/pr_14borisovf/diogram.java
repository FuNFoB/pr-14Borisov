package com.example.pr_14borisovf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class diogram extends AppCompatActivity{
int s;
boolean b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diogram);
        runtimer();
    }
    public void setButton7(View v){
        b=true;
    }
    public void Button8(View v){
        b=false;
    }
    public void runtimer(){
        final TextView txt = (TextView) findViewById(R.id.textView2);
        final Handler hand = new Handler();
        hand.post(new Runnable() {
            @Override
            public void run() {

                int secon = s%60;
                String time = String.format("",secon);
                txt.setText(time);
                if(b){
                    s++;
                }
                hand.postDelayed(this,1000);
            }
        });
    }
    public void button(View v){
        b=false;
        s=0;
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}