package com.example.android.bestmusicapp;

import java.util.ArrayList;

public class Album {

    private String mArtistName;
    private String mAlbumName;
    private String mImage;
    private Song mSong;

    public Album(String artistName, String albumName, String image, Song song) {
        mArtistName = artistName;
        mAlbumName = albumName;
        mImage = image;
        mSong = song;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getImage() {
        return mImage;
    }

    public Song getmSong() {
        return mSong;
    }


}
