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
       The Default Constructor sets an empty string for the team name
       and sets the number of titles to 0.
    */
    public Football() {
	this.teamName = "San Diego Chargers";
	this.numTitles = 0;
    }

    /** 
       @param String name represents the full name of the NFL team
       @param int titles represents the number of Super Bowls the team has won
    */
    public Football(String name, int titles) {
	this.teamName = name;
	this.numTitles = titles;
    }

    /**
       @return teamName
    */
    public String getTeamName() {
	return teamName; 
    }

    /**
       @return numTitles
    */
    public int getNumTitles() {
	return numTitles; 
    }
    
    /**
       @param set teamName to name
    */
    public void setTeamName(String name) {
	this.teamName = name;
    }

    /**
       @param set numTitles to titles
    */
    public void setNumTitles(int titles) {
	this.numTitles = titles;
    }
    
    /** 
	toString method to put attribute values into string format
	@return "Team Name: Number of Championships"
    */
    public String toString() {
	if (this.numTitles != 1) {
	    return this.teamName + ": " + this.numTitles + " championships";
	}
	else {
	    return this.teamName + ": " + this.numTitles + " championship";
	}
    }

    /**
       Compares whether the values of two Football objects are equal
       @return true if same team (false if different teams)
    */
    public boolean equals(Object o) {
	if (! (o instanceof Football) ) {
            return false;
	}
	else {
	    Football other = (Football) o;
	    return (other.getTeamName() == this.getTeamName() &&
		    other.getNumTitles() == this.getNumTitles());
	}
    }

    /**
       Simple main method to use Football class
    */
    public static void main (String [] args) {
	Football team = new Football();
	System.out.println(team);
    }
}
