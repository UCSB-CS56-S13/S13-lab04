package edu.ucsb.cs56.S13.lab04.evanwest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
@author Evan West
@version CS56, S13, lab04
@see SpaceObject
 */

public class SpaceObjectTest{

    @Test
    public void test_defaultConstructor_and_Getters(){
        SpaceObject o = new SpaceObject();
	assertEquals(o.getCatalogNumber(),1);
	assertEquals("Earth",o.getName());
    }

    @Test
    public void test_twoArgConstructor_and_Getters(){
	//make object with other args, check values
	SpaceObject o = new SpaceObject("Mars", 2);
	assertEquals(1,o.getCatalogNumber());
	assertEquals("Earth",o.getName());
    }

    @Test
    public void test_toString(){
	SpaceObject o = new SpaceObject("Bacon",4444);
	assertEquals("4444-Bacon",o.toString());
    }

    @Test
    public void test_equals(){
	SpaceObject o = new SpaceObject("One",1);
	SpaceObject p = new SpaceObject("One",1);
	assertTrue(o.equals(p));
    }

}
