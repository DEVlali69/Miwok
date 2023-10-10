package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    static Context mContext;
    int mBgColor;//background color for the view

    public WordAdapter(Context context, ArrayList<Word> pWords, int backgroundColor) {
        super(context, 0, pWords);
        mBgColor = backgroundColor;
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Word currentWord = getItem(position);

        //setting color
        View textContainer = listItemView.findViewById(R.id.text_view_group);
        int color = ContextCompat.getColor(getContext(), mBgColor);
        textContainer.setBackgroundColor(color);

        //setting miwok text
        TextView miwok_text_view = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwok_text_view.setText(currentWord.getMiwokTranslation());

        //setting default text
        TextView default_text_view = (TextView) listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWord.getDefaultTranslation());


        //setting image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentWord.getImage() != 0) {
            imageView.setImageResource(currentWord.getImage());
        } else {
            imageView.setVisibility(View.GONE);
        }

        //setting on click listener for view item
        Log.v("Audio" + this, "clicked for music");
        listItemView.setOnClickListener(new OnClickListener() {
            MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getAudio());

            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                final int duration;
                duration = 200;
                Toast.makeText(mContext, "Playing Audio", duration).show();
            }
        });

        return listItemView;
    }
}
