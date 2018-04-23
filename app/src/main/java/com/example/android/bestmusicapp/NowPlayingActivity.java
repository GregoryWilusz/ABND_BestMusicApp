package com.example.android.bestmusicapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NowPlayingActivity extends AppCompatActivity {

    @BindView(R.id.player_song_no_text_view)
    TextView songNo;
    @BindView(R.id.player_song_title_text_view) TextView songTitle;
    @BindView(R.id.player_duration_time) TextView durationTime;
    @BindView(R.id.now_playing_artist_name_text_view) TextView artistName;
    @BindView(R.id.now_playing_album_title_text_view) TextView albumTitle;
//    @BindView(R.id.album_image_large) TextView imgView;

    @BindDrawable(R.drawable.play_arrow)
    Drawable playIcon;
    @BindDrawable(R.drawable.pause)
    Drawable pauseIcon;
    @BindView(R.id.play_pause_image_view)
    ImageView playPauseIconView;

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
//        imgView.setText(currentAlbum.getImage());

            songNo.setText(chosenSong.getNumber());
            songTitle.setText(chosenSong.getSongName());
            durationTime.setText(chosenSong.getDuration());
        }

        playPauseIconView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("displayPlayIcon: " + displayPlayIcon)   ;
                displayPlayIcon = !displayPlayIcon;

                if (displayPlayIcon) {
                    playPauseIconView.setImageDrawable(playIcon);
                } else {
                    playPauseIconView.setImageDrawable(pauseIcon);
                }
            }
        });
    }
}
