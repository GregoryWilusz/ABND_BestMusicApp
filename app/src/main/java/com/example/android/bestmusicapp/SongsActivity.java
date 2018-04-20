package com.example.android.bestmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongsActivity extends AppCompatActivity {

    @BindView(R.id.songs_list) ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        ButterKnife.bind(this);

        ArrayList<Song> songsList = getIntent().getParcelableArrayListExtra("songs");
        Log.i("Songs in SongsAct", "Song: " + songsList);

        SongAdapter adapter = new SongAdapter(this, songsList);
        songListView.setAdapter(adapter);
    }
}
