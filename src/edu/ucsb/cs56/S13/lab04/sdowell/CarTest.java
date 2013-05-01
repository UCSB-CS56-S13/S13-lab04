package edu.ucsb.cs56.S13.lab04.sdowell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CarTest{

    @Test
    public void test_DefaultConstructor_and_getters(){
	Car c = new Car();
	assertEquals("Dodge Challenger",c.getName());
	assertEquals(2010,c.getYear());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_HondaCRV_2004(){
	Car c = new Car("Honda CRV", 2004);
	assertEquals("Honda CRV", c.getName());
	assertEquals(2004, c.getYear());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_ToyotaCorolla_2006(){
	Car c = new Car("Toyota Corolla", 2006);
	assertEquals("Toyota Corolla", c.getName());
	assertEquals("2006", c.getYear());
    }

    @Test
    public void test_toString(){
	Car c = new Car();
	assertEquals("Dodge Challenger 2010", c.toString());

    }
    @Test
    public void test_toString_HondaCRV_2004(){
	Car c = new Car("Honda CRV", 2004);
	assertEquals("Honda CRV 2004", c.toString());


    }

    @Test
    public void test_toString_ToyotaCorolla_2006(){
	Car c = new Car("Toyota Corolla", 2006);
	assertEquals("Toyota Corolla 2006", c.toString());
    }
    @Test
    public void test_equals_equal1(){
	Car c1 = new Car("Honda CRV", 2004);
	Car c2 = new Car("Honda CRV", 2004);
	assertTrue(c1.equals(c2));

    }
    @Test
    public void test_equals_equal2(){
	Car c1 = new Car();
	Car c2 = new Car();
	assertTrue(c1.equals(c2));
    }
    @Test
    public void test_equals_notequal(){
	Car c1 = new Car();
	Car c2 = new Car("Honda CRV", 2004);
	assertFalse(c1.equals(c2));

    }

}
