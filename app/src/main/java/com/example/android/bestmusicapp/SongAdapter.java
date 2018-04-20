package com.example.android.bestmusicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    static class ViewHolder {
        @BindView(R.id.song_name_text_view) TextView songNameTextView;
        @BindView(R.id.song_duration_time_text_view) TextView songDurationTextView;
        @BindView(R.id.song_number_text_view) TextView songNumberTextView;

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
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        Song songSet = getItem(position);

        holder.songNumberTextView.setText(songSet.getNumber());
        holder.songNumberTextView.append(". ");
        holder.songNameTextView.setText(songSet.getSongName());
        holder.songDurationTextView.setText(songSet.getDuration());

        return convertView;
    }
}
