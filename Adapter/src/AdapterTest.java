import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdapterTest {
	int requestedDamage, requestedMovespeedSoldier, requestedMovespeedDrone;
	EnemySoldier eS;
	Enemy AdaptedDrone;
	@BeforeEach
	void setUp() throws Exception {
		requestedDamage = 10;
		requestedMovespeedSoldier = 5;
		requestedMovespeedDrone = 12;
		eS = new EnemySoldier(requestedDamage, requestedMovespeedSoldier);
		AdaptedDrone = new EnemyDroneAdapter(new EnemyDrone(requestedMovespeedDrone));
	}

	@Test
	void test() {
		assertEquals(EnemySoldier.class ,eS.getClass());
		assertEquals(requestedDamage, eS.getDamage());
		assertEquals(requestedMovespeedSoldier, eS.getMovespeed());
		
		assertEquals(EnemyDroneAdapter.class , AdaptedDrone.getClass());
		assertEquals(requestedMovespeedDrone, ((EnemyDroneAdapter) AdaptedDrone).getMovespeed());
		
		assertEquals("Enemy Drone scans the battlefield.", AdaptedDrone.fireWeapon());
	}

}
