package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlternativeRockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Avenged Sevenfold", "So Far Away"));
        songs.add(new Song("Arctic Monkeys", "Do I Wanna Know?"));
        songs.add(new Song("AWOLNATION", "Sail"));
        songs.add(new Song("Oasis", "Wonderwall"));
        songs.add(new Song("3 Doors Down", "Here Without You"));
        songs.add(new Song("The Cranberries", "Zombie"));
        songs.add(new Song("Billy Talent", "Surrender"));
        songs.add(new Song("Muse", "Time Is Running Out"));
        songs.add(new Song("Good Charlotte", "The River"));
        songs.add(new Song("Sum 41", "With Me"));
        songs.add(new Song("Three Days Grace", "Never Too Late"));
        songs.add(new Song("Red Hot Chili Peppers", "Californication"));
        songs.add(new Song("Dirty Heads", "Vacation"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_alternative_rock);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);
    }
}