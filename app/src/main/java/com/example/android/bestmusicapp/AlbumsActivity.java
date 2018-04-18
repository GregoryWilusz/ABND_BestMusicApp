package com.example.android.bestmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;


public class AlbumsActivity extends AppCompatActivity {
    @BindView(R.id.album_list) ListView albumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album(1, "Michael Jackson", "Moon Walking", "blabla" ));
        albums.add(new Album(2, "Michael Jackson", "Moon Walking", "blabla" ));
        albums.add(new Album(3, "Michael Jackson", "Moon Walking", "blabla" ));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        albumListView.setAdapter(adapter);

    }
}
