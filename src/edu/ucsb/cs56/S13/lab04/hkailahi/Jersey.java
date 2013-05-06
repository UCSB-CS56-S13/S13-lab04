package edu.ucsb.cs56.S13.lab04.hkailahi;

/**
 Class Jersey holds the name of the team
 and a jersey number.
*/

class Jersey {

    private String teamName;
    private int num;


    /**
       Default constructor sets NULL string to team 
       name and 0 to jersey number.
    */
    public Jersey() {
	this.teamName = "Jaguars";
	this.num = 0;
    }


    /**
       @param String team holds name of team
       @param int number holds jersey number
    */
    public Jersey(String team, int number) {
	this.teamName = team;
	this.num = number;
    }


    /**
       @return teamName
    */
    public String getTeamName() {
	return teamName;
    }


    /**
       @return num
    */
    public int getNum() {
	return num;
    }


    /**
       @param set teamName to team
    */
    public void setTeamName(String team) {
	this.teamName = team;       
    }


    /**
       @param set number to num
    */
    public void setNum(int number) {
	this.num = number;
    }


    /**
       toString method to express values as string
       @return "Team Name: Number: "
    */
    public String toString() {
	return "" + this.teamName + " " + this.num;
    }


    /**
   Sees if values in Jersey objects are equal
    */
    public boolean equals(Object o) {
	if (! (o instanceof Jersey) ) {
	    return false;
	}
	else {
	    Jersey j = (Jersey) o;
	    return (j.getTeamName() == this.getTeamName() && j.getNum() == this.getNum());
	}
    }


    /**
       Main method
    */
    public static void main (String [] args) {
        Jersey j = new Jersey();
        System.out.println(j);
    }
}


