package edu.ucsb.cs56.S13.lab04.CallumSteele;

/**
 *
 * Fruit represents a Fruit. A fruit has both a "name" and a weight in grams.
 *
 * @author Callum Steele
 * @version CS56, S13, lab04
 *
 */

public class Fruit {

	private String name = "Apple";
	private int weightGrams = 100;

	/** Default constructor creates a Fruit with name Apple and weight 100 grams */
	public Fruit() {} ;

	/**
 	    @param name Name of the fruit (e.g. Apple, Orange)
	    @param weightGrams Weight of the fruit in grams (e.g. 100, 110)
	*/
	public Fruit(String name, int weightGrams) {
		this.name = name;
		this.weightGrams = weightGrams;
	}

	/**
 	   @return name (e.g. Apple, Orange)
	*/
	public String getName() {
		return "stub"; // stub
	}

	/**
 	   @return weightGrams (e.g. 100, 110)
	*/
	public int getWeightGrams() {
		return -42; // stub
	}

	/**
 	   @param name Name of the fruit (e.g. Apple, Orange)
	*/
	public void setName(String name) {
		this.name = "stub"; // stub
	}

	/**
 	   @param weightGrams Weight of the fruit in grams (e.g. 100, 110)
	*/
	public void setWeightGrams(int weightGrams) {
		this.weightGrams = -42; // stub
	}

	/**
 	   Convert to a string representation. Examples: "Apple, 100 grams", "Orange, 150 grams"
	   @return String representation of fruit;
	*/
	public String toString() {
		return "stub"; // stub
	}

	/**
 	   Are the fruits equal?
	   @param o another object to compare
	   @return true if this object is the same fruit as o
	*/
	public boolean equals(Object o) {
		return false; // stub
	}
}
