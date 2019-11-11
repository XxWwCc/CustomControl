package com.xwc.customcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BGLinearLayout bgl = findViewById(R.id.bgl_layout);
        bgl.setText("499,562,269.38");
    }
}
