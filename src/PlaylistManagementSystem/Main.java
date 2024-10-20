package PlaylistManagementSystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(new Song("Song1"), new Song("Song2"), new Song("Song3"));
        Playlist playlist = new Playlist(songs);

        Iterator sequentialIterator = playlist.createSequentialIterator();
        System.out.println("Sequential Order:");
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next().getName());
        }

        Iterator shuffleIterator = playlist.createShuffleIterator();
        System.out.println("Shuffle Order:");
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getName());
        }
    }
}
