package com.example.android.bestmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.albums_list) ListView albumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);
        ButterKnife.bind(this);

        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album("Michael Jackson", "Moon Walking", "blabla"));
        albums.add(new Album("Michael Jackson", "Moon", "blablaa"));
        albums.add(new Album("Michael Jackson", "Thriller", "blablaaa"));
        Log.i("Albums in Albums", "Albums: " + albums);

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);

        albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    ArrayList<Song> songs = new ArrayList<Song>();
                    songs.add(new Song("01", "My World", "3:40"));
                    songs.add(new Song("02", "Best Wishes", "2:57"));
                    songs.add(new Song("03", "Me and you", "1:25"));
                    songs.add(new Song("04", "Call me then", "4:01"));

                    Intent album1Intent = new Intent(AlbumsActivity.this, SongsActivity.class);
                    album1Intent.putParcelableArrayListExtra("songs", songs);
                    Log.i("Song in Albums", "Song: " + songs);
                    startActivity(album1Intent);
                }
//                if (position==1) {
//                    Intent album2Intent = new Intent(AlbumsActivity.this, SongsActivity.class);
//                    album2Intent.putExtra("song", songs);
//                    startActivityForResult(album2Intent, 0);
//                }
//                if (position==2) {
//                    Intent album3Intent = new Intent(AlbumsActivity.this, SongsActivity.class);
//                    album3Intent.putExtra("song", songs);
//                    startActivityForResult(album3Intent, 0);
//                }

            }
        });

    }
}
