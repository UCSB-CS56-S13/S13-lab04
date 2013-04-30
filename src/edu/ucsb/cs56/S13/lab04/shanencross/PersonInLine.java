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
        //STUB
    }


    /** Two arg constructor with String and int for initializing name and place in line.
	@param name Name of the person
	@param numberInLine Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
       
     */
    public PersonInLine(String name, int numberInLine) {
	// STUB
    }


    /** @return Name of the person
     */
    public String getName() { 
	return "afioadjfao"; // STUB 
    }

    /** @return Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public int getNumberInLine() { 
	return -1; // STUB
    }

    /** @param name Name of the person
     */
    public void setName(String name) { 
	// STUB 
    }

    /** @param numberInLine representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public void setNumberInLine(int numberInLine) {
	// STUB
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
	return false; // STUB
    }

    /** A sample main() method which uses the PersonInLine class.
     */

    public static void main(String args[]) {
	// STUB
    }
}
