package com.example.android.bestmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.albums_list) ListView albumListView;
//    @BindView(R.id.songs_list) ListView songListView;
//    @BindView(R.id.go_to_songs) ImageView albumListItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);
        ButterKnife.bind(this);

        ArrayList<Album> albums = new ArrayList<Album>();
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(1, "Milk", 3));
        songs.add(new Song(1, "Milk", 3));
        songs.add(new Song(1, "Milk", 3));
        songs.add(new Song(1, "Milk", 3));

        albums.add(new Album("Michael Jackson", "Moon Walking", "blabla", songs));
        albums.add(new Album("Michael Jackson", "Moon", "blablaa", songs));
        albums.add(new Album("Michael Jackson", "Thriller", "blablaaa", songs));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);

        albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent album1Intent = new Intent(AlbumsActivity.this, SongsActivity.class);
                    startActivityForResult(album1Intent, 0);
                }

            }
        });

    }
}
