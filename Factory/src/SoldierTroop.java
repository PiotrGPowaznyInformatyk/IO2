/**
 * klasa zolnierza
 * @author PiotrGrabowski
 *
 */
public class SoldierTroop extends Troop {
	private String sound;
	
	public SoldierTroop(int damage, int hp, boolean b) {
		this.damage=damage;
		this.hp=hp;
		this.heals=b;
		
		this.sound="Medic!";
	}

	@Override
	public String makeSound() {
		return this.sound;
	}
	
}
