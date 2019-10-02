package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlayingActivity extends AppCompatActivity {


    private boolean pFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView image = findViewById(R.id.now_playing_song_image);
        TextView songNameTV = findViewById(R.id.now_playing_song_name);
        TextView artistNameTV = findViewById(R.id.now_playing_artist_name);

        final ImageButton playButton = findViewById(R.id.now_playing_button);

        /**
         * Get and set song title, artist name and cover image
         * to the now playing activity when user click on a song
         */
        Intent intent = getIntent();
        songNameTV.setText(intent.getStringExtra("song_name"));
        artistNameTV.setText(intent.getStringExtra("artist_name"));
        image.setImageResource(intent.getIntExtra("image", R.drawable.tamino_habibi));

        /**
         * Play button code
         */
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pFlag) {
                    playButton.setImageResource(R.drawable.play_button);
                    pFlag = false;
                } else {
                    playButton.setImageResource(R.drawable.pause_button);
                    pFlag = true;
                }
            }
        });
    }
}