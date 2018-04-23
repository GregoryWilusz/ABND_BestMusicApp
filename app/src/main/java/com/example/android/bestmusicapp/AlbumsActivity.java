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
        albums.add(new Album("Forest E. Bayer", "Forest Bayer", R.drawable.bayer));
        albums.add(new Album("Makoto Ozone", "Jungle", R.drawable.jungle));
        albums.add(new Album("Acoustic Alchemy", "Reference Point", R.drawable.reference_point));


        final AlbumAdapter adapter = new AlbumAdapter(this, albums);
        albumListView.setAdapter(adapter);
        albumListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ArrayList<Song> songs = new ArrayList<Song>();
                int positionClicked = 0;

                if (position == 0) {
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
                    positionClicked = position;
                }
                if (position == 1) {
                    songs.add(new Song("01", "Jungle", "6:58"));
                    songs.add(new Song("02", "Coconuts Meeting", "5:35"));
                    songs.add(new Song("03", "No Siesta", "8:08"));
                    songs.add(new Song("04", "Cave Walk", "7:51"));
                    songs.add(new Song("05", "Safari", "6:31"));
                    songs.add(new Song("06", "B&B", "7:31"));
                    songs.add(new Song("07", "Moon Flower", "7:02"));
                    songs.add(new Song("08", "La Verdad Con Los Caballos", "7:19"));
                    songs.add(new Song("09", "Oasis", "6:02"));
                    positionClicked = position;
                }
                if (position == 2) {
                    songs.add(new Song("01", "Reference Point", "4:30"));
                    songs.add(new Song("02", "Missing Your Touch", "4:32"));
                    songs.add(new Song("03", "Take Five", "4:38"));
                    songs.add(new Song("04", "Same Road, Same Reason", "4:53"));
                    songs.add(new Song("05", "Make My Day", "4:09"));
                    songs.add(new Song("06", "Caravan Of Dreams", "2:57"));
                    songs.add(new Song("07", "Homecoming", "5:31"));
                    songs.add(new Song("08", "Cuban Heels", "3:31"));
                    songs.add(new Song("09", "Lullaby For The First Born", "3:35"));
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
