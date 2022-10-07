package com.example.android.miwok;

public class Word {
    String mDefaultTranslation;
    String mMiwokTranslation;
    int mImage, mAudio;

    public Word(String english, String Miwok, int img_resource_id, int audio_resource_file) {
        mDefaultTranslation = english;
        mMiwokTranslation = Miwok;
        mImage = img_resource_id;
        mAudio = audio_resource_file;
    }

    public Word(String english, String Miwok, int audio_resource_file) {
        mDefaultTranslation = english;
        mMiwokTranslation = Miwok;
        mImage = 0;
        mAudio = audio_resource_file;
    }

    public int getImage() {
        return mImage;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getAudio() {
        return mAudio;
    }
    
    @override
    public String toString(){
        return mDefaultTranslation+" | "+mMiwokTranslation;
    }
        
}
