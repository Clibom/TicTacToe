package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //TODO Match elements of XML Layout here see https://developer.android.com/reference/android/view/View.html#findViewById(int)


        //TODO Create separate listeners for different clickable elements (image, play button, etc...)
    }

    protected void buildGame(){
        //TODO OPTINAL Build the parameter of the party (player names, image choice, etc...)
    }
}
