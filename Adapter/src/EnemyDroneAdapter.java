
public class EnemyDroneAdapter implements Enemy {
	EnemyDrone dron;
	
	public EnemyDroneAdapter(EnemyDrone dron) {
		this.dron=dron;
	}
	
	@Override
	public void fireWeapon() {
		dron.scanBattlefield();
	}

	@Override
	public void walkForward() {
		dron.fly();
	}

}
