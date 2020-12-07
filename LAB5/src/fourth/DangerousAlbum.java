package fourth;

public class DangerousAlbum extends Album {

    @Override
    public void addSong(Song song) {
        boolean isPrime = true;
        for(int i=2;i<song.getId();i++){
            if(song.getId()%2==0)
                isPrime=false;
        }
        if(isPrime)
            this.getAlbum().add(song);
    }
}
