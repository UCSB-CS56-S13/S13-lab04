package edu.ucsb.cs56.S13.lab04.mlindsay56;
import static org.junit.Assert.*;
import org.junit.Test;

/** test class for Coffee

@author Marc Lindsay
@version CS56, S13, lab04
@see Coffee

*/

public class CoffeeTest {
	
	/**@link Coffee:Coffee(), Coffee:Coffee(String typeOfCoffee, int height_inches)
	testing no-arg and two-arg constructor from Coffee class*/
	@Test
    public void test_CoffeeSetUp(){
	Coffee c1 = new Coffee();	
	Coffee c2 = new Coffee("Mocha Latte",10);
	assertNotNull(c1);
	assertNotNull(c2);
    }

	/**@link Coffee:getTypeOfCoffee()
	testing getTypeOfCoffee method from Coffee class*/
    @Test
    public void test_getTypeOfCoffee(){
	Coffee c = new Coffee("Americano",3);
	assertEquals("Americano",c.getTypeOfCoffee());
    }
    
    /**@link Coffee:getHeight_inches()
    testing getHeight_inches method from Coffee class*/
    @Test
    public void test_getHeight_inches(){
    Coffee c = new Coffee("Latte",11);
	assertEquals(11,c.getHeight_inches());
    }
    
    /**@link Coffee:setTypeOfCoffee(String typeOfCofee)
    testing setTypeOfCoffee method from Coffee class*/
    @Test
    public void test_setTypeOfCoffee(){
	Coffee c = new Coffee("Latte",10);
	c.setTypeOfCoffee("Red Eye");
	assertEquals("Red Eye",c.getTypeOfCoffee());
    }
	
	/**@link Coffee:setHeight_inches(int height_inches)
    esting setHeight_inches method from Coffee class*/
	@Test
    public void test_setHeight_inches(){
	Coffee c = new Coffee("Latte",10);
	c.setHeight_inches(14);
	assertEquals(14,c.getHeight_inches());   
    }
	
	/**@link Coffee:toString()
    testing toString method from Coffee class*/
	@Test
    public void test_toString(){
	Coffee c = new Coffee("Iced Mocha",12);
	assertEquals("12 inch Iced Mocha",c.toString());
     }
    
    /**@link Coffee:equals(Object o)
    testing equals method from Coffee class*/
	@Test
    public void test_equals(){
	Coffee c1 = new Coffee("Latte",5);	
	Coffee c2 = new Coffee("Vanilla Latte",12);
	assertTrue(c1.equals(c1));
	assertFalse(c1.equals(c2));
     }
} // class CoffeeTest.java
