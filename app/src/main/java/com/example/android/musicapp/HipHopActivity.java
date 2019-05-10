package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /** Create a list of songs*/
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Travis Scott", "Antidote"));
        songs.add(new Song("Travis Scott ft. Kendrick Lamar", "Goosebumps"));
        songs.add(new Song("Post Malone ft. Quavo", "Congratulations"));
        songs.add(new Song("Post Malone ft. 21 Savage", "Rockstar"));
        songs.add(new Song("Post Malone", "Better Now"));
        songs.add(new Song("Migos ft. Post Malone", "Notice Me"));
        songs.add(new Song("PARTYNEXTDOOR ft. Drake", "Come and See Me"));
        songs.add(new Song("Drake", "In My Feelings"));
        songs.add(new Song("Khalid ft. 6LACK, Ty Dollar $ign", "OTW"));
        songs.add(new Song("Ayo & Teo", "Rolex"));
        songs.add(new Song("NAV ft. The Weeknd", "Some Way"));
        songs.add(new Song("French Montana ft. Swae Lee", "Unforgettable"));
        songs.add(new Song("Chance the Rapper ft. 2 Chainz & Lil Wayne", "No Problem"));

        /**Create a SongAdapter; create layouts for each item in the list.*/
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_hip_hop);

        /** Find the ListView object in the song_list.xml layout file.*/
        ListView listView = (ListView) findViewById(R.id.list);

        /**Attach the SongAdapter; ListView will display list items for each song in the list of songs */
        listView.setAdapter(adapter);

    }
}