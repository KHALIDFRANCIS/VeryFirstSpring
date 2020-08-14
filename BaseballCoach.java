package springpackage;

public class BaseballCoach  implements MasterCoach{
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 miniutes on batting practice";
	}
	
	public String warmup() {
		return "Spend 15 mins doing plyometrics";
	}
	
	
}
