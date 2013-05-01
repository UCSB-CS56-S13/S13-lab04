package edu.ucsb.cs56.S13.lab04.RapidRage;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/** test class for Videogame

@author Chris Atanasian
@version 2013.04.30
@see Videogame

*/

public class VideogameTest() {
    
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
    
    @Test public String testGetName() {
	Videogame v = new Videogame();
	assertEquals("",v.getName());
    }

    /**
       test case for getYearReleased()
       @see Videogame#getName()
    */
    
    @Test public String testGetYearReleased() {
	Videogame v = new Videogame();
	assertEquals(0,v.getYearReleased());
    }/
}
