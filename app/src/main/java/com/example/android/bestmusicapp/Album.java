package com.example.android.bestmusicapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable{

    private String mArtistName;
    private String mAlbumName;
    private String mImage;

    public Album(String artistName, String albumName, String image) {
        mArtistName = artistName;
        mAlbumName = albumName;
        mImage = image;
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

    public Album(Parcel in){
        String[] data = new String[3];

        in.readStringArray(data);
        this.mArtistName = data[0];
        this.mAlbumName = data[1];
        this.mImage =  data[2];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{this.mArtistName, this.mAlbumName, this.mImage});
    }

    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() {
        public Album createFromParcel(Parcel source) {
            return new Album(source);
        }

        public Album[] newArray(int size) {
            return new Album[size];
        }
    };


}
