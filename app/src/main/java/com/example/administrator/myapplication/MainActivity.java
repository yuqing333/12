package com.example.administrator.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        int id=v.getId();
        switch (id){
            case R.id.button_1:
                startActivity(new Intent(MainActivity.this,FrameActivity.class));
                break;
            case R.id.button_2:
                startActivity(new Intent(MainActivity.this,RelativeActivity.class));
                break;
            case R.id.button_3:
                startActivity(new Intent(MainActivity.this,LinearActivity.class));
                break;
            case R.id.button_4:
                startActivity(new Intent(MainActivity.this,TableActivity.class));
                break;
            default:
                break;
        }
    }
}
