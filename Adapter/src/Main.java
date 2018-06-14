
public class Main {

	public static void main(String[] args) {
		EnemySoldier eS = new EnemySoldier(10, 5);
		Enemy AdaptedDrone = new EnemyDroneAdapter(new EnemyDrone(12));
		
		System.out.println("Enemy Soldier:");
		System.out.println(eS.fireWeapon());
		System.out.println(eS.walkForward());
		
		System.out.println("Enemy Drone (adapted):");
		System.out.println(AdaptedDrone.fireWeapon());
		System.out.println(AdaptedDrone.walkForward());
	}

}
