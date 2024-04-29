package com.proxy;
import java.util.*;

public class SongServiceProxy implements SongService{
    private SongService songService;
    private Map<Integer, Song> cache;

    public SongServiceProxy(SongService songService) {
        this.songService = songService;
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        if (cache.containsKey(songID)) {
            System.out.println("Retrieving song metadata from cache for song ID: " + songID);
            return cache.get(songID);
        } else {
            Song song = songService.searchById(songID);
            cache.put(songID, song);
            System.out.println("Fetching and caching song metadata for song ID: " + songID);
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return songService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return songService.searchByAlbum(album);
    }
    
}
