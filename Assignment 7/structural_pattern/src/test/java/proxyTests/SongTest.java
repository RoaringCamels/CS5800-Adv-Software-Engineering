package proxyTests;

import org.junit.Test;

import com.proxy.Song;

import static org.junit.Assert.assertEquals;

public class SongTest {

    @Test
    public void testSongConstructor() {
        Integer id = 1;
        String title = "Song 1";
        String artist = "Artist A";
        String album = "Album X";
        int duration = 180;

        Song song = new Song(id, title, artist, album, duration);

        assertEquals(id, song.getId());
        assertEquals(title, song.getTitle());
        assertEquals(artist, song.getArtist());
        assertEquals(album, song.getAlbum());
        assertEquals(duration, song.getDuration());
    }

    @Test
    public void testSettersAndGetters() {
        Song song = new Song(1, "Song 1", "Artist A", "Album X", 180);

        Integer id = 2;
        String title = "New Song";
        String artist = "New Artist";
        String album = "New Album";
        int duration = 200;

        song.setId(id);
        song.setTitle(title);
        song.setArtist(artist);
        song.setAlbum(album);
        song.setDuration(duration);

        assertEquals(id, song.getId());
        assertEquals(title, song.getTitle());
        assertEquals(artist, song.getArtist());
        assertEquals(album, song.getAlbum());
        assertEquals(duration, song.getDuration());
    }

    @Test
    public void testToString() {
        Song song = new Song(1, "Song 1", "Artist A", "Album X", 180);
        String expectedToString = "Song{title='Song 1', artist='Artist A', album='Album X', duration=180}";

        assertEquals(expectedToString, song.toString());
    }
}
