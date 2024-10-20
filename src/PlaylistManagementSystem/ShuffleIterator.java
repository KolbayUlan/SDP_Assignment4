package PlaylistManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator {
    private List<Song> songs;
    private List<Song> shuffledSongs;

    public ShuffleIterator(List<Song> songs) {
        this.songs = songs;
        shuffle();
    }

    private void shuffle() {
        shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs);
    }

    @Override
    public boolean hasNext() {
        return !shuffledSongs.isEmpty();
    }

    @Override
    public Song next() {
        return shuffledSongs.remove(0);
    }
}
