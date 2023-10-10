package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        word.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        word.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        word.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        word.add(new Word("I’m feeling good", "kuchi achit", R.raw.phrase_im_feeling_good));
        word.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        word.add(new Word("Yes, I’m coming", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        word.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        word.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        word.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));
        word.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));
        word.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        WordAdapter wordAdapter = new WordAdapter(this, word, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
