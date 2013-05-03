package edu.ucsb.cs56.S13.lab04.jdmoody;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * The test class CruisePassengerTest, to test the CruisePassenger class
 *
 * @author Jonathan Moody
 * @version CS56, 13S, lab04
 * @see CruisePassenger
 */
 
 public class CruisePassengerTest {
	
	/**
	test default constructor
	@see CruisePassenger#CruisePassenger()
	*/
	
	@Test
	public void test_DefaultConstructor_and_getters() {
	
		CruisePassenger c = new CruisePassenger();
		assertEquals("No Passenger Name Set",c.getPassenger());
		assertEquals(0,c.getRoomNum());
	
    }
	
	/**
	test two argument constructor
	@see CruisePassenger#CruisePassenger(String passenger, int roomNum)
	*/
	
	@Test
	public void test_TwoArgConstructor_and_getters_Hatt() {
	
		CruisePassenger c = new CruisePassenger("Sir Topham Hatt", 42);
		assertEquals("Sir Topham Hatt",c.getPassenger());
		assertEquals(42,c.getRoomNum());
	
    }

	/**
	test two argument constructor
	@see CruisePassenger#CruisePassenger(String passenger, int roomNum)
	*/
	
    @Test
	public void test_TwoArgConstructor_Homer() {
		
		CruisePassenger c = new CruisePassenger("Homer Simpson",300);
		assertEquals("Homer Simpson",c.getPassenger());
		assertEquals(300,c.getRoomNum());
	
    }
	
	/**
	test passenger name setter
	@see CruisePassenger#setPassenger
	*/
	
	@Test
	public void test_setters_Hatt() {
		
		CruisePassenger c = new CruisePassenger();
		c.setRoomNum(42);
		c.setPassenger("Sir Topham Hatt");
		assertEquals("Sir Topham Hatt", c.getPassenger());
		assertEquals(42, c.getRoomNum());
		
	}
	
	/**
	test passenger name setter
	@see CruisePassenger#setPassenger
	*/
	
	@Test
	public void test_setters_Simpson() {
		
		CruisePassenger c = new CruisePassenger();
		c.setRoomNum(300);
		c.setPassenger("Homer Simpson");
		assertEquals("Homer Simpson", c.getPassenger());
		assertEquals(300, c.getRoomNum());
		
	}

	/**
     test toString
     @see CruisePassenger#toString
     */
	
    @Test
	public void test_toString_DefaultConstructor() {
		
		CruisePassenger c = new CruisePassenger();
		assertEquals("Passenger Name: No Passenger Name Set, Room Number: 0",c.toString());
		
    }

	/**
     test toString
     @see CruisePassenger#toString
     */
	
    @Test
	public void test_toString_Hatt() {
		
		CruisePassenger c = new CruisePassenger("Sir Topham Hatt",42);
		assertEquals("Passenger Name: Sir Topham Hatt, Room Number: 42",c.toString());
	
    }

	/**
     test toString
     @see CruisePassenger#toString
     */
	
    @Test
	public void test_toString_Homer() {
		
		CruisePassenger c = new CruisePassenger("Homer Simpson",300);
		assertEquals("Passenger Name: Homer Simpson, Room Number: 300",c.toString());	
    }

	/**
     test equals method
     @see CruisePassenger#equals
     */
	
    @Test
	public void test_equals_equal1() {
		
		CruisePassenger c1 = new CruisePassenger("Sir Topham Hatt",42);
		CruisePassenger c2 = new CruisePassenger("Sir Topham Hatt",42);
		assertTrue(c1.equals(c2));
    }

	/**
     test equals method
     @see CruisePassenger#equals
     */
	
    @Test
	public void test_equals_equal2() {
		
		CruisePassenger c1 = new CruisePassenger();
		CruisePassenger c2 = new CruisePassenger();
		assertTrue(c1.equals(c2));
	}

	/**
     test equals method
     @see CruisePassenger#equals
     */
	
    @Test
	public void test_equals_notequal() {
		
		CruisePassenger c1 = new CruisePassenger();
		CruisePassenger c2 = new CruisePassenger("Homer Simpson",300);
		assertFalse(c1.equals(c2));
    }
	
 } // class CruisePassengerTest.java