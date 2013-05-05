package edu.ucsb.cs56.S13.lab04.lolkaiwut;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for RadioStation

@author Kai-chieh Jann
@version CS56, S13, lab04
@see Basketball

*/

public class BasketballTest {

    public static final double tol = 0.01;

    @Test
    public void test_DefaultConstructor_and_getters() {


	Basketball b = new Basketball();
	assertEquals("Lakers",b.getTeam());
	assertEquals(44,b.getNumOfWins(),tol);

    }
    
    @Test
    public void test_TwoArgConstructor_and_getters_Clippers() {


	Basketball b = new Basketball("Clippers",55);
	assertEquals("Clippers",b.getTeam());
	assertEquals(55,b.getNumOfWIns(),tol);

    }

    @Test
    public void test_TwoArgConstructor_Suns() {

	Basketball b = new Basketball("Suns",43);
	assertEquals("Suns",b.getTeam());
	assertEquals(43,b.getNumOfWIns(),tol);

    }

    @Test
    public void test_toString_Clippers() {

	Basketball b = new Basketball("Clippers", 55);
	assertEquals("[Clippers, 55 wins]",b.toString());
    }

    @Test
    public void test_toString_Lakers() {

	Basketball b = new Basketball("Lakers",44);
	assertEquals("[Lakers, 44 wins]",b.toString());

    }

    @Test
    public void test_toString_Warriors() {

	Basketball b = new Basketball("Warriors",54);
	assertEquals("[Warriors, 54 wins]",b.toString());
    }

    @Test
    public void test_equals_equal1() {

	Basketball b1 = new Basketball("Lakers",44);
	Basketball b2 = new Basketball("Lakers",44);
	assertTrue(b1.equals(b2));
    }

    @Test
    public void test_equals_equal2() {

	Basketball b1 = new Basketball();
	Basketball b2 = new Basketball();
	assertTrue(b1.equals(b2));
    }

    @Test
    public void test_equals_notequal() {

	Basketball b1 = new Basketball();
	Basketball b2 = new Basketball("Lakers",44);
	assertFalse(b1.equals(b2));
    }


} // class Basketball.java
