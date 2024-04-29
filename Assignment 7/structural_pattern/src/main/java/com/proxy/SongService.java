package com.proxy;
import java.util.*;
public interface SongService {
    Song searchById (Integer songID);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
    
}
