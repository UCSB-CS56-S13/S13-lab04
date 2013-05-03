package edu.ucsb.cs56.S13.lab04.wmateer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for ClockOfDoom
    @author Will Mateer
    @version CS56, S13, lab04
    @see ClockofDoom
 */

public class ClockofDoomTest{
	
	/**
       		test no arg constructor from ClockofDoomTest
       		@see ClockofDoom#ClockofDoom()

       */
	@Test 
	public void testNoArgConstructor(){
		ClockofDoom Tester = new ClockofDoom();
		assertEquals(null, Tester.getEvent());
		assertEquals(0, Tester.getTimeRemaining());
	}
	/**
       		test two arg constructor from ClockofDoomTest
       		@see ClockofDooml#ClockofDoom(String event, int TimeRemaining)

       */
	@Test
	public void testTwoArgConstructor(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("Neo-Ice Age", Tester.getEvent());
		assertEquals(4500000, Tester.getTimeRemaining());
	}    
	/**
       		test set event from ClockofDoomlTest
       		@see ClockofDoom#setEvent

       */
	@Test
	public void testSetEvent(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		Tester.setEvent("Feline World Domination");
		assertEquals("Feline World Domination", Tester.getEvent());
	}
	/**
       		test get event from ClockofDoomTest
       		@see ClockofDoom#getEvent

       */
	@Test
	public void testGetEvent(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("Neo-Ice Age", Tester.getEvent());
	}
	/**
       		test set Time Remaining from ClockofDoomTest
       		@see ClockofDoom#setTimeRemaining

       */
	@Test
	public void testSetTimeRemaining(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		Tester.setTimeRemaining(300000);
		assertEquals(300000, Tester.getTimeRemaining());
	}
	/**
       		test get Time Remaining from ClockofDoomTest
       		@see ClockofDoom#getTimeRemaining

       */
	@Test
	public void testGetTimeRemaining(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals(4500000, Tester.getTimeRemaining());
	}
	/**
       		test to String from ClockofDoomTest
       		@see ClockofDoom#toString

       */
	@Test 
	public void testToString(){
		ClockofDoom Tester = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals("The event is Neo-Ice Age with 4500000 seconds remaining", Tester.toString());

	}
	/**
       		test equals from ClockofDoomTest
       		@see ClockofDoom#equals

       */
	@Test 
	public void testEquals(){
		ClockofDoom Eq1 = new ClockofDoom("Neo-Ice Age", 4500000);
		ClockofDoom Eq2 = new ClockofDoom("Neo-Ice Age", 4500000);
		assertEquals(true, Eq1.equals(Eq2));
    
	}

}

