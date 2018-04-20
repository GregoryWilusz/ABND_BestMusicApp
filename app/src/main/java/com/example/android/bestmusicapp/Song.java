package com.example.android.bestmusicapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    private int mNumber;
    private String mSongName;
    private String mDuration;

    public Song(int number, String songName, String duration) {
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

    public String getDuration() {
        return mDuration;
    }


    public Song(Parcel in){
        String[] data = new String[3];

        in.readStringArray(data);
        this.mNumber = Integer.parseInt(data[0]);
        this.mSongName = data[1];
        this.mDuration =  data[2];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{String.valueOf(this.mNumber), this.mSongName, this.mDuration});
    }

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

}
