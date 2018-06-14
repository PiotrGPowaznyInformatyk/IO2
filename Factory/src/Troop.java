/**
 * klasa abstrakcyjna okreslajaca ludzi
 * @author PiotrGrabowski
 *
 */
public abstract class Troop {
	protected int damage;
	protected int hp;
	protected boolean heals;
	public int getDamage() {return damage;};
	public int getHP() {return hp;};
	public boolean canHeal() {return heals;};
	public abstract String makeSound();
}
