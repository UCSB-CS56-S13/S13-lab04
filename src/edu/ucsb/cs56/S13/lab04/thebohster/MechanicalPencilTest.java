package edu.ucsb.cs56.S13.lab04.thebohster;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MechanicalPencilTest{

    @Test public void testMechanicalPencilNoArg(){
	MechanicalPencil sample = new MechanicalPencil();
	assertEquals("bic", "stub");
	assertEquals(42, -42);
    }

    @Test public void testMechanicalPencil2Args(){
	MechanicalPencil sample = new MechanicalPencil("sample", 500);
	assertEquals("sample", "stub");
	assertEquals(500, -42);
    }

    @Test public void testGetBrand(){
	MechanicalPencil sample = new MechanicalPencil("sample", 500);
	assertEquals("sample", "stub");
    }

    @Test public void testGetLeadSize(){
	MechanicalPencil sample = new MechanicalPencil("sample", 500);
	assertEquals(500, -42);
    }

    @Test public void testSetBrand(){
	MechanicalPencil sample = new MechanicalPencil("temp", 500);
	sample.setBrand("bic");
	assertEquals("bic", "stub");
    }

    @Test public void testSetLeadSize(){
	MechanicalPencil sample = new MechanicalPencil("sample", 42);
	sample.setLeadSize(700);
	assertEquals(700, -42);
    }

    @Test public void testToString(){
	MechanicalPencil sample = new MechanicalPencil("sample", 500);
	assertEquals("sample 500um", "stub");
    }

    @Test public void testEquals1(){
	MechanicalPencil sample1 = new MechanicalPencil("sample", 500);
	MechanicalPencil sample2 = new MechanicalPencil("sample", 500);
	assertTrue(sample1.equals(sample2));
    }

    @Test public void testEquals2(){
	MechanicalPencil sample1 = new MechanicalPencil();
        MechanicalPencil sample2 = new MechanicalPencil();
        assertTrue(sample1.equals(sample2));
    }

    @Test public void testEquals3(){
	MechanicalPencil sample1 = new MechanicalPencil("sample", 500);
        MechanicalPencil sample2 = new MechanicalPencil("notSample", 700);
        assertFalse(sample1.equals(sample2));
    }
}
