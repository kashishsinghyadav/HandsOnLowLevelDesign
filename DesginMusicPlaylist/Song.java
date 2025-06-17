import java.util.Objects;

public class Song {
    private String songName;
    private String artistName;

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(songName, song.songName) &&
                Objects.equals(artistName, song.artistName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, artistName);
    }

    @Override
    public String toString() {
        return "\"" + songName + "\" by " + artistName;
    }
}
