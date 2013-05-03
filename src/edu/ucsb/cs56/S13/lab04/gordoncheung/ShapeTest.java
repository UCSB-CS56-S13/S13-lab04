
package edu.ucsb.cs56.S13.lab04.gordoncheung;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Shape

@author Gordon Cheung
@version CS56, S13, lab04
@see Shape

*/

public class ShapeTest {

    /**
       test default constructor and getter
     */
    @Test
    public void test_DefaultConstructor_and_getters() {
	Shape s = new Shape();
     	assertEquals(null,s.getName());
	assertEquals(0,s.getSides());
	
    }
    
    /**
       test twoarg constructor
    */
    @Test
    public void test_TwoArgConstructor_and_getters() {
	
	
	Shape s = new Shape("square",4);
	assertEquals("square",s.getName());
	assertEquals(4,s.getSides());	
    }

    /**
       test the setter method
     */
    @Test
    public void test_Setters(){
	Shape s = new Shape();
	s.setName("Triangle");
	s.setSides(3);
	assertEquals("Triangle",s.getName());
	assertEquals(3,s.getSides());
    }

    /**
       test the toString method
    */
    @Test
    public void test_toString() {
	
	Shape s = new Shape("Square",4);
	assertEquals("Name: Square, Sides: 4",s.toString());
    }

    /**
       test the equals method
     */
    @Test
	public void test_equals() {
		
	Shape s1 = new Shape("triangle",3);
	Shape s2 = new Shape("triangle",3);
	assertTrue(s1.equals(s2));
    }

    /**
       test notequal
    */
    @Test
	public void test_notequal() {
		
	Shape s1 = new Shape();
	Shape s2 = new Shape("cow",10000);
	assertFalse(s1.equals(s2));
    }

}
