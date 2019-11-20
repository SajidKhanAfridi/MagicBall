package com.sajidkhanafridi.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int [] answerImages = {
                R.drawable.magicball1,
                R.drawable.magicball2,
                R.drawable.magicball3,
                R.drawable.magicball4
        };
        final ImageView answerImage = (ImageView) findViewById(R.id.answerImage);
        Button askButton = (Button) findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Random randomNumberGenerator = new Random();
                 int number = randomNumberGenerator.nextInt(4);
                 answerImage.setImageResource(answerImages[number]);
            }
        });
    }
}
