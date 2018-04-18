package com.example.android.bestmusicapp;

public class Song {
    private int mNumber;
    private String mSongName;
    private int mDuration;

    public Song(int number, String songName, int duration) {
        mNumber = number;
        mSongName = songName;
        mDuration = duration;
    }

    public int getNumber() {
        return mNumber;
    }

    public String getSongName() {
        return mSongName;
    }

    public int getDuration() {
        return mDuration;
    }


}
