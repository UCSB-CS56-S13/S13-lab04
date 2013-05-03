
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


    @Test
    public void test_DefaultConstructor_and_getters() {
	Shape s = new Shape();
	assertEquals("stub",s.getName());
	assertEquals(5,s.getSides());
	
    }
    
    @Test
    public void test_TwoArgConstructor_and_getters() {
	
	
	Shape s = new Shape("namestub",6);
	assertEquals("namestub",s.getName());
	assertEquals(6,s.getSides());	
    }

    @Test
    public void test_Setters(){
	Shape s = new Shape();
	s.setName("fail");
	s.setSides(100);
	assertEquals("fail",s.getName());
	assertEquals(100,s.getSides());
    }
    @Test
    public void test_toString() {
	
	Shape s = new Shape("Square",4);
	assertEquals("Name: Square, Sides: 4",s.toString());
    }

    @Test
	public void test_equals() {
		
	Shape s1 = new Shape("triangle",3);
	Shape s2 = new Shape("triangle",3);
	assertTrue(s1.equals(s2));
    }


    @Test
	public void test_notequal() {
		
	Shape s1 = new Shape();
	Shape s2 = new Shape("cow",10000);
	assertFalse(s1.equals(s2));
    }


}
