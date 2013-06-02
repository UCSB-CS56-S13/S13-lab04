package edu.ucsb.cs56.S13.lab04.EricHuang2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for City

@author Eric huang
@version CS56, S13, lab04
@see City
 
*/

public class CityTest {

	/** test for the default no constructor method
	 *  and also the getter method
	 */
    @Test
	public void test_DefaultConstructor_and_getters() {
	City city1 = new City();
	assertEquals("Santa Barbara",city1.getName());
	assertEquals(89045,city1.getPopulation());
	
    }
    
    /** test for the two parameter constructor that I wrote
     *  and also test the getter again
     */
    @Test
	public void test_TwoArgConstructor_and_getters_gothem() {
	City city1 = new City("Gothem",30000000);
	assertEquals("Gothem",city1.getName());
	assertEquals(30000000,city1.getPopulation());
    }
	
	/** test for the default constructor and toString
	 */
    @Test
	public void test_toString_santaBarbara() {
	
	City city1 = new City();
	assertEquals("City name: Santa Barbara. Population: 89045",city1.toString());
    }

	/** test for the two parameter constructor and toString
	 */
    @Test
	public void test_toString_gothem() {
		
	City city1 = new City("Gothem",30000000);
	assertEquals("City name: Gothem. Population: 30000000",city1.toString());
	
    }

	/** test for the equals method, when two city objects are equal
	 *  and were created using two parameter constructor
	 */
    @Test
	public void test_equals_equal1() {
		
	City city1 = new City("Village 1",101);
	City city2 = new City("Village 1",101);
	assertTrue(city1.equals(city2));
    }

	/** test for the equals method, when two city objects are equal
	 *  and were created using the default constructor
	 */
    @Test
	public void test_equals_equal2() {
		
	City city1 = new City();
	City city2 = new City();
	assertTrue(city1.equals(city2));
    }

	/** test for the equals method, when two city objects are not equal
	 */
    @Test
	public void test_equals_notequal() {
		
	City city1 = new City();
	City city2 = new City("Village 3",1000);
	assertFalse(city1.equals(city2));
    }
}
