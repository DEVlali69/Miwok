package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // console.log("JS")

        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        word.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        word.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        word.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        word.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        word.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        word.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        word.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
