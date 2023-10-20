public class IteratorPattern{
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();

        Song song1 = new Song("Circles", "Eden");
        Song song2 = new Song("Take what you want", "Post Malone");
        Song song3 = new Song("Better Now", "Post Malone");
        Song song4 = new Song("Silence", "Khalid");
        Song song5 = new Song("Goodbyes", "Post Malone");
        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);
        musicLibrary.addSong(song4);
        musicLibrary.addSong(song5);

        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        playlist1.addSong(song4);
        playlist1.addSong(song5);
        musicLibrary.addPlaylist(playlist1);

        Iterator<Song> allSongsIterator = musicLibrary.getIterator();
        while (allSongsIterator.hasNext()) {
            Song song = allSongsIterator.next();
            System.out.println("Song: " + song.getTitle() + " by " + song.getArtist());
        }
        System.out.println("~~~~Songs added to playlist~~~~ ");
        Iterator<Song> playlistIterator = playlist1.createIterator();
        while (playlistIterator.hasNext()) {
            Song song = playlistIterator.next();
            System.out.println("Song in Playlist: " + song.getTitle() + " by " + song.getArtist());
        }
        System.out.println("~~~~After Removing One Song~~~~ ");
        playlist1.removeSong(song1);
        Iterator<Song> playlistIterator2 = playlist1.createIterator();
        while (playlistIterator2.hasNext()) {
            Song song = playlistIterator2.next();
            System.out.println("Song in Playlist: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}
