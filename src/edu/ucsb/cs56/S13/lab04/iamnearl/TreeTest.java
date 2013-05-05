package edu.ucsb.cs56.S13.lab04.iamnearl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * The test class TreeTest, to test the Tree class
 *
 * @author Noah Malik
 * @version 4/28/13, S13, cs56
 * @see Tree
 */

public class TreeTest {


	/**
	 *	Test no arg constructor and getters from TreeTest
	 *      The Default tree is the Joshua Tree
	 *      Yucca brevifolia: 10 m
	 *	@see Tree#Tree()
	 */
	@Test public void test_noArgConstructorAndGetters() {
		Tree t = new Tree();
		assertEquals("Yucca brevifolia", t.getScientificName());
		assertEquals(10, (int) t.getAvgHeightMeters());
	}

	/**
	 * Test constructor that initializes from two parameters
	 * @see Tree#Tree(String name, int height)
	*/
	@Test public void test_twoArgConstructorAndGetters() {
		Tree t = new Tree("Sequoia sempervirens",90);
		assertEquals("Sequoia sempervirens", t.getScientificName());
		assertEquals(90, (int) t.getAvgHeightMeters());
	}

	/**
	 * Test setter and getter for scientificName
	 * @see Tree#setScientificName(String name)
	 */
	@Test public void test_stringSetter() {
		Tree t = new Tree();
		t.setScientificName("Salix discolor"); // The pussy willow
		assertEquals("Salix discolor", t.getScientificName());
	}

	/**
	 * Test setter and getter for avgHeightMeters
	 * @see Tree#setAvgHeightMeters
	 */
	@Test public void test_intSetter() {
		Tree t = new Tree();
		t.setAvgHeightMeters(6);
		assertEquals(6, (int) t.getAvgHeightMeters());
	}

	/**
	 * Test toString method for Tree with no argument constructor
	 * toString should print tree name followed by a colon and the height labeled in meters
	 * e.g. "Tree Name: Height m"
	 * @see Tree#toString()
	 */
	@Test public void test_toStringa() {
		Tree t = new Tree();
		assertEquals("Yucca brevifolia: 10 m", t.toString());
	}

	/**
	 * Test toString method for Tree with two argument constructor
	 * toString should print tree name followed by a colon and the height labeled in meters
	 * e.g. "Tree Name: Height m"
	 * @see Tree#toString()
	 */
	@Test public void test_toStringb() {
		Tree t = new Tree("Salix discolor", 6);
		assertEquals("Salix discolor: 6 m", t.toString());
	}

	/**
	 * Test equals method for Tree
	 * @see Tree#equals(Tree t)
	 */
	@Test public void test_equalsa() {
		Tree t1 = new Tree();
		Tree t2 = new Tree();
		assertTrue(t1.equals(t2));
	}

	/**
	 * Test equals method for Tree
	 * @see Tree#equals(Tree t)
	 */
	@Test public void test_equalsb() {
		Tree t1 = new Tree("Sequoia sempervirens", 90);
		Tree t2 = new Tree("Sequoia sempervirens", 90);
		assertTrue(t1.equals(t2));
	}

	/**
	 * Test equals method for Tree
	 * @see Tree#equals(Tree t)
	 */
	@Test public void test_equalsc() {
		Tree t1 = new Tree();
		Tree t2 = new Tree("Sequoia sempervirens", 90);
		assertFalse(t1.equals(t2));
	}

}
