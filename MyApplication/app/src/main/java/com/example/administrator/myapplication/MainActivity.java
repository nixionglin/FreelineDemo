package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.common.AppConfig;
import com.example.rootlibrary.RootConfig;


public class MainActivity extends Activity {

    private static final String LOCAL_VALUE = "Local ccc";

    private TextView VersionTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        VersionTv = (TextView)findViewById(R.id.version);
        VersionTv.setText("Root:" + RootConfig.getGlobalValue() + " Global:" + AppConfig.getGlobalValue() + " Local:" + LOCAL_VALUE);
    }
}
