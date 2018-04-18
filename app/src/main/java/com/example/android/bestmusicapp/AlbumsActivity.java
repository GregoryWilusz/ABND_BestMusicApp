package com.example.android.bestmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album("Michael Jackson", "Moon Walking", "blabla",
                new Song(1, "Milk", 3)));
        albums.add(new Album("Michael Jacksons", "Moon Walkingd", "blablaa",
                new Song(1, "Song 1", 4)));
        albums.add(new Album("Michael Jacksonss", "Moon Walkings", "blablaaa",
                new Song(1, "Song 1", 4)));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView albumListView = (ListView) findViewById(R.id.album_list);
        albumListView.setAdapter(adapter);

    }
}
