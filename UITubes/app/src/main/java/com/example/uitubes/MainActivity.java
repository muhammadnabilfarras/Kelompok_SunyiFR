package com.example.uitubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton menuimagebutton;
    private ImageButton learnimagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuimagebutton = (ImageButton) findViewById(R.id.menubutton);
        learnimagebutton = (ImageButton) findViewById(R.id.learnbutton);


        learnimagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2();
            }
        });
    }

    public void openMain2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}