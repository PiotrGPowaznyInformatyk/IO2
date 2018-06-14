/**
 * klasa medyka
 * @author PiotrGrabowski
 *
 */
public class MedicTroop extends Troop{
	private String sound;
	
	public MedicTroop(int damage, int hp, boolean b) {
		this.damage=damage;
		this.hp=hp;
		this.heals=b;
		
		this.sound="On my way!";
	}

	@Override
	public String makeSound() {
		return this.sound;
	}
}
