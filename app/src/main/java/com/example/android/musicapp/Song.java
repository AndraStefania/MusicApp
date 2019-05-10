package com.example.android.musicapp;

/**
 * Created by stefania.fanaru.
 */

public class Song {

    /**
     * Variable declaration for the artist name and the song name
     */
    private String mArtistName;
    private String mSongName;

    /**
     * Create a new Song object
     *
     * @param ArtistName is the artist name
     * @param SongName   is the song name
     */
    public Song(String ArtistName, String SongName) {
        mArtistName = ArtistName;
        mSongName = SongName;
    }

    /**
     * Get the artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return mSongName;
    }

}
