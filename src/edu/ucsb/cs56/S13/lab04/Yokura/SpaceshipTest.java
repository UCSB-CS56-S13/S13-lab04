/** 4/24/13
   @author Fanny Kuang
   @version 4/24/2013 for lab04, CS56, S13
   @see Spaceship
*/

package edu.ucsb.cs56.S13.lab04.Yokura;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SpaceshipTest {

	// Test no arg constructor
	@Test public void testNoArgConstructor() {
	    Spaceship s = new Spaceship();
	    assertEquals(0, s.getNumPeople());
	    assertEquals("", s.getDestination());
	}

	/// Test Two arg constructor
	@Test public void testTwoArgConstructor() {
	    Spaceship s = new Spaceship("Mars",3);
	    assertEquals(3, s.getNumPeople());
	    assertEquals("Mars", s.getDestination());
	}

	// Test Getter and Setters
	@Test public void testGetDestination() {
	    Spaceship s = new Spaceship("Mars",3);
	    assertEquals("Mars", s.getDestination());
	}

	@Test public void testGetNumPeople() {
	    Spaceship s = new Spaceship("Mars",3);
	    assertEquals(3, s.getNumPeople());
	}

	@Test public void testSetDestination() {
	    Spaceship s = new Spaceship();
	    s.setDestination("Moon");
	    assertEquals("Moon", s.getDestination());
	}

	@Test public void testSetNumPeople() {
	    Spaceship s = new Spaceship();
	    s.setNumPeople(5);
	    assertEquals(5, s.getNumPeople());
	}

	// Test .equals method
	@Test public void testEqualsTrue1() {
	    Spaceship s = new Spaceship("Mars",3);
	    Spaceship r = new Spaceship("Mars",3);
	    assertTrue(s.equals(r));
	}
	
	@Test public void testEqualsTrue2() {
	    Spaceship s = new Spaceship();
	    Spaceship r = new Spaceship();
	    assertTrue(s.equals(r));
	}

	@Test public void testEqualsFalse() {
	    Spaceship s = new Spaceship();
	    Spaceship r = new Spaceship("Moon",5);
	    assertFalse(s.equals(r));
	}

	// Test toString format
	@Test public void testToString1() {
	    Spaceship s = new Spaceship("Mars",3);
	    assertEquals("Destination: Mars\nPeople: 3", s.toString());
	}

	@Test public void testToString2() {
	    Spaceship s = new Spaceship("Moon",5);
	    assertEquals("Destination: Moon\nPeople: 5", s.toString());
	}
}
