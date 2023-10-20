import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Song Removed");
    }

    public Iterator<Song> createIterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements Iterator<Song> {
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
