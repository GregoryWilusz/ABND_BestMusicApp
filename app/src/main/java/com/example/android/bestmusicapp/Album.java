package com.example.android.bestmusicapp;

import java.util.ArrayList;

public class Album {

    private String mArtistName;
    private String mAlbumName;
    private String mImage;
//    private ArrayList<Song> mSongs;

    public Album(String artistName, String albumName, String image) {
        mArtistName = artistName;
        mAlbumName = albumName;
        mImage = image;
//        mSongs = songs;
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

//    public ArrayList<Song> getmSongs() {
//        return mSongs;
//    }


}
