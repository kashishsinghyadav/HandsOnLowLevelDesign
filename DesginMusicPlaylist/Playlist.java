import java.util.*;

public class Playlist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    private Map<Song, SongNode> songMap = new HashMap<>();
    private Set<Song> favorites = new HashSet<>();
    private Deque<Song> recentlyPlayed = new LinkedList<>();

    private class SongNode {
        Song song;
        SongNode next;
        SongNode prev;

        SongNode(Song song) {
            this.song = song;
        }
    }

    public void addSong(Song song) {
        if (songMap.containsKey(song)) return;

        SongNode newNode = new SongNode(song);
        songMap.put(song, newNode);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeSong(Song song) {
        SongNode node = songMap.get(song);
        if (node == null) return;

        if (node == head) head = node.next;
        if (node == tail) tail = node.prev;
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;

        if (current == node) {
            current = (node.next != null) ? node.next : node.prev;
        }

        songMap.remove(song);
    }

    public void goToNextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            recentlyPlayed.addFirst(current.song);
        }
    }

    public void gotToPreviousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            recentlyPlayed.addFirst(current.song);
        }
    }

    public void playCurrentSong() {
        if (current != null) {
            System.out.println("Playing: " + current.song.getSongName() + " by " + current.song.getArtistName());
            recentlyPlayed.addFirst(current.song);
        } else {
            System.out.println("No song is currently selected.");
        }
    }

    public void markAsFavorite(Song song) {
        favorites.add(song);
    }

    public List<Song> getFavorites() {
        return new ArrayList<>(favorites);
    }

    public List<Song> getRecentlyPlayed(int limit) {
        return recentlyPlayed.stream().limit(limit).toList();
    }
}
