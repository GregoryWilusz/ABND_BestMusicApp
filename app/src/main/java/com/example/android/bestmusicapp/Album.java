package com.example.android.bestmusicapp;

public class Album {

    private int mId;
    private String mArtistName;
    private String mAlbumName;
    private String mImage;

    public Album(int id, String artistName, String albumName, String image) {
        mId = id;
        mArtistName = artistName;
        mAlbumName = albumName;
        mImage = image;
    }

    public int getId() {
        return mId;
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

}
