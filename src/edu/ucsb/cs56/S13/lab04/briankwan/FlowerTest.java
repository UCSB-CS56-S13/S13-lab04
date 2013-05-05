package edu.ucsb.cs56.S13.lab04.briankwan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Flower

@author Brian Wan
@version CS56, S13, lab04
@see Flower

*/

public class FlowerTest {
	
	/**
	 Tests the no arg constructor and the getters in Flower
	 Creates a new Flower and see if they equal
	 */ 
	 @Test
	public void test_DefaultConstructor_and_getters() {
	
	
	Flower f = new Flower();
	assertEquals("Sunflower",f.getName());
	assertEquals(16,f.getPetal());
	
    }
    
    /**
     Tests the two arg constructor and the getters in Flower
     Creates a new Flower and see if they equal
     */
    @Test
	public void test_TwoArgConstructor_and_getters_ROSE() {
	
	
	Flower r = new Flower("Rose",10);
	assertEquals("Rose",r.getName());
	assertEquals(10,r.getPetal());
	
    }

	/**
	 Tests the toString method by creating a Flower and seeing if the string equals the toString
	 */

    @Test
	public void test_toString_Sunflower() {
	
	Flower f = new Flower();
	assertEquals("Name: Sunflower, Number of Petals: 16",f.toString());
    }

    /**
     Tests equals method by creating two same Flowers and seeing if they equal 
     */
    @Test
	public void test_equals_equal() {
		
	Flower f1 = new Flower("Lilac",8);
	Flower f2 = new Flower("Lilac",8);
	assertTrue(f1.equals(f2));
    }

	/**
	 Tests equals method when they are not equal by creating two separate Flowers
	 */ 
    @Test
	public void test_equals_notequal() {
		
	Flower f1 = new Flower();
	Flower f2 = new Flower("Lilac",8);
	assertFalse(f1.equals(f2));
    }
    
    /**
     Tests setters by creating a new flower and setting them to a certain name and petal. Then uses assertEquals to test equality
     */ 
    @Test
    public void test_setters() {
		Flower f = new Flower();
		f.setName("Lily");
		f.setPetal(12);
		assertEquals( "Lily", f.getName());
		assertEquals( 12, f.getPetal());
	}

}
