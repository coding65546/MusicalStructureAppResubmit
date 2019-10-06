package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class SongAdapter extends ArrayAdapter<Song> {

    private Context mContext;
    private List<Song> playList = new ArrayList<>();

    public SongAdapter(Context context, ArrayList<Song> list) {
        super(context, 0, list);
        mContext = context;
        playList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        Song currentSong = playList.get(position);

        ImageView image = listItem.findViewById(R.id.imageView_cover);
        image.setImageResource(currentSong.getmImageDrawable());

        TextView name = listItem.findViewById(R.id.text_view_song);
        name.setText(currentSong.getmArtistName());

        TextView artist = listItem.findViewById(R.id.text_view_artist);
        artist.setText(currentSong.getmSongTitle());

        return listItem;
    }
}
