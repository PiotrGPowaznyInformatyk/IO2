
public class Main {

	public static void main(String[] args) {
		EnemySoldier eS = new EnemySoldier(10, 5);
		Enemy AdaptedDrone = new EnemyDroneAdapter(new EnemyDrone(12));
		
		System.out.println("Enemy Soldier:");
		eS.fireWeapon();
		eS.walkForward();
		
		System.out.println("Enemy Drone (adapted):");
		AdaptedDrone.fireWeapon();
		AdaptedDrone.walkForward();
		
	}

}
