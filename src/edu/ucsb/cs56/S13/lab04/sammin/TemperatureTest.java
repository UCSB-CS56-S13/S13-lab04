package edu.ucsb.cs56.S13.lab04.sammin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Test class for Temperature.java
 * @author Samuel Min
 * @version 2013/05/02 for lab04, cs56, s13
 * @see Temperature
 */

public class TemperatureTest{

	/** Test case for no-arg constructor
 	* @see Temperature
 	*/
	
	@Test
	public void test_noArg(){
		Temperature t = new Temperature();
		assertEquals("The temperature is 23 in Celsius",t.toString());
	}
	
	/** Test case for 2 arg constructor
 	* @see Temperature
 	*/
	
	@Test
	public void test_2Arg(){
		Temperature t = new Temperature("Kelvin",500);
		assertEquals("The temperature is 500 in Kelvin",t.toString());
	}

	/** Test case for getUnit()
	 * @see Temperature
	 */
 
	@Test
	public void test_getUnit(){
		Temperature t = new Temperature();
		assertEquals("Celsius",t.getUnit());
	}

	/** Test case for getValue()
 	* @see Temperature
 	*/

	@Test
	public void test_getValue(){
		Temperature t = new Temperature();
		assertEquals(23,t.getValue());
	}

	/** Test case for setUnit()
 	* @see Temperature
 	*/

	@Test
	public void test_setUnit(){
		Temperature t = new Temperature();
		t.setUnit("Kelvin");
		assertEquals("Kelvin", t.getUnit());
	}

	/** Test case for setValue()
 	* @see Temperature
 	*/

	@Test
	public void test_setValue(){
		Temperature t = new Temperature();
		t.setValue(670);
		assertEquals(670,t.getValue());
	}

	/** Test case for toString()
 	* @see Temperature
 	*/

	@Test
	public void test_toString(){
		Temperature t = new Temperature("Kelvin", 800);
		assertEquals("The temperature is 800 in Kelvin", t.toString());
	}

	/** Test case for equals()
 	* @see Temperature
 	*/

	@Test
	public void test_equals(){
		Temperature t = new Temperature("Celsius", 60);
		Temperature z = new Temperature("Celsius", 60);
		assertEquals(true,z.equals(t));
	}
}
