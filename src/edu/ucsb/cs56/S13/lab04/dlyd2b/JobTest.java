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
   
    @Test public void test_DefaultConstructor_and_Getters(){
	Job j = new Job();
	assertEquals("Unemployed", j.getJob());
	assertEquals(0, j.getAnnualWageInDollars());
    }

    @Test public void test_TwoArgConstructor_and_Getters(){
	job j = new Job("Retail Cashier", 25000);
	assertEquals("Retail Cashier", j.getJob());
	assertEquals(25000, j.getAnnualWageInDollars());
    }

    @Test public void test_toString(){
	Job j = new Job();
	assertEquals("Unemployed, 0", j.toString());
    }

    @Test public void test_setJob(){
	Job j = new Job();
	j.setJob("Customer Service");
	assertEquals("Customer Service", j.getJob());
    }

    @Test public void test_setAnnualWageInDollars(){
	Job j = new Job();
	j.setAnnaulWageInDollars(100);
	assertEquals(100, j.getAnnualWageInDollars());
    }
}

