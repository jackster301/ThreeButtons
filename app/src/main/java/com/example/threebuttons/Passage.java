package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Passage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);
        String passage = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        ScrollView scrollView = findViewById(R.id.passage_text);
        TextView text = new TextView(this);
        text.setText(passage);
        LinearLayout ll = (LinearLayout) scrollView.getChildAt(0);
        ll.addView(text);
    }
}