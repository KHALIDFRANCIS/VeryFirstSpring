package springpackage;

public class CoachingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create the object through instantiation
		MasterCoach baseball = new BaseballCoach();
		
		MasterCoach track = new TrackCoach();
		
		//will be used
		System.out.println(baseball.getDailyWorkout());
		System.out.println(track.getDailyWorkout());

	}
 
}
