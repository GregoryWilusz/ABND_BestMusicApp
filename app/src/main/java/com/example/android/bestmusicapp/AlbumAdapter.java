package com.example.android.bestmusicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(@NonNull Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    static class ViewHolder {
        @BindView(R.id.artist_name_text_view) TextView artistNameTextView;
        @BindView(R.id.album_name_text_view) TextView albumNameTextView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        Album currentAlbum = getItem(position);

        holder.albumNameTextView.setText(currentAlbum.getAlbumName());
        holder.artistNameTextView.setText(currentAlbum.getArtistName());

        return convertView;
    }
}
