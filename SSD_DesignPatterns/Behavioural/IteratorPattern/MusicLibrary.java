import java.util.List;
import java.util.ArrayList;
public class MusicLibrary implements Container<Song> {
    private List<Song> songs;
    private List<Playlist> playlists;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    @Override
    public Iterator<Song> getIterator() {
        return new AllSongsIterator();
    }

    private class AllSongsIterator implements Iterator<Song> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < songs.size();
        }

        @Override
        public Song next() {
            if (hasNext()) {
                Song song = songs.get(currentIndex);
                currentIndex++;
                return song;
            }
            return null;
        }
    }
}