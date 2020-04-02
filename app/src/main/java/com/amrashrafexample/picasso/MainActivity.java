package com.amrashrafexample.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image);
        String url = "https://cdn.pixabay.com/photo/2020/03/26/16/11/corona-4970836_960_720.jpg";
        Picasso.get().load(url).into(imageView);
    }
}
