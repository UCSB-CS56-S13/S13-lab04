package edu.ucsb.cs56.S13.lab04.shanencross;

/**

@author Shanen Cross
@version CS56, S13, lab04

   Represents a person who is standing in a line (such as a line at the grocery story, for example). 
   Holds that preson's name, and their place in line.
   So if they are first in line, their number is 1. If they are 5th in line, their number is 5.
 */

public class PersonInLine  {
    private String name;
    private int numberInLine;


    /**
       No arg constructor. Initializes name to an empty string, and numberInLine to 1,
       so that the person is first in line by default (0th in line is meaningless).
     */
    public PersonInLine() {
	this.name = "";
	this.numberInLine = 1;
    }


    /** Two arg constructor with String and int for initializing name and place in line.
	@param name Name of the person
	@param numberInLine Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
       
     */
    public PersonInLine(String name, int numberInLine) {
	this.name = name;
	this.numberInLine = numberInLine;
    }


    /** @return Name of the person
     */
    public String getName() { 
	return this.name; 
    }

    /** @return Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public int getNumberInLine() { 
	return this.numberInLine;
    }

    /** @param name Name of the person
     */
    public void setName(String name) { 
	this.name = name;
    }

    /** @param numberInLine representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public void setNumberInLine(int numberInLine) {
	this.numberInLine = numberInLine;
    }

    /** Convert to a string representation that includes name and place in line.
	Example: John Smith, 7th place

	@return String representation of person containing both name and place in line
     */
    public String toString() {
	return "ergrsejonlsd"; // STUB
    }

    /** Tests if another object is equal to this person
	@param Object o Another object
	@return true or false value indicating equality of object to the person in line
     */
    public boolean equals(Object o) {
	// Necessary Boiler Plate code
	// Makes sure o is not null and is of the same datatype
	if (o == null)
            return false;
        if (!(o instanceof PersonInLine))
            return false;

	PersonInLine other = (PersonInLine) o;

	// true if both name and line number match
	if (this.name == other.getName() && this.numberInLine == other.getNumberInLine()) {
	    return true;
	}
	
	// otherwise, false
	return false;
    }

    /** A sample main() method which uses the PersonInLine class.
     */

    public static void main(String args[]) {
	// STUB
    }
}
