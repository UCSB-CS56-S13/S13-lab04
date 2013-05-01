package edu.ucsb.cs56.S13.lab04.dlyd2b;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for RadioStation

@author Daniel Ly
@version CS56, S13, lab04
@see Job

*/

public class JobTest {
   
    @Test public void test_defaultConstructor_and_getters(){
	Job j = new Job();
	assertEquals("Unemployed", j.getJob());
	assertEquals(0, j.getAnnualWageInDollars());
    }

    @Test public void test_twoArgConstructor_and_getters(){
	Job j = new Job("Retail Cashier", 25000);
	assertEquals("Retail Cashier", j.getJob());
	assertEquals(25000, j.getAnnualWageInDollars());
    }

    @Test public void test_toString(){
	Job j = new Job();
	assertEquals("Unemployed, 0", j.toString());
    }

    @Test public void test_getJob(){
	Job j = new Job();
	assertEquals("Unemployed", j.getJob());
    }

    @Test public void test_getAnnualWageInDollars(){
	Job j = new Job();
	assertEquals(0, j.getAnnualWageInDollars());
    }

    @Test public void test_setJob(){
	Job j = new Job();
	j.setJob("Customer Service");
	assertEquals("Customer Service", j.getJob());
    }

    @Test public void test_setAnnualWageInDollars(){
	Job j = new Job();
	j.setAnnualWageInDollars(100);
	assertEquals(100, j.getAnnualWageInDollars());
    }
    
    @Test public void test_equals() {
	Job j = new Job();
	Job k = new Job();
	assertTrue(j.equals(k));
    }

    @Test public void test_notEquals() {
	Job j = new Job();
	Job k = new Job("Cook", 30000);
	assertFalse(j.equals(k));
    }

} // class Job.java
