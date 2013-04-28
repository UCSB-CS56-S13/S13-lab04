package edu.ucsb.cs56.S13.lab04.jdum66;


/**
Class Football represents an NFL football team and 
the number of titles, aka Super Bowls, the team has won.
The number is a positive integer greater than or equal 
to zero.
*/

public class Football {

    private String teamName;
    private int numTitles;

    /**
       The Default Constructor creates the team, San Diego Chargers,
       and sets the number of titles to 0.
    */
    public Football() {
	//stub;
    }

    /** 
       @param String name represents the full name of the NFL team
       @param int titles represents the number of Super Bowls the team has won
    */
    public Football(String name, int titles) {
	//stub;
    }

    /**
       @return teamName
    */
    public String getTeamName() {
	return ""; //@STUB
    }

    /**
       @return numTitles
    */
    public int getNumTitles() {
	return -55; //@STUB
    }
    
    /**
       @param set teamName to name
    */
    public void setTeamName(String name) {
	//stub;
    }

    /**
       @param set numTitles to titles
    */
    public void setNumTitles(int titles) {
	//stub;
    }
    
    /** 
	toString method to put attribute values into string format
	@return "Team Name: Number of Championships"
    */
    public String toString() {
	return ""; //STUB
    }

    /**
       Compares whether the values of two Football objects are equal
       @return true if same team (false if different teams)
    */
    public boolean equals(Object o) {
	return false; //STUB
    }

    /**
       Simple main method to use Football class
    */
    public static void main (String [] args) {
	//STUB;
    }
}
