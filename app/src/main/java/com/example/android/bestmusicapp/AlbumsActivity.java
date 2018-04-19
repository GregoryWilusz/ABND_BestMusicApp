package com.example.android.bestmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.album_list) ListView albumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);
        ButterKnife.bind(this);

        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album("Michael Jackson", "Moon Walking", "blabla",
                new Song(1, "Milk", 3)));
        albums.add(new Album("Michael Jackson", "Moon", "blablaa",
                new Song(1, "Song 1", 4)));
        albums.add(new Album("Michael Jackson", "Thriller", "blablaaa",
                new Song(1, "Song 1", 4)));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);

    }
}
