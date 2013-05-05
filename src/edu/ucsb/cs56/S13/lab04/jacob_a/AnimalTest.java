package edu.ucsb.cs56.S13.lab04.jacob_a;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Animal

@author Jacob Anderson
@version CS56, S13, lab04
@see Animal

*/

public class AnimalTest {

    @Test
    public void test_DefaultConstructor_and_getters() {
		
	Animal a = new Animal();
	assertEquals("",a.getSpecies());
	assertEquals(-1,a.getNumberOfLegs());
    }
    
    @Test
    public void test_TwoArgConstructor_and_getters() {	
	
	Animal dog = new Animal("Canis Lupis", 4);
	assertEquals("Canis Lupis",dog.getSpecies());
	assertEquals(4,dog.getNumberOfLegs());	
    }

    @Test
    public void test_toString() {
	
	Animal dog = new Animal("Canis Lupis", 4);
	assertEquals("Species: Canis Lupis, NumberOfLegs: 4",dog.toString());
    }

    @Test
    public void test_equals() {
		
        Animal dog1 = new Animal("Canis Lupis", 4);
	Animal dog2 = new Animal("Canis Lupis", 4);
	assertTrue(dog1.equals(dog2));
    }

    @Test
    public void test_DefaultConstructor() {	
	Animal a = new Animal();
	assertEquals("",a.getSpecies());
	assertEquals(-1,a.getNumberOfLegs());	
    }

    @Test
    public void test_DefaultConstructor_setSpecies_getSpecies(){
	Animal a = new Animal();
	a.setSpecies("Canis Lupis");
	assertEquals("Canis Lupis", a.getSpecies());
    }

    @Test
    public void test_DefaultConstructor_setNumberOfLegs_getNumberOfLegs(){
	Animal a = new Animal();
	a.setNumberOfLegs(4);
	assertEquals(4,a.getNumberOfLegs());
    }

} // class Animal.java
