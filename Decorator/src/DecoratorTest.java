import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecoratorTest {
	@Test
	void test() {
		Sandwich kanapeczka = new Gouda(new BasicSandwich());
		assertEquals(Gouda.class, kanapeczka.getClass());
		
		Sandwich kanapeczka2 = new Ham(new Gouda(new BasicSandwich()));
		assertEquals(Ham.class, kanapeczka2.getClass());
	}

}
