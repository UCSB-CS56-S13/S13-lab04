package edu.ucsb.cs56.S13.lab04.ProtossJane;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Shoes

@author Wenjie Huang
@version CS56, S13, lab04, 05/03/2013
@see Shoes

*/

public class ShoesTest	{
	
	@Test
	public void test_DefaultConstructor_and_getters() {
		
		Shoes s = new Shoes();
		assertEquals("Yellow",s.getColor());
		assertEquals(35,s.getSize());
		
	}
	
	
	@Test
	public void test_TwoArgConstructor_and_getters_KJEE() {
		
	Shoes s = new Shoes("Green",40);
	assertEquals("Green",s.getColor());
	assertEquals(40,s.getSize());
    }
    
    @Test
    public void test_toString() {
	
	Shoes s = new Shoes("Green",40);
	assertEquals("Color: Green Size: 40",s.toString());
    }
	
	@Test
	public void test_equals() {
		
	Shoes s1 = new Shoes("Green",40);
	Shoes s2 = new Shoes("Green",40);
	assertTrue(s1.equals(s2));
    }
    
    @Test
    public void test_getColr()	{
		
	Shoes s = new Shoes("Black", 37);
	assertEquals("Black", s.getColor());
	}
	
	@Test
	public void test_getSize()	{
		
	Shoes s = new Shoes("Black", 37);
	assertEquals(37, s.getSize());	
	}
	
	@Test
	public void test_setColor()	{
		
	Shoes s = new Shoes("Black", 37);
	s.setColor("Blue");
	assertEquals("Blue",s.getColor());
	}
	
	@Test
	public void test_setSize()	{
		
	Shoes s = new Shoes("Black", 37);
	s.setSize(45);
	assertEquals(45,s.getSize());
	}
}
