package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    public static final String MESSAGE_ONE = "You clicked the first button, congrats!";
    public static final String MESSAGE_TWO = "You clicked the second button, you're cool!";
    public static final String MESSAGE_THREE = "You clicked the third button! You're done. Go home.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendTextOne(View view) {
        Log.d(LOG_TAG, "Button One Clicked!");
        Intent intent = new Intent(this, Passage.class);
        intent.putExtra(EXTRA_MESSAGE, MESSAGE_ONE);
        startActivity(intent);
    }

    public void sendTextTwo(View view) {
        Log.d(LOG_TAG, "Button One Clicked!");
        Intent intent = new Intent(this, Passage.class);
        intent.putExtra(EXTRA_MESSAGE, MESSAGE_TWO);
        startActivity(intent);
    }

    public void sendTextThree(View view) {
        Log.d(LOG_TAG, "Button One Clicked!");
        Intent intent = new Intent(this, Passage.class);
        intent.putExtra(EXTRA_MESSAGE, MESSAGE_THREE);
        startActivity(intent);
    }
}