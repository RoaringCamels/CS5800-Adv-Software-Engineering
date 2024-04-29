package com.proxy;

public class Song {
    private Integer id;
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(Integer id, String title, String artist, String album, int duration){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Integer getId() {return id;}
    public String getTitle() {return title;}
    public String getArtist() {return artist;}
    public String getAlbum() {return album;}
    public int getDuration() {return duration;}

    public void setId(Integer id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}
    public void setArtist(String artist) {this.artist = artist;}
    public void setAlbum(String album) {this.album = album;}
    public void setDuration(int duration) {this.duration = duration;}

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                '}';
    }
}
