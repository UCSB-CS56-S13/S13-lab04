package edu.ucsb.cs56.S13.lab04.mlindsay56;
import static org.junit.Assert.assertEquals,assertTrue,assertNotNull;
import org.junit.Test;

public class CoffeeTest(){

    public void test_CoffeeSetUp(){
	Coffee c1 = new Coffee();	
	Coffee c2 = new Coffee("Mocha Latte",10);
	assertNotNull(c1);
	assertNotNull(c2);
    }

    
    public void test_getTypeOfCoffee(){
	Coffee c = new Coffee("Americano",3);
	assertEquals("Americano",c.getTypeOfCoffee());
    }
    
    public void test_getHeight_inches(){
        Coffee c = new Coffee("Latte",11);
	assertEquals("Latte",c.getHeight_inches());
    }
    
    public void test_setTypeOfCoffee(String typeOfCoffee){
	Coffee c = new Coffee("Latte",10);
	c.setTypeOfCoffee("Red Eye");
	assertEquals("Red Eye",c.getTypeOfCoffee());
    }
   
    public void test_setHeight_inches(int height_inches){
	Coffee c = new Coffee("Latte",10);
	c.setHeight_inches(14);
	assertEquals(14,c.getTypeOfCoffee());   
    }

    public void test_toString(){
	Coffee c = new Coffee("Iced Mocha",12);
	assertEquals("12 inch Iced Mocha",c.toString());
     }
    
    public void test_equals(Coffee c){
	Coffee c1 = new Coffee("Latte",5);	
	Coffee c2 = new Coffee("Vanilla Latte",12);
	assertTrue(true,c1.equals(c1));
	assertTrue(false,c1.equals(c2));
     }
    
