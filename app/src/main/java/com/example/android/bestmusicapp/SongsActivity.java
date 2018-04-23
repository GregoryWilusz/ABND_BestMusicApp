package com.example.android.bestmusicapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongsActivity extends AppCompatActivity {

    @BindView(R.id.songs_list) ListView songListView;
    @BindView(R.id.song_list_header_album_title_text_view) TextView albumTitle;
    @BindView(R.id.song_list_header_album_artist_text_view) TextView artistName;
    @BindView(R.id.navigate_back) Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        ButterKnife.bind(this);

        final Album chosenAlbum = getIntent().getParcelableExtra("album");
        albumTitle.setText(chosenAlbum.getAlbumName());
        artistName.setText(chosenAlbum.getArtistName());

        final ArrayList<Song> songsList = getIntent().getParcelableArrayListExtra("songs");
        SongAdapter adapter = new SongAdapter(this, songsList);
        songListView.setAdapter(adapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent playTheSongIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                playTheSongIntent.putExtra("song", songsList.get(position));
                playTheSongIntent.putExtra("album", chosenAlbum);
                startActivity(playTheSongIntent);
            }
        });

    }

    private View.OnClickListener myOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NavUtils.navigateUpFromSameTask(SongsActivity.this);
        }
    };
}
