package com.example.android.bestmusicapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable{

    private String mArtistName;
    private String mAlbumName;
    private int mImageResourceId;

    public Album(String artistName, String albumName, int imageResourceId) {
        mArtistName = artistName;
        mAlbumName = albumName;
        mImageResourceId = imageResourceId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mArtistName);
        dest.writeString(this.mAlbumName);
        dest.writeInt(this.mImageResourceId);
    }

    protected Album(Parcel in) {
        this.mArtistName = in.readString();
        this.mAlbumName = in.readString();
        this.mImageResourceId = in.readInt();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel source) {
            return new Album(source);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };
}
