import java.util.*;
public class Jukebox1 {
    public static void main(String[] args){
        new Jukebox1().go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}

class SongV2{
    private String title;
    private String artist;
    private int bpm;

    SongV2(String title,String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getBpm(){
        return bpm;
    }




//class MockSongs{
//    public static List<String> getSongStrings() {
//        List<String> songs = new ArrayList<>();
//        songs.add("sommersault");
//        songs.add("cassidy");
//        songs.add("$10");
//        songs.add("havana");
//        songs.add("50 ways");
//        return songs;
//    }


}