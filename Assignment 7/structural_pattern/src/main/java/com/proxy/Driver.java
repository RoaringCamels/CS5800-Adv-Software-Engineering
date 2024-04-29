package com.proxy;

public class Driver {
    public static void main(String[] args) {
        SimmulatedServer songService = new SimmulatedServer();

        SongService songProxy = new SongServiceProxy(songService);

        // Displaaying existing songs 
        System.out.println("Search by ID:");
        System.out.println(songProxy.searchById(1));

        System.out.println("\nSearch by title (Song 2):");
        System.out.println(songProxy.searchByTitle("Song 2"));

        System.out.println("\nSearch by album (Album Z):");
        System.out.println(songProxy.searchByAlbum("Album Z"));

        // Adding songs and displaying them
        Song newSong1 = new Song(7, "NS1", "NArts1", "NAlb1", 240);
        songService.addSong(newSong1);
        Song newSong2 = new Song(8, "NS2", "NArts2", "NAlb2", 240);
        songService.addSong(newSong2);
        Song newSong3 = new Song(9, "NS3", "NArts3", "NAlb3", 240);
        songService.addSong(newSong3);
        Song newSong4 = new Song(10, "NS4", "NArts4", "NAlb4", 240);
        songService.addSong(newSong4);
        Song newSong5 = new Song(11, "NS5", "NArts5", "NAlb5", 240);
        songService.addSong(newSong5);

        // Search for the created songs using the proxy
        System.out.println("Search by title (NS3):");
        System.out.println(songProxy.searchByTitle("NS3"));

        System.out.println("\nSearch by ID (15):");
        System.out.println(songProxy.searchById(11));

        System.out.println("\nSearch by album (NAlb1):");
        System.out.println(songProxy.searchByAlbum("NAlb1"));
    }
}
