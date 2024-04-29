package com.proxy;

import java.util.ArrayList;
import java.util.List;

public class SimmulatedServer implements SongService{
    private List<Song> songLibrary;

    public SimmulatedServer() {
        this.songLibrary = new ArrayList<>();
    
        songLibrary.add(new Song(0, "Song 1", "Artist A", "Album X", 180));
        songLibrary.add(new Song(1, "Song 2", "Artist B", "Album Y", 220));
        songLibrary.add(new Song(2, "Song 3", "Artist C", "Album Z", 200));
        songLibrary.add(new Song(3, "Song 4", "Artist D", "Album W", 240));
        songLibrary.add(new Song(4, "Song 5", "Artist E", "Album V", 190));
        songLibrary.add(new Song(5, "Song 6", "Artist F", "Album U", 210));
        songLibrary.add(new Song(6, "Song 7", "Artist G", "Album T", 260));
    }

    @Override
    public Song searchById(Integer songID) {
        simulateServerDelay();
        if (songID >= 0 && songID < songLibrary.size()) {
            return songLibrary.get(songID);
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        simulateServerDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songLibrary) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        simulateServerDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songLibrary) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }

    private void simulateServerDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addSong(Song song) {
        songLibrary.add(song);
    }
    
}
