
public class EnemySoldier implements Enemy{
	private int damage;
	private int movespeed;
	
	public EnemySoldier(int damage, int movespeed) {
		this.damage=damage;
		this.movespeed=movespeed;
	}
	@Override
	public void fireWeapon() {
		System.out.println("Enemy Soldier does " + damage + " points of damage.");
	}

	@Override
	public void walkForward() {
		System.out.println("Enemy Soldier walks " + movespeed + " points.");
	}

}
