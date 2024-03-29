package com.example.puppyswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchPuppy(View view) {
        ImageView puppyImageView = (ImageView) findViewById(R.id.puppyImageView);
        puppyImageView.setImageResource(R.drawable.puppy2);
        Log.i("Info", "Switch button was clicked.");
    }
}
