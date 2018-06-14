
public class EnemyDrone {
	private int movespeed;
	
	
	public EnemyDrone(int movespeed) {
		this.movespeed=movespeed;
	}
	
	public String scanBattlefield() {
		return ("Enemy Drone scans the battlefield.");
	}
	
	public String fly() {
		return "Enemy Drone flies " + movespeed + " points.";

	}

	public int getMovespeed() {
		return movespeed;
	}

	public void setMovespeed(int movespeed) {
		this.movespeed = movespeed;
	}
	
	
}
