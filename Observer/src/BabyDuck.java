
public class BabyDuck implements Observer {
	private MotherDuck mother;
	private static int duckNumber = 0;
	private int duckID;

	public BabyDuck(MotherDuck mother) {
		this.mother=mother;
		this.duckID = ++duckNumber;
		System.out.println("Duck number " + duckID + " now observes it's mother.");
		mother.register(this);
	}
	
	@Override
	public void update(boolean walking) {
		if(walking) {
			System.out.println("Duckling number "+duckID+" follows the mother!");
		}else {
			System.out.println("Duckling number "+duckID+" stops with the mother!");
		}
	}
}
