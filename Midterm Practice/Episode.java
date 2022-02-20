public class Episode {
	String title;
	int seasonNumber;
	int episodeNumber;
	
	public Episode(String t, int sValue, int eValue) {
		title = t;
		seasonNumber = sValue;
		episodeNumber = eValue;
	}
	
	public Episode(String t) {
		title = t;
		seasonNumber = 1;
		episodeNumber = 1;
	}
	
	public void setTitle (String t){
		title = t;
	}

	public int getTitle (){
		return t;
	}

	public boolean equals(Episode e) {
	    return title == e.title && seasonNumber == e.seasonNumber && episodeNumber == e.episodeNumber;
	}

	public boolean comesBefore(Episode e){
		return title == e.title && seasonNumber <= e.seasonNumber && episodeNumber < e.episodeNumber;
	}
}