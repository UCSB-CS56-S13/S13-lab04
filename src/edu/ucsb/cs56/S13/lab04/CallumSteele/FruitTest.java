package edu.ucsb.cs56.S13.lab04.CallumSteele;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 * Test class for Fruit
 *
 * @author Callum Steele
 * @version CS56, S13, lab04
 * @see Fruit
 * 
 */

public class FruitTest {

	@Test
	public void test_DefaultConstructor_and_getters() {
		Fruit f = new Fruit();
		assertEquals("Apple", f.getName());
		assertEquals(100, f.getWeightGrams());
	}

	@Test
	public void test_TwoArgConstructor_and_getters_orange() {
		Fruit f = new Fruit("Orange", 120);
		assertEquals("Orange", f.getName());
		assertEquals(120, f.getWeightGrams());
	}

	@Test
	public void test_namesetter_and_namegetter_apple() {
		Fruit f = new Fruit("Orange", 120);
		f.setName("Apple");
		assertEquals("Apple", f.getName());
	}

	@Test
	public void test_weightsetter_and_weightgetter_111() {
		Fruit f = new Fruit("Apple", 100);
		f.setWeightGrams(111);
		assertEquals(111, f.getWeightGrams());
	}

	@Test
	public void test_toString_default() {
		Fruit f = new Fruit();
		assertEquals("Apple, 100 grams", f.toString());
	}

	@Test
	public void test_toString_banana() {
		Fruit f = new Fruit("Banana", 200);
		assertEquals("Banana, 200 grams", f.toString());
	}

	@Test
	public void test_equals_default() {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		assertTrue(f1.equals(f2));
	}

	@Test
	public void test_equals_oranges() {
		Fruit f1 = new Fruit("Orange", 110);
		Fruit f2 = new Fruit("Orange", 110);
		assertTrue(f1.equals(f2));
	}

	@Test
	public void test_equals_notequal() {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("Apple", 110);
		assertFalse(f1.equals(f2));
	}
}
