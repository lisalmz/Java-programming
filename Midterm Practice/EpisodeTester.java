public class EpisodeTester {
	public static void main(String[]args){
		Episode myFirstEpisode = new Episode('Sametitle',1,2);

		Episode mySecondEpisode = new Episode('Sametitle',2,3);

		Episode myThirdEpisode = new Episode('Sametitle',3,4);

		Episode myFourthEpisode = new Episode('Differenttitle');

		if (myFirstEpisode.equals(mySecondEpisode)){
			System.out.println("same!");
		} else {
			System.out.println("not the same!");
		}

		if (mySecondEpisode.comesbefore(myThirdEpisode)){
			System.out.println("yes!");
		} else {
			System.out.println("no!");
		}
	}
}
