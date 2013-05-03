package edu.ucsb.cs56.S13.lab04.mlindsay56;
import static org.junit.Assert.*;
import org.junit.Test;

/** test class for Coffee

@author Marc Lindsay
@version CS56, S13, lab04
@see Coffee

*/

public class CoffeeTest {
	
	@Test
    public void test_CoffeeSetUp(){
	Coffee c1 = new Coffee();	
	Coffee c2 = new Coffee("Mocha Latte",10);
	assertNotNull(c1);
	assertNotNull(c2);
    }

    @Test
    public void test_getTypeOfCoffee(){
	Coffee c = new Coffee("Americano",3);
	assertEquals("Americano",c.getTypeOfCoffee());
    }
    
    @Test
    public void test_getHeight_inches(){
        Coffee c = new Coffee("Latte",11);
	assertEquals(11,c.getHeight_inches());
    }
    
    @Test
    public void test_setTypeOfCoffee(){
	Coffee c = new Coffee("Latte",10);
	c.setTypeOfCoffee("Red Eye");
	assertEquals("Red Eye",c.getTypeOfCoffee());
    }
	
	@Test
    public void test_setHeight_inches(){
	Coffee c = new Coffee("Latte",10);
	c.setHeight_inches(14);
	assertEquals(14,c.getHeight_inches());   
    }
	
	@Test
    public void test_toString(){
	Coffee c = new Coffee("Iced Mocha",12);
	assertEquals("12 inch Iced Mocha",c.toString());
     }
    
	@Test
    public void test_equals(){
	Coffee c1 = new Coffee("Latte",5);	
	Coffee c2 = new Coffee("Vanilla Latte",12);
	assertTrue(c1.equals(c1));
	assertFalse(c1.equals(c2));
     }
} // class CoffeeTest.java
