import java.util.LinkedList;

public class Playlist {
    private String name;
    LinkedList<Song> playlist;


    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<>();
    }


}
