import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args){
        new Jukebox2().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}


    class SongV3 implements Comparable<SongV3> {
        private String title;
        private String artist;
        private int bpm;

        public int compareTo(SongV3 s){
            return title.compareTo(s.getTitle());
        }

        SongV3(String title, String artist, int bpm) {
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

        public int getBpm() {
            return bpm;
        }

        public String toString() {
            return title;
        }
    }

//
//    class SongV3 implements Comparable<SongV3> {
//    private String title;
//    private String artist;
//    private int bpm;
//
//    public int compareTo(Song V3 s){
//        return title.compareTo(s.getTitle());
//    }
//    }



    class MockSongs{
//        public static List<String> getSongStrings() {
//                List<String> songs = new ArrayList<>();
//                songs.add("sommersault");
//                songs.add("cassidy");
//                songs.add("$10");
//                songs.add("havana");
//                songs.add("50 ways");
//                return songs;
//            }
            public static List<SongV3> getSongsV3() {
            List<SongV3> songs = new ArrayList<>();
            songs.add(new SongV3("sommersault","zero 7",147));
            songs.add(new SongV3("cassidy","grateful dead",158));
            songs.add(new SongV3("$10","hitchiker",140));
            songs.add(new SongV3("Cassidy","grateful dead",158));
            songs.add(new SongV3("50 ways","simon",102));
            return songs;
        }
    }




