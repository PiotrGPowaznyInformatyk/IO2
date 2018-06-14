import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrategyTest {
	Human soldier;
	Human medic;
	
	
	@BeforeEach
	void setUp() throws Exception {
		soldier = new Soldier();
		medic = new Medic();
	}

	@Test
	void test() {
		assertEquals("can not heal", soldier.heal());
		assertEquals("heals", medic.heal());
		soldier.setHealingAbility(new canHeal());
		assertEquals("heals", soldier.heal());
	}

}
