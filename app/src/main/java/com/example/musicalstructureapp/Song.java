package com.example.musicalstructureapp;

public class Song {

    // Store the id of the song cover
    private int mImageDrawable;
    // Store the artist name
    private String mArtistName;
    // Store song title
    private String mSongTitle;

    // Constructor that is used to create an instance of the Song object
    public Song(int mImageDrawable, String mArtistName, String mSongTitle) {
        this.mImageDrawable = mImageDrawable;
        this.mArtistName = mArtistName;
        this.mSongTitle = mSongTitle;
    }

    /**
     * Getter and Setter
     */
    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public String getmSongTitle() {
        return mSongTitle;
    }

    public void setmSongTitle(String mSongTitle) {
        this.mSongTitle = mSongTitle;
    }
}