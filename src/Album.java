import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String Title, double duration){
        if(findSong(Title) == null) {
            this.songs.add(new Song(Title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String Title){
        for(int i=0; i < songs.size(); i++){
            Song actual = songs.get(i);
            if(actual.getTitle().equals(Title)){
                return actual;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if(index >= 0 && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("Album " + this.title + " doesn't have song with trackId " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String trackTitle, LinkedList<Song> playlist){
        Song song = findSong(trackTitle);
        if(song != null){
            playlist.add(song);
            return true;
        }
        System.out.println("Album " + this.title + " doesn't have song with trackTitle " + trackTitle);
        return false;
    }
}
