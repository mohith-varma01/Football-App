package com.example.favouritefootballer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.ICUUncheckedIOException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView chooseFootballerStatement;
    TextView footballersName;
    TextView likeStatement;
    Button nextButton;
    Button likeButton;
    ImageView footballersPicture;

    FootballerExpert footballerExpert = new FootballerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setActionListeners();
    }

    private void bindViews()
    {
        chooseFootballerStatement = findViewById(R.id.textView);
        footballersName = findViewById(R.id.footballer_name);
        nextButton = findViewById(R.id.button_next);
        likeButton = findViewById(R.id.button_like);
        footballersPicture = findViewById(R.id.imageView2);
        likeStatement = findViewById(R.id.text_after_like);
    }

    private void setActionListeners()
    {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                footballersPicture.setImageResource(footballerExpert.getImage());
                footballersName.setText(footballerExpert.getName());
                likeStatement.setText("");
            }
        });

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = footballerExpert.getIndex();

                Intent intent = new Intent(MainActivity.this, Description.class);
                intent.putExtra("index", index);
                startActivity(intent);
            }
        });
    }
}