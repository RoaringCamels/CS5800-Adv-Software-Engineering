package proxyTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.proxy.SimmulatedServer;
import com.proxy.Song;

public class SimulatedServerTest {
    @Test
    public void testSearchById_ValidID() {
        SimmulatedServer simmulatedServer = new SimmulatedServer();
        Song expectedSong = new Song(1, "Song 2", "Artist B", "Album Y", 220);

        Song actualSong = simmulatedServer.searchById(1);

        assertEquals(expectedSong, actualSong);
    }

    @Test
    public void testSearchById_InvalidID() {
        SimmulatedServer simmulatedServer = new SimmulatedServer();

        Song actualSong = simmulatedServer.searchById(10);

        assertNull(actualSong);
    }

    @Test
    public void testSearchByTitle() {
        SimmulatedServer simmulatedServer = new SimmulatedServer();
        String title = "Song 1";
        int expectedSize = 1;

        int actualSize = simmulatedServer.searchByTitle(title).size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSearchByAlbum() {
        SimmulatedServer simmulatedServer = new SimmulatedServer();
        String album = "Album Y";
        int expectedSize = 1;

        int actualSize = simmulatedServer.searchByAlbum(album).size();

        assertEquals(expectedSize, actualSize);
    }
}
