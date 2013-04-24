package edu.ucsb.cs56.S13.lab04.jacob_a;

public class Animal {

    private String species; 
    private int numberOfLegs; 

    /** Default Constructor initializes to bad values */

    public Animal() {
	species="";
	numberOfLegs=-1;
    } 

    /** 
	@param species formal species name, e.g Canis Lupis for dog
	@param numberOfLegs number of legs, e.g 4 for dog
     */
    public Animal(String species, int numberOfLegs) { 
	this.species=species;
	this.numberOfLegs=numberOfLegs;
    }

    /**
       @return species e.g. Canis Lupis for a dog  
    */
    public String getSpecies() { 
	return species; 
    }

    /**
       @return numberOfLegs e.g. 4 for a dog
     */
    public int getNumberOfLegs() { 
	return numberOfLegs; 
    }

    /**
       @param species Species to set to e.g. Canis Lupis
     */
    public void setSpecies(String species){
	this.species=species;
    }

    /**
       @param numberOfLegs Number of legs to set to e.g. 4
     */
    public void setNumberOfLegs(int numberOfLegs){
	this.numberOfLegs=numberOfLegs;
    }

    /**
       Convert to a string representation.  Example: "Species: Canis Lupis, NumberOfLegs: 4"
       @return String representation of Animal.
     */
    public String toString() {
	return "Species: " + species + ", NumberOfLegs: " + numberOfLegs;
    }

    /** 
	A sample main that uses the class.
     */
    public static void main(String [] args) { 
	Animal dog = new Animal("Canis Lupis", 4);
	System.out.println(dog);
    }

    /**
       Are the animals equal?
       @param o another object to compare 
       @return true if this object is the animal as o
     */
    public boolean equals(Object o) { 
	if (!(o instanceof Animal))
	    return false;
	Animal other = (Animal) o;
	return species.equals(other.getSpecies()) && numberOfLegs==other.getNumberOfLegs(); 
    }

}
