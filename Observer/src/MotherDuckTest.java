import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


class MotherDuckTest {
	private MotherDuck mDuck;
	private BabyDuck ducklingOne;
	private BabyDuck ducklingTwo;
	private BabyDuck ducklingThr;
	private ArrayList<Observer> myTestObservers;
	
	@BeforeEach
	void setUp() throws Exception {
		mDuck = new MotherDuck();
		myTestObservers = new ArrayList<Observer>();
	}

	@Test
	void testMotherDuck() {
		assertFalse(mDuck.isWalkingStatus());
	}

	@Test
	void testRegister() {
		ducklingOne = new BabyDuck(mDuck);
		ducklingTwo = new BabyDuck(mDuck);
		ducklingThr = new BabyDuck(mDuck);
		myTestObservers.add(ducklingOne);
		myTestObservers.add(ducklingTwo);
		myTestObservers.add(ducklingThr);
		
		assertEquals(myTestObservers, mDuck.getObservers());
	}

	@Test
	void testUnregister() {
		ducklingOne = new BabyDuck(mDuck);
		ducklingTwo = new BabyDuck(mDuck);
		ducklingThr = new BabyDuck(mDuck);
		myTestObservers.add(ducklingOne);
		myTestObservers.add(ducklingTwo);
		myTestObservers.add(ducklingThr);
		
		mDuck.unregister(ducklingTwo);
		myTestObservers.remove(ducklingTwo);
		assertEquals(myTestObservers, mDuck.getObservers());
	}
	
	@Test
	void testWalk() {
		mDuck.walk();
		assertTrue(mDuck.isWalkingStatus());
	}

	@Test
	void testStop() {
		mDuck.stop();
		assertFalse(mDuck.isWalkingStatus());
	}

}
