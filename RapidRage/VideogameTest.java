package edu.ucsb.cs56.S13.lab04.RapidRage;

import org.junit.Test;
import static org.junit.Assert.AssertEquals;

/** test class for Videogame

@author Chris Atanasian
@version 2013.04.30
@see Videogame

*/

public class VideogameTest {
    
    /**
       test no arg constructor
       @see Videogame#Videogame()
    */
    @Test public void testNoArgConstructor() {
	// default Videogame should have an empty String for name and 0 for the yearReleased
	Videogame v = new Videogame();
	assertEquals("",v.getName());
	assertEquals(0,v.getYearReleased());
    }
    
    /**
       test the constructor that takes arguments
       @see Videogame#Videogame(String name, int yearReleased)
    */
    @Test public void testArgConstructor() {
	Videogame v = new Videogame("Super Smash Bros. Melee", 2001);
	assertEquals("Super Smash Bros. Melee",v.getName());
	assertEquals(2001,v.getYearReleased());
    }

    /**
       test case for getName()
       @see Videogame#getName()
    */
    @Test public void testGetName() {
	Videogame v = new Videogame();
	assertEquals("",v.getName());
    }

    /**
       test case for getYearReleased()
       @see Videogame#getYearReleased()
    */
    @Test public void testGetYearReleased() {
	Videogame v = new Videogame();
	assertEquals(0,v.getYearReleased());
    }

    /**
       test case for setName()
       @see Videogame#setName()
    */
    @Test public void testSetName() {
	Videogame v = new Videogame();
	v.setName("Super Smash Bros. Melee");
	assertEquals("Super Smash Bros. Melee",v.getName());
    }
    
    /**
       test case for setYearReleased()
       @see Videogame#setYearReleased()
    */
    @Test public void testSetYearReleased() {
	Videogame v = new Videogame();
	v.setYearReleased(2001);
	assertEquals(2001,v.getYearReleased());
    }

    /**
       test case for toString()
       @see Videogame#toString()
    */
    @Test public void testToString() {
	Videogame v = new Videogame("Super Smash Bros. Melee", 2001);
	assertEquals("Super Smash Bros. Melee, 2001",v.toString());
    }
    
    /**
       test case for equals()
       @see Videogame#equals()
    */
    @Test public void testEquals() {
	Videogame v1 = new Videogame("ABC",123);
	Videogame v2 = new Videogame("ABC",123);
	assertEquals(true,v1.equals(v2));
    }
}
