package PlaylistManagementSystem;

import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;
    }

    public Iterator createSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator createShuffleIterator() {
        return new ShuffleIterator(songs);
    }
}
