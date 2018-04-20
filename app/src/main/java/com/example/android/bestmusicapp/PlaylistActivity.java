package com.example.android.bestmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaylistActivity extends AppCompatActivity {

    @BindView(R.id.player_song_no_text_view) TextView songNo;
    @BindView(R.id.player_song_title_text_view) TextView songTitle;
    @BindView(R.id.player_duration_time) TextView durationTime;
    @BindView(R.id.now_playing_artist_name_text_view) TextView artistName;
    @BindView(R.id.now_playing_album_title_text_view) TextView albumTitle;
//    @BindView(R.id.album_image_large) TextView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_screen);
        ButterKnife.bind(this);

        Song chosenSong = getIntent().getParcelableExtra("song");
        songNo.setText(chosenSong.getNumber());
        songTitle.setText(chosenSong.getSongName());
        durationTime.setText(chosenSong.getDuration());
        Album currentAlbum = getIntent().getParcelableExtra("album");
        artistName.setText(currentAlbum.getArtistName());
        albumTitle.setText(currentAlbum.getAlbumName());
//        imgView.setText(currentAlbum.getImage());
    }
}
