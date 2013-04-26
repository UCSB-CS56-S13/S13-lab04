package edu.ucsb.cs56.S13.lab04.maperghis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Purchased
 * @author Miranda Aperghis
 * @version 04/25/2013, CS56, S13, lab04
 */

public class PurchasedTest{
	
	/**
 	*Test case for default Constructor and getters
 	*@see Purchased
 	*/  
	@Test
		public void test_DefaultConstructor_and_getters(){
			Purchased p = new Purchased();
			assertEquals("",p.getObjectPurchased());
			assertEquals(0,p.getNumberPurchased());
		}

	/**
 	*Test case for two arg Constructor and getters
 	*@see Purchased
 	*/  
	@Test
		public void test_TwoArgConstructor_and_getters1(){
			Purchased p = new Purchased("Chair",4);
			assertEquals("Chair",p.getObjectPurchased());
			assertEquals(4,p.getNumberPurchased());
		}

	/**
 	*Test case for Purchased.toString() method
 	*@see Purchased
 	*/  
	@Test
		public void test_toString1(){
			Purchased p = new Purchased("Chair",4);
			assertEquals("Chair : 4 purchased",p.toString());
		}

	/**
 	*Test case for Purchased.equals() method
 	*@see Purchased
 	*/
	@Test
		public void test_equals1(){
			Purchased p1 = new Purchased("Chair",4);
			Purchased p2 = new Purchased("Chair",5);
			assertEquals(false,p1.equals(p2));
		}
	
	/**
        *Test case for Purchased.equals() method
        *@see Purchased
        */
        @Test
                public void test_equals2(){
                        Purchased p1 = new Purchased("Chair",4);
                        Purchased p2 = new Purchased("Book",4);
                        assertEquals(false,p1.equals(p2));
                }

	/**
        *Test case for Purchased.equals() method
        *@see Purchased
        */
        @Test
                public void test_equals3(){
                        Purchased p1 = new Purchased("Chair",4);
                        assertEquals(true,p1.equals(p1));
                }
}
