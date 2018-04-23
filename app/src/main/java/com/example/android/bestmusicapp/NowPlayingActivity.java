package com.example.android.bestmusicapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NowPlayingActivity extends AppCompatActivity {

    @BindDrawable(R.drawable.play_arrow) Drawable playIcon;
    @BindDrawable(R.drawable.pause) Drawable pauseIcon;
    @BindView(R.id.player_song_no_text_view) TextView songNo;
    @BindView(R.id.player_song_title_text_view) TextView songTitle;
    @BindView(R.id.player_duration_time) TextView durationTime;
    @BindView(R.id.now_playing_artist_name_text_view) TextView artistName;
    @BindView(R.id.now_playing_album_title_text_view) TextView albumTitle;
    @BindView(R.id.play_pause_image_view) ImageView playPauseIconView;
    @BindView(R.id.album_image_large) ImageView albumImageLarge;
    @BindView(R.id.navigate_back_to_songs_list) Button navigateToSongs;

    private Boolean displayPlayIcon = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_screen);
        ButterKnife.bind(this);


        Album currentAlbum = getIntent().getParcelableExtra("album");
        Song chosenSong = getIntent().getParcelableExtra("song");

        if ((chosenSong != null) && (currentAlbum != null)) {
            artistName.setText(currentAlbum.getArtistName());
            albumTitle.setText(currentAlbum.getAlbumName());
            albumImageLarge.setImageResource(currentAlbum.getImageResourceId());

            songNo.setText(chosenSong.getNumber());
            songTitle.setText(chosenSong.getSongName());
            durationTime.setText(chosenSong.getDuration());
        }

        playPauseIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayPlayIcon = !displayPlayIcon;

                if (displayPlayIcon) {
                    playPauseIconView.setImageDrawable(playIcon);
                } else {
                    playPauseIconView.setImageDrawable(pauseIcon);
                }
            }
        });

        navigateToSongs.setOnClickListener(myOnClickListener);
    }

    private View.OnClickListener myOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NavUtils.navigateUpFromSameTask(NowPlayingActivity.this);
        }
    };
}
