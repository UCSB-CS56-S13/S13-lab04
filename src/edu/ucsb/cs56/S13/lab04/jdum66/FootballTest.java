package edu.ucsb.cs56.S13.lab04.jdum66;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Football                                                

@author Jake Dumont
@version CS56, S13, lab04                                                      
@see Football                                                               

*/


public class FootballTest {


    @Test
    public void NoArgConstructor_Test() {
	Football team = new Football();
	assertEquals("", team.getTeamName());
	assertEquals(0, team.getNumTitles());
    }
    
    @Test
    public void TwoArgConstructor_Test() {
	Football team = new Football("Dallas Cowboys", 5);
	assertEquals("Dallas Cowboys", team.getTeamName());
	assertEquals(5, team.getNumTitles());
    }

    @Test
    public void getTeamName_Test() {
	Football team = new Football("Dallas Cowboys", 5);
	assertEquals("Dallas Cowboys", team.getTeamName());
    }

    @Test
    public void getNumTitles_Test() {
	Football team = new Football("Dallas Cowboys", 5);
	assertEquals(5, team.getNumTitles());
    }

    @Test
    public void setTeamName_Test() { 
	Football team = new Football();
	team.setTeamName("Washington Redskins");
	assertEquals("Washington Redskins", team.getTeamName());
    }

    @Test
    public void setNumTitles_Test() {
	Football team = new Football();
	team.setNumTitles(3);
	assertEquals(3, team.getNumTitles());
    }

    @Test
    public void toString_Test() {
	Football team = new Football("Oakland Raiders", 4);
	assertEquals("Oakland Raiders: 4 championships", team.toString());
    }

    @Test
    public void toString1_Test() {
	Football team = new Football();
	assertEquals("San Diego Chargers: 0 championships", team.toString());
    }
    
    @Test
    public void equals_Test() {
	Football team1 = new Football("Miami Dolphins", 0);
	Football team2 = new Football("Miami Dolphins", 0);
	assertTrue(team1.equals(team2));
    }

    @Test
    public void equals1_Test() {
	Football team1 = new Football();
        Football team2 = new Football();
	assertTrue(team1.equals(team2));
    }

    @Test
    public void notequal_Test() {
	Football team1 = new Football("Minnesota Vikings", 2);
	Football team2 = new Football("Arizona Cardinals", 1);
	assertFalse(team1.equals(team2));
    }
}
