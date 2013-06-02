package edu.ucsb.cs56.S13.lab04.cmmorris;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Recipe

@author Christina Morris
@version CS56, S13, lab04
@see Recipe

*/

public class RecipeTest {

    @Test
    public void test_DefaultConstructor_and_getters() {
	Recipe r = new Recipe();
	assertEquals("empty", r.getMeal());
	assertEquals(0, r.getCookingTimeInMinutes());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_Mac() {
	Recipe mac = new Recipe("Macaroni and Cheese", 15);
	assertEquals("Macaroni and Cheese", mac.getMeal());
	assertEquals(15, mac.getCookingTimeInMinutes());
    }

    @Test
    public void test_TwoArgConstructor_Cookies() {
     	Recipe cookies = new Recipe("Chocolate Chip Cookies", 30);
	assertEquals("Chocolate Chip Cookies", cookies.getMeal());
	assertEquals(30, cookies.getCookingTimeInMinutes());
    }

    @Test
    public void test_setters1() {
	Recipe r = new Recipe();
	r.setMeal("Macaroni and Cheese");
	r.setCookingTimeInMinutes(15);
	assertEquals("Macaroni and Cheese", r.getMeal());
	assertEquals(15, r.getCookingTimeInMinutes());
    }
		     
    @Test
    public void test_setters2() {
       	Recipe r = new Recipe("Chocolate Chip Cookies", 30);
	r.setMeal("Macaroni and Cheese");
	r.setCookingTimeInMinutes(15);
	assertEquals("Macaroni and Cheese", r.getMeal());
	assertEquals(15, r.getCookingTimeInMinutes());
    }

    @Test
    public void test_toString_empty() {
       	Recipe r = new Recipe();
	assertEquals("empty, 0min", r.toString());
    }


    @Test
    public void test_toString_Mac() {
      	Recipe mac = new Recipe("Macaroni and Cheese", 15);
	assertEquals("Macaroni and Cheese, 15min", mac.toString());
    }

    @Test
    public void test_toString_Cookies() {
       	Recipe cookies = new Recipe("Chocolate Chip Cookies", 30);
	assertEquals("Chocolate Chip Cookies, 30min", cookies.toString());
    }

    @Test
    public void test_equals_equals1() {
      	Recipe mac1 = new Recipe("Macaroni and Cheese", 15);
      	Recipe mac2 = new Recipe("Macaroni and Cheese", 15);
	assertTrue(mac1.equals(mac2));
    }

    @Test
    public void test_equals_equals2() {
	Recipe r1 = new Recipe();
	Recipe r2 = new Recipe();
	assertTrue(r1.equals(r2));
    }

    @Test
    public void test_equals_notequals() {
	Recipe r = new Recipe();
      	Recipe mac = new Recipe("Macaroni and Cheese", 15);
	assertFalse(r.equals(mac));
    }

}//class RecipeTese.java
