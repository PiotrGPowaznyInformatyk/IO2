/**
 * przykladowy pattern - factory
 * @author PiotrGrabowski
 *
 */
public class mainTask {
	private static final int SOLDIER_DAMAGE = 100;
	private static final int SOLDIER_HP = 100;

	private static final int MEDIC_DAMAGE = 30;
	private static final int MEDIC_HP = 70;
	
	public static void main(String[] args) {
		TroopFactory tf = new TroopFactory();
		Troop soldier = tf.getTroop(TroopType.SOLDIER, SOLDIER_DAMAGE, SOLDIER_HP);
		Troop medic = tf.getTroop(TroopType.MEDIC, MEDIC_DAMAGE, MEDIC_HP);
		
		System.out.println("Soldier says: " + soldier.makeSound());
		System.out.println("Medic says: " + medic.makeSound());
	}

}
