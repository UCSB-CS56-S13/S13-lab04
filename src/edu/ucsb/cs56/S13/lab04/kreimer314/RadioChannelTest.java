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

/**
* Test to confirm that the default constructor properly initializes values
*@see RadioChannel#RadioChannel()
*/

    @Test public void testNoArgConstructor(){
	RadioChannel rc = new RadioChannel();
	assertEquals(null,rc.getName());
	assertEquals(0,rc.getFreq());
    }
	
/**
* Test to ensure arguments are properly assigned in the two argument constructor
*@see RadioChannel#RadioChannel(String name, int freq)
*/

    @Test public void testTwoArgConstructor(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks",rc.getName());
	assertEquals(3500,rc.getFreq());
    }

/**
* Test to make sure the name getter properly gets the name
*@see RadioChannel#getName()
*/
	
    @Test public void testGetName(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks",rc.getName());
    }
	
/**
* Test to make sure thre frequency getter properly gets the frequency
*@see RadioChannel#getFreq()
*/

    @Test public void testGetFreq(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals(3500,rc.getFreq());
    }
	
/**
* Test to make sure the name setter properly sets the name
*@see RadioChannel#setName(String name)
*/

    @Test public void testSetName(){
	RadioChannel rc = new RadioChannel();
	rc.setName("UCSBTalks");
	assertEquals("UCSBTalks",rc.getName());
    }

/**
* Test to make sure the frequency setter properly sets the frequency
*@see RadioChannel#setFreq(int freq)
*/
	
    @Test public void testSetFreq(){
	RadioChannel rc = new RadioChannel();
	rc.setFreq(3500);
	assertEquals(3500,rc.getFreq());
    }

/** 
* Test to make sure the toString method properly formats its output
*@see RadioChannel#toString()
*/	
	
    @Test public void testToString(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals("UCSBTalks at frequency 3500Hz",rc.toString());
    }
	
/**
* Test to make sure the equals method considers all instance variables
*@see RadioChannel#equals(Object o)
*/	

    @Test public void testEquals(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	RadioChannel rc2 = new RadioChannel("UCSBTalks",3500);
	assertEquals(true,rc.equals(rc2));
    }
	
/**
* Test to make sure the equals works with a null RadioChannel argument
*@see RadioChannel#equals(object o)
*/
	
	@Test public void testNullEquals(){
	RadioChannel rc = new RadioChannel("UCSBTalks",3500);
	assertEquals(false,rc.equals(null));
	}
	
/**
* Test to make sure the equals method returns true for null-null comparison
*@see RadioChannel#equals(object o)
*/
	
	@Test public void testNullNullEquals(){
	RadioChannel rc = new RadioChannel();
	RadioChannel rc2 = new RadioChannel();
	assertEquals(true,rc.equals(rc2));
	}
	
/**
* Test to make sure the equals method returns false for a foreign object
*@see RadioChannel#equals(object o)
*/
	
	@Test public void testForiegnEquals(){
	RadioChannel rc = new RadioChannel();
	assertEquals(false,rc.equals(5));
	}
	
}
