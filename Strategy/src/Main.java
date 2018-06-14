
public class Main {

	public static void main(String[] args) {
		Human soldier = new Soldier();
		Human medic = new Medic();
		
		System.out.println("Soldier " + soldier.heal());
		System.out.println("Medic " + medic.heal());
		
		//but wait! is this a level up? Soldier learned new things!
		soldier.setHealingAbility(new canHeal());
		System.out.println("Soldier " + soldier.heal());
	}

}
