package fourth;

public class BadAlbum extends Album {

    @Override
    public void addSong(Song song) {
        boolean isPalindrome=true;
        int copy=0;
        int copyId= song.getId();

        while(copyId!=0){
            copy=copyId%10*10+copy;
            copyId=copyId/10;
        }
        if(copy != song.getId()){
            isPalindrome=false;
        }
        if(isPalindrome && song.getName().length()==3){
            this.getAlbum().add(song);
        }
    }
}
