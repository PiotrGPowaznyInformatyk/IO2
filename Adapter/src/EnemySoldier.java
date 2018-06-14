
public class EnemySoldier implements Enemy{
	private int damage;
	private int movespeed;
	
	public EnemySoldier(int damage, int movespeed) {
		this.damage=damage;
		this.movespeed=movespeed;
	}
	@Override
	public String fireWeapon() {
		return ("Enemy Soldier does " + damage + " points of damage.");
	}

	@Override
	public String walkForward() {
		return ("Enemy Soldier walks " + movespeed + " points.");
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getMovespeed() {
		return movespeed;
	}
	public void setMovespeed(int movespeed) {
		this.movespeed = movespeed;
	}

}
