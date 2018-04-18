package com.example.android.bestmusicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

public class AlbumAdapter extends ArrayAdapter<Album> {
    @BindView(R.id.artist_name_text_view) TextView artistNameTextView;
    @BindView(R.id.album_name_text_view) TextView albumNameTextView;

    public AlbumAdapter(@NonNull Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list_item, parent, false);
        }

        Album currentAlbum = getItem(position);
        artistNameTextView.setText(currentAlbum.getArtistName());
        albumNameTextView.setText(currentAlbum.getAlbumName());

        return listItemView;
    }


}
