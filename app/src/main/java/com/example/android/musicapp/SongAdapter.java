package com.example.android.musicapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by stefania.fanaru.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * Resource ID for the backgroung color for the list of songs
     */
    private int mColorResourceId;

    /**
     * Create a new SongAdapter object
     *
     * @param context is the current context(Activity)
     * @param songs   is the list of songs to display
     */

    public SongAdapter(Activity context, ArrayList<Song> songs, int colorResourceId) {

        /** Initialize the ArrayAdapter's internal storage for the context and the list.*/
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**Check if the existing view is being reused, otherwise inflate the view*/
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        /**Get the Song object located at this position in the list*/
        Song currentSong = getItem(position);

        /**Find the TextView in the list_item.xml layout with the ID version_name*/
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        /**Get the artist name from the currentSong object and set this text on
         *the artist TextView.
         * */
        artistTextView.setText(currentSong.getArtistName());

        /**Find the TextView in the list_item.xml layout with the ID version_number*/
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);

        /**Get the song name from the currentSong object and set this text on
         *the song TextView.
         **/
        songTextView.setText(currentSong.getSongName());

        /**Set the theme color for the list item*/
        View textContainer = listItemView.findViewById(R.id.text_container);

        /**Find the color that the resource ID maps to*/
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        /**Set the background color of the text container View*/
        textContainer.setBackgroundColor(color);


        /**Return the whole list item layout so that it can be shown in the ListView*/
        return listItemView;
    }
}