package fourth;

import java.util.ArrayList;

public abstract class Album {
    private ArrayList<Song> album;

    public Album() {
        album=new ArrayList<>();
    }

    public abstract void addSong(Song song);

    public void removeSong(Song song){

        if(album.contains(song)){
            album.remove(song);
        }

    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "album=" + album.toString();
    }
}
