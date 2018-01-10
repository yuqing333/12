package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FrameActivity extends Activity {
    private TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        tv1=(TextView)findViewById(R.id.lefttop);
    }
}
