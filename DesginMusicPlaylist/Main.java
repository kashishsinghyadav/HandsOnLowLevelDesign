public class Main {
    public static void main(String[] args) { 
        Song song1 = new Song();
        song1.setSongName("Harry Potter Theme");
        song1.setArtistName("John Williams");

        Song song2 = new Song();
        song2.setSongName("Shape of You");
        song2.setArtistName("Ed Sheeran");

        Song song3 = new Song();
        song3.setSongName("Blinding Lights");
        song3.setArtistName("The Weeknd");

        Playlist playlist = new Playlist();

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);


        playlist.playCurrentSong();

        playlist.goToNextSong();
        playlist.playCurrentSong();
        playlist.gotToPreviousSong();
        playlist.playCurrentSong();

        playlist.removeSong(song2);
        playlist.goToNextSong();
        playlist.playCurrentSong();

        playlist.markAsFavorite(song3);
        System.out.println("Favorites: " + playlist.getFavorites());
    }
}
