
public class EnemyDroneAdapter implements Enemy {
	EnemyDrone dron;
	
	public EnemyDroneAdapter(EnemyDrone dron) {
		this.dron=dron;
	}
	
	@Override
	public String fireWeapon() {
		 return dron.scanBattlefield();
	}

	@Override
	public String walkForward() {
		return dron.fly();
	}

	
	public int getDamage() {
		return 0;
	}

	public int getMovespeed() {
		return dron.getMovespeed();
	}
	public void setMovespeed(int movespeed) {
		dron.setMovespeed(movespeed);
	}
}
