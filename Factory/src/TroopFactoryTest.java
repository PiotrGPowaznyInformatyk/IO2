import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TroopFactoryTest {
	private TroopFactory tf;
	private Troop Troop1, Troop2;
	private TroopType TroopTypeSoldier, TroopTypeMedic;
	private int requestedDMG, requestedHP;
	@BeforeEach
	
	void setUp() throws Exception {
		tf = new TroopFactory();
		TroopTypeSoldier = TroopType.SOLDIER;
		TroopTypeMedic = TroopType.MEDIC;
		requestedDMG=60;
		requestedHP=150;
	}

	@Test
	void testGetTroop() {
		Troop1 = tf.getTroop(TroopTypeSoldier, requestedDMG, requestedHP);
		Troop2 = tf.getTroop(TroopTypeMedic, requestedDMG, requestedHP);

		assertEquals(requestedDMG, Troop1.getDamage());
		assertEquals(requestedHP, Troop1.getHP());
		assertEquals(SoldierTroop.class, Troop1.getClass());
		assertFalse(Troop1.canHeal());
		
		assertEquals(requestedDMG, Troop2.getDamage());
		assertEquals(requestedHP, Troop2.getHP());
		assertEquals(MedicTroop.class, Troop2.getClass());
		assertTrue(Troop2.canHeal());
	}

}
