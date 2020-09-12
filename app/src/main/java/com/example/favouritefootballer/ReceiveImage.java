package com.example.favouritefootballer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReceiveImage extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_image);
        bindViews();
        displayImage();
    }

    private void bindViews()
    {
        imageView =  findViewById(R.id.imageView_receivedImage);
    }

    private void displayImage()
    {
        if(getIntent().getData() != null){
            try {
                Uri uri = getIntent().getData();
                InputStream is = getContentResolver().openInputStream(uri);
                imageView.setImageBitmap(BitmapFactory.decodeStream(is));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}