package edu.ucsb.cs56.S13.lab04.kreimer314;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 *
 * Test class for RadioChannel class
 *@author Keenan Reimer
 *@version 0:lab04
 *@see RadioChannel
 */

public class RadioChannelTest{

    @Test public void testNoArgConstructor(){
	RadioChannel rc = new RadioChannel();
	assertEquals(null,rc.getName());
	assertEquals(0,rc.getFreq());
    }

    @Test public void testTwoArgConstructor(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks",rc.getName());
	assertEquals(3500,rc.getFreq());
    }

    @Test public void testGetName(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks",rc.getName());
    }

    @Test public void testGetFreq(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals(3500,rc.getName());
    }

    @Test public void testSetName(){
	RadioChannel rc = new RadioChannel();
	rc.setName("UCSBTalks");
	assertEquals("UCSBTalks",rc.getName());
    }

    @Test public void testSetFreq(){
	RadioChannel rc = new RadioChannel();
	rc.setFreq(3500);
	assertEquals(3500,rc.getFreq());
    }

    @Test public void testToString(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks at frequency 3500Hz",rc.toString());
    }

    @Test public void testEquals(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	RadioChannel rc2 = new RadioChannel("UCSBTalks",3500);
	assertEquals(true,rc.equals(rc2));
    }
}
