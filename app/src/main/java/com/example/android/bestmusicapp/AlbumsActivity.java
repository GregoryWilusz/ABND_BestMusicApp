package com.example.android.bestmusicapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;


public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.albums_list) ListView albumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);
        ButterKnife.bind(this);

        final ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album("Forest E. Bayer", "Forest Bayer", R.drawable.bayer));
//        albums.add(new Album("Michael Jackson", "Moon", (Parcelable) bayerImage));
//        albums.add(new Album("Michael Jackson", "Thriller", "blablaaa"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);
        albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    ArrayList<Song> songs = new ArrayList<Song>();
                    songs.add(new Song("01", "Stuck in the Future : Introduction", "1:16"));
                    songs.add(new Song("02", "Healing", "4:00"));
                    songs.add(new Song("03", "Spirits in the Spirit Realm : Interlude I", "0:25"));
                    songs.add(new Song("04", "Today", "3:38"));
                    songs.add(new Song("05", "Libra", "3:19"));
                    songs.add(new Song("06", "Bird Song : Interlude II", "1:40"));
                    songs.add(new Song("07", "Defibrillator (Breathe Again)", "2:42"));
                    songs.add(new Song("08", "2020", "4:53"));
                    songs.add(new Song("09", "Glaciers", "3:53"));
                    songs.add(new Song("10", "On the Moon : Interlude III", "4:01"));
                    songs.add(new Song("11", "Imagination", "5:06"));
                    songs.add(new Song("12", "Volcanoes", "4:44"));
                    songs.add(new Song("13", "Zzzz.. (A Long Snooze)", "4:23"));
                    songs.add(new Song("14", "To Be Continued... : Outro", "1:23"));
                    songs.add(new Song("15", "Today (Instrumental)", "3:28"));

                    Intent album1Intent = new Intent(AlbumsActivity.this, SongsActivity.class);
                    album1Intent.putParcelableArrayListExtra("songs", songs);
                    album1Intent.putExtra("album", albums.get(0));
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
