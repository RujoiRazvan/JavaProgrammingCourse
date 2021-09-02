package Part5;

public class Song {
	private String name, artist;
	private int duration;
	public Song(String name, String artist, int duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	public boolean equals(Object compared) {
		  if (this == compared) {
	            return true;
	        }

	        // if the type of the compared object is not SimpleDate, the objects are not equal
		if (!(compared instanceof Song)) {
			return false;
	    }
		Song comparedSong = (Song) compared;
		if(name == comparedSong.name && artist == comparedSong.artist && duration == comparedSong.duration)
			return true;
		return false;
	}
}
