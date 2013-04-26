package edu.ucsb.cs56.S13.lab04.mglodack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Dorm
    @author Mathew Glodack
    @version 04/25/13 lab04, cs56, s13
    @see Dorm
*/

public class DormTest {
    
/**
 *test no arg constructor from Dorm
 *@see Dorm#Dorm()
 */
@Test
public void test_NoArgConstructor(){
    Dorm d = new Dorm();
    assertEquals(0,d.getCurrentNum());
    assertEquals("",d.getName());
}

/**
 *test argument constructor from Dorm
 *@see Dorm #Dorm(String name, int currentNum)
 */

 @Test
 public void test_twoArgumentConstructor(){
    Dorm d = new Dorm("Santa Catalina", 450);
    assertEquals("Santa Catalina",d.getName());
    assertEquals(450, d.getCurrentNum());
 }

/**
 *test setName() from Dorm
 *@see Dorm #Dorm.setName()
 */

 @Test
 public void test_setName(){
    Dorm d = new Dorm();
    d.setName("Santa Catalina");
    assertEquals("Santa Catalina",d.getName());
 }

 /**
  *test setCurrentNum() from Dorm
  *@see Dorm #Dorm.setCurrentNum()
  */
 
 @Test
 public void test_setCurrentNum(){
    Dorm d = new Dorm();
    d.setCurrentNum(450);
    assertEquals(450,d.getCurrentNum());
 }

/** Test case for Dorm.getCurrentNum()
 * @see Dorm
 */
 
@Test
public void test_getCurrentNum(){
        Dorm ft = new Dorm("Santa Catalina", 450);
        assertEquals(450,ft.getCurrentNum());
        
}

/** Test case for Dorm.getName()
*   @see Dorm
*/

@Test
public void test_getName(){
    Dorm ft = new Dorm("Santa Catalina", 450);
    assertEquals("Santa Catalina",ft.getName());
}

/**
 *Test case for Dorm.toString()
 *@see Dorm
 */


@Test
public void test_toString1(){
    Dorm ft = new Dorm("Santa Catalina", 450);
    assertEquals("Dorm: Santa Catalina, currentNum: 450",ft.toString());
}

/**
 *Test case for Dorm.equals(Object o)
 *@see Dorm
 */

 @Test
public void test_equals1_Dorm(){
    Dorm ft = new Dorm("Santa Catalina", 450);
    Dorm d = new Dorm("Santa Catalina",450);
    assertTrue(ft.equals(d));
 }
 
 @Test
 public void test_equals2_Dorm(){
    Dorm ft = new Dorm("Santa Catalina", 450);
    Dorm d = new Dorm();
    assertFalse(ft.equals(d));
 }

}