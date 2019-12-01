package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView headingText;
    private ImageView cakeImage;
    private Button onClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intwidgets();
        setOnClickListner();
    }

    private void setOnClickListner() {
        onClick.setOnClickListener();
    }


    private void intwidgets() {
        headingText=findViewById(R.id.headingText);
        cakeImage=findViewById(R.id.cakeImage);
        onClick=findViewById(R.id.onClick);
    }

}
