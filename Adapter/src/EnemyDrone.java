
public class EnemyDrone {
	private int movespeed;
	
	
	public EnemyDrone(int movespeed) {
		this.movespeed=movespeed;
	}
	
	public void scanBattlefield() {
		System.out.println("Enemy Drone scans the battlefield.");
	}
	
	public void fly() {
		System.out.println("Enemy Drone flies " + movespeed + " points.");

	}
}
