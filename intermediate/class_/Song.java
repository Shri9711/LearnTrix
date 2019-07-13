package class_;

public class Song {
	String songName;
	String length;
	String singerName;
	String album;
	String genre;
	
	public void songDetails(String songName, String length, String singerName, String album) {
		System.out.println("Song : " + songName + " " + length + " " + singerName + " " + album);
	}
}
