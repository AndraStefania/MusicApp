package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Weeknd ft. Daft Punk", "Starboy"));
        songs.add(new Song("The Weeknd", "Call Out My Name"));
        songs.add(new Song("Maroon 5 ft. Cardi B", "Girls Like You"));
        songs.add(new Song("JP Cooper", "She's On My Mind"));
        songs.add(new Song("Matthew Koma", "Kisses Back"));
        songs.add(new Song("Dennis Lloyd", "Leftlovers"));
        songs.add(new Song("Bazzi", "Mine"));
        songs.add(new Song("Dua Lipa", "New Rules"));
        songs.add(new Song("G-Eazy & Halsey", "Him & I"));
        songs.add(new Song("Halsey", "Now Or Never"));
        songs.add(new Song("Arilena Ara", "Nentori"));
        songs.add(new Song("Justin Bieber", "Sorry"));
        songs.add(new Song("Madonna ft. Nicki Minaj", "Bitch I'm Madonna"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_pop);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);

    }
}