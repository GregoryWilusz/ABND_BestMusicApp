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



//    public Album(Parcel in){
//        String[] data = new String[3];
//
//        in.readStringArray(data);
//        this.mArtistName = data[0];
//        this.mAlbumName = data[1];
//        this.mImageResourceId = data[2];
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeStringArray(new String[]{this.mArtistName, this.mAlbumName, this.mImageResourceId});
//    }
//
//    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() {
//        public Album createFromParcel(Parcel source) {
//            return new Album(source);
//        }
//
//        public Album[] newArray(int size) {
//            return new Album[size];
//        }
//    };

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
