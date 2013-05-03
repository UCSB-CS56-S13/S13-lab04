package edu.ucsb.ucsb.cs56.S13.lab04.wmateer;

/*import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for ClockOfDoom
	@author Will Mateer
    @version CS56, S13, lab04
    @see ClockofDoom
 */
/*
public class ClockofDoomTest{
	
	@Test 
	public void testNoArgConstructor(){
		ClockofDoom Tester = new ClockofDoom();
		assertEquals(null, Tester.getEvent());
		assertEquals(0, Tester.getTimeRemaining());
	}

	@Test
	public void testTwoArgConstructor(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("Neo-Ice Age", Tester.getEvent());
		assertEquals(4500000, Tester.getTimeRemaining());
	}    

	@Test
	public void testSetEvent(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		Tester.setEvent("Feline World Domination");
		assertEquals("Feline World Domination", Tester.getEvent());
	}
	
	@Test
	public void testGetEvent(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("Neo-Ice Age", Tester.getEvent());
	}
	
	@Test
	public void testSetTimeRemaining(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		Tester.setTimeRemaining(300000);
		assertEquals(300000, Tester.getTimeRemaining());
	}
	
	@Test
	public void testGetTimeRemaining(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals(4500000, Tester.getTimeRemaining());
	}

	@Test 
	public void testToString(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("Neo-Ice Age 4500000", Tester.ToString());

	}
	
	@Test 
	public void testEquals(){
		ClockofDoom Eq1 = new ClockofDoom("Neo-Ice Age", 4500000);
		ClockofDoom Eq2 = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals(true, Eq1.equals(Eq2));
    
	}

}*/

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/** test class for ClockOfDoom
 
 @author Phill Conrad and Will M.
 @version 2013.04.09
 @see ClockOfDoom
 
 */

public class ClockOfDoomTest {
	
    /** Test case getEvent()
     @see ClockofDoom#getEvent
	 */
	
    private ClockOfDoom deathClock;
	
    @Before
	
    public void initDeathClock() {
		this.deathClock = new ClockOfDoom("Death",300);
    }
	
    @Test
    public void test_getEvent() {
		assertEquals("Death",this.deathClock.getEvent());
    }
	
    /** Test case for getSecondRemaining() 
     @see ClockOfDoom#getSecondsRemaining
	 */
    
    @Test
    public void test_getSecondsRemaining() {
		assertEquals(300,this.deathClock.getSecondsRemaining());
    }
	
}
