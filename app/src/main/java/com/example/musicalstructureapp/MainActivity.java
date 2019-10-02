package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Songs ListView data
         */
        ListView listView = findViewById(R.id.movies_list);
        ArrayList<Song> playList = new ArrayList<>();
        playList.add(new Song(R.drawable.charlie_puth_attention, "Charlie Puth", "Attention"));
        playList.add(new Song(R.drawable.tamino_habibi, "Tamino", "Habibi"));
        playList.add(new Song(R.drawable.slash_anastasia, "Slash", "Anastasia"));
        playList.add(new Song(R.drawable.skillet_awakenalive, "Skillet", "Awake and Alive"));
        playList.add(new Song(R.drawable.slash_maxsessionsunplugged, "Slash", "Max Session Unplugged"));
        playList.add(new Song(R.drawable.louis_tomlinson_backtoyou, "Louis", "Back to You"));
        playList.add(new Song(R.drawable.myles_kennedy_sweetchildomine, "Slash ft Myles Kennedy", "Sweet Child O'mine Acoustic Cover"));
        playList.add(new Song(R.drawable.nickelback_savinme, "Nickelback", "Savin' Me"));
        playList.add(new Song(R.drawable.michael_jackson_whateverhappens, "Micheal Jackson ft Carlos Santana", "Whatever Happens"));

        SongAdapter mAdapter = new SongAdapter(this, playList);
        listView.setAdapter(mAdapter);

        /**
         * Intent to switch the user from the main activity to now playing activity
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song clickedSong = (Song) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                intent.putExtra("song_name", clickedSong.getmSongTitle());
                intent.putExtra("artist_name", clickedSong.getmArtistName());
                intent.putExtra("image", clickedSong.getmImageDrawable());
                startActivity(intent);
            }
        });
    }
}