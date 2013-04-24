package edu.ucsb.cs56.S13.lab04.mastergberry;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Human 

@author Adam Ehrlich
@version CS56, S13, lab04
@see Human

*/

public class HumanTest {
	
	@Test
	public void test_DefaultConstructors_and_getters() {
		Human h = new Human();
		assertEquals("", h.getName());
		assertEquals(0, h.getAge());
	}

	@Test
	public void test_TwoArgConstructor_and_getters() {
		Human h = new Human("Adam", 20);
		assertEquals("Adam", h.getName());
		assertEquals(20, h.getAge());
	}

	@Test
	public void test_setName_and_getName() {
		Human h = new Human("Adam", 20);
		h.setName("Bob");
		assertEquals("Bob", h.getName());
	}

	@Test
	public void test_setAge_and_getAge() {
		Human h = new Human("Adam", 20);
		h.setAge(21); // so soon...
		assertEquals(21, h.getAge());
	}

	@Test
	public void test_toString_Adam() {
		Human h = new Human("Adam", 20);
		assertEquals("Adam is 20 years old.", h.toString());
	}

	@Test
	public void test_equals_equal1() {
		Human h1 = new Human("Adam", 20);
		Human h2 = new Human("Adam", 20);
		assertTrue(h1.equals(h2));
	}

	@Test
	public void test_equals_equal2() {
		Human h1 = new Human();
		Human h2 = new Human();
		assertTrue(h1.equals(h2));
	}

	@Test
	public void test_equals_notequal() {
		Human h1 = new Human();
		Human h2 = new Human("Adam", 20);
		assertFalse(h1.equals(h2));
	}

} // class HumanTest.java
