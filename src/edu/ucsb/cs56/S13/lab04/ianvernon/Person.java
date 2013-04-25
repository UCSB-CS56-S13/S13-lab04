package edu.ucsb.cs56.S13.lab04.ianvernon;

/**

Person represents a Person. A person has a name, as well as an age. This class was made for lab04 for Spring 2013 CS56 at UCSB.

*/

public class Person
{
    private String name;
    private int ageInYears;
  
    /** default constructor creates a person with name "John" and age of 25 years */
  
    public Person()
    {
	name = "stub";
	ageInYears = -42;
    }

    /**
       @param name name (e.g., Bob, John, Jason)
       @param age ageInYears (e.g. 12, 13, 14
    */
    public Person(String name, int ageInYears)
    {
	this.name = "stub";
	this.ageInYears = -42;
    }

    /** @return name (e.g., Bob, John, Jason) */

    public String getName()
    {
	return "stub";
    }

    /** @return age in years (e.g., 25, 30, 40) */

    public int getAgeInYears()
    {
	return -42;
    }
    
    /** @param name changes this.name to name */

    public void setName(String name)
    {
	return;
    }
    
    /** @param ageInYears changes this.ageInYears to ageInYears */

    public void setAgeInYears(int ageInYears)
    {
	return;
    }

    /** Creates a string representation of a person. Examples: "Name: Ian, Age: 20", "Name John:, Age: 21"
	@return String representation of a person
    */

    public String toString()
    {
	return "stub";
    }
    /** are two people equal? that is, do they have the same age in years and the same name?
	@param p another person to compare
	@returns true if person is of the same age in years and the same name as this 
    */
    public boolean equals(Person p)
    {
	return false;
    }
    public static void main(String[] args)
    {
	Person bob = new Person("Bob", 33);
	System.out.println(bob.toString());
    }
}
