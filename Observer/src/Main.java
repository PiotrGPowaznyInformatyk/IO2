
public class Main {

	public static void main(String[] args) {
		MotherDuck mDuck = new MotherDuck();
		
		BabyDuck ducklingOne = new BabyDuck(mDuck);
		BabyDuck ducklingTwo = new BabyDuck(mDuck);
		BabyDuck ducklingThr = new BabyDuck(mDuck);
		
		mDuck.walk();
		
		mDuck.stop();
	}

}
