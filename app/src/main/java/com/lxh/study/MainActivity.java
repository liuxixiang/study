package com.lxh.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lxh.arouter_annotations.ARouter;

@ARouter(path = "/app/login")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}