package edu.ucsb.cs56.S13.lab04.hkailahi;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/** test class for Jersey

@author Heneli Kailahi 
@version CS56, S13, lab04
@see Jersey

*/

public class JerseyTest {


    @Test
    public void NoArgConstructor_Test() {
        Jersey j = new Jersey();
        assertEquals("Jaguars", j.getTeamName());
        assertEquals(0, j.getNum());
    }

    @Test
    public void TwoArgConstructor_Test() {
        Jersey j = new Jersey("49ers", 7);
        assertEquals("49ers", j.getTeamName());
        assertEquals(7, j.getNum());
    }

    @Test
    public void getTeamName_Test() {
        Jersey j = new Jersey("49ers", 7);
        assertEquals("49ers", j.getTeamName());
    }

    @Test
    public void getNum_Test() {
        Jersey j = new Jersey("49ers", 7);
        assertEquals(7, j.getNum());
    }

    @Test
    public void setTeamName_Test() {
        Jersey j = new Jersey();
        j.setTeamName("Raiders");
        assertEquals("Raiders", j.getTeamName());
    }

    @Test
    public void setNum_Test() {
        Jersey j = new Jersey();
        j.setNum(5);
        assertEquals(5, j.getNum());
    }

    @Test
    public void toString_Test() {
        Jersey j = new Jersey("Raiders", 9);
        assertEquals("Raiders 9", j.toString());
    }

    @Test
    public void toString1_Test() {
        Jersey j = new Jersey();
        assertEquals("Jaguars 0", j.toString());
    }

    @Test
    public void equals_Test() {
        Jersey j1 = new Jersey("49ers", 7);
        Jersey j2 = new Jersey("49ers", 7);
        assertTrue(j1.equals(j2));
    }

    @Test
    public void equals1_Test() {
        Jersey j1 = new Jersey();
        Jersey j2 = new Jersey();
        assertTrue(j1.equals(j2));
    }

}
