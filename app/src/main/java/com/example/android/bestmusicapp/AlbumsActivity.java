package com.example.android.bestmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AlbumsActivity extends AppCompatActivity {

    @BindView(R.id.albums_list) ListView albumListView;
    @BindView(R.id.navigate_back_to_main_menu) Button navigateToMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);
        ButterKnife.bind(this);

        final ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album(getString(R.string.a0_artist), getString(R.string.a0_title), R.drawable.bayer));
        albums.add(new Album(getString(R.string.a1_artist), getString(R.string.a1_title), R.drawable.jungle));
        albums.add(new Album(getString(R.string.a2_artist), getString(R.string.a2_title), R.drawable.reference_point));


        final AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);
        albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<Song> songs = new ArrayList<Song>();
                int positionClicked = 0;

                if (position == 0) {
                    songs.add(new Song(getString(R.string.a0s1_no), getString(R.string.a0s01_title), getString(R.string.a0s01_duration)));
                    songs.add(new Song(getString(R.string.a0s2_no), getString(R.string.a0s02_title), getString(R.string.a0s02_duration)));
                    songs.add(new Song(getString(R.string.a0s3_no), getString(R.string.a0s03_title), getString(R.string.a0s03_duration)));
                    songs.add(new Song(getString(R.string.a0s4_no), getString(R.string.a0s04_title), getString(R.string.a0s04_duration)));
                    songs.add(new Song(getString(R.string.a0s5_no), getString(R.string.a0s05_title), getString(R.string.a0s05_duration)));
                    songs.add(new Song(getString(R.string.a0s6_no), getString(R.string.a0s06_title), getString(R.string.a0s06_duration)));
                    songs.add(new Song(getString(R.string.a0s7_no), getString(R.string.a0s07_title), getString(R.string.a0s07_duration)));
                    songs.add(new Song(getString(R.string.a0s8_no), getString(R.string.a0s08_title), getString(R.string.a0s08_duration)));
                    songs.add(new Song(getString(R.string.a0s9_no), getString(R.string.a0s09_title), getString(R.string.a0s09_duration)));
                    songs.add(new Song(getString(R.string.a0s10_no), getString(R.string.a0s10_title), getString(R.string.a0s10_duration)));
                    songs.add(new Song(getString(R.string.a0s11_no), getString(R.string.a0s11_title), getString(R.string.a0s11_duration)));
                    songs.add(new Song(getString(R.string.a0s12_no), getString(R.string.a0s12_title), getString(R.string.a0s12_duration)));
                    songs.add(new Song(getString(R.string.a0s13_no), getString(R.string.a0s13_title), getString(R.string.a0s13_duration)));
                    songs.add(new Song(getString(R.string.a0s14_no), getString(R.string.a0s14_title), getString(R.string.a0s14_duration)));
                    songs.add(new Song(getString(R.string.a0s15_no), getString(R.string.a0s15_title), getString(R.string.a0s15_duration)));
                    positionClicked = position;
                }
                if (position == 1) {
                    songs.add(new Song(getString(R.string.a1s1_no), getString(R.string.a1s1_title), getString(R.string.a1s1_duration)));
                    songs.add(new Song(getString(R.string.a1s2_no), getString(R.string.a1s2_title), getString(R.string.a1s2_duration)));
                    songs.add(new Song(getString(R.string.a1s3_no), getString(R.string.a1s3_title), getString(R.string.a1s3_duration)));
                    songs.add(new Song(getString(R.string.a1s4_no), getString(R.string.a1s4_title), getString(R.string.a1s4_duration)));
                    songs.add(new Song(getString(R.string.a1s5_no), getString(R.string.a1s5_title), getString(R.string.a1s5_duration)));
                    songs.add(new Song(getString(R.string.a1s6_no), getString(R.string.a1s6_title), getString(R.string.a1s6_duration)));
                    songs.add(new Song(getString(R.string.a1s7_no), getString(R.string.a1s7_title), getString(R.string.a1s7_duration)));
                    songs.add(new Song(getString(R.string.a1s8_no), getString(R.string.a1s8_title), getString(R.string.a1s8_duration)));
                    songs.add(new Song(getString(R.string.a1s9_no), getString(R.string.a1s9_title), getString(R.string.a1s9_duration)));
                    positionClicked = position;
                }
                if (position == 2) {
                    songs.add(new Song(getString(R.string.a2s1_no), getString(R.string.a2s1_title), getString(R.string.a2s1_duration)));
                    songs.add(new Song(getString(R.string.a2s2_no), getString(R.string.a2s2_title), getString(R.string.a2s2_duration)));
                    songs.add(new Song(getString(R.string.a2s3_no), getString(R.string.a2s3_title), getString(R.string.a2s3_duration)));
                    songs.add(new Song(getString(R.string.a2s4_no), getString(R.string.a2s4_title), getString(R.string.a2s4_duration)));
                    songs.add(new Song(getString(R.string.a2s5_no), getString(R.string.a2s5_title), getString(R.string.a2s5_duration)));
                    songs.add(new Song(getString(R.string.a2s6_no), getString(R.string.a2s6_title), getString(R.string.a2s6_duration)));
                    songs.add(new Song(getString(R.string.a2s7_no), getString(R.string.a2s7_title), getString(R.string.a2s7_duration)));
                    songs.add(new Song(getString(R.string.a2s8_no), getString(R.string.a2s8_title), getString(R.string.a2s8_duration)));
                    songs.add(new Song(getString(R.string.a2s9_no), getString(R.string.a2s9_title), getString(R.string.a2s9_duration)));
                    positionClicked = position;
                }
                Intent chosenAlbumIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                chosenAlbumIntent.putParcelableArrayListExtra("songs", songs);
                chosenAlbumIntent.putExtra("album", albums.get(positionClicked));
                startActivity(chosenAlbumIntent);

            }
        });
        navigateToMainMenu.setOnClickListener(myOnClickListener);
    }

    private View.OnClickListener myOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            NavUtils.navigateUpFromSameTask(AlbumsActivity.this);
        }
    };
}
