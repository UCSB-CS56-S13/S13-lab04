package edu.ucsb.cs56.S13.lab04.evanwest;

/**
An instance of this class represents an object in space. To find some use for integers in this context, we make an arbitrary number.

The two values stored by this (incomplete and largely useless) object are an String giving an arbitrary name, and an integer, giving an arbitrary catalog number. So basically, everything is arbitrary!
 */

/**
@author Evan West
@version CS56, S13, lab04
 */

public class SpaceObject{
    private String name;
    private int catalogNumber;

    /** Default constructor creates a SpaceObject "Earth" with catalog number 1 */
    public SpaceObject(){
	this.name="Earth";
	this.catalogNumber=1;
    }

    /**
       @param name name of the object (e.g. Earth, SpaceBacon)
       @param catalogNumber arbitrary catalog number assigned to object, should be distinct
    */
    public SpaceObject(String name, int catalogNumber){
	this.name=name;
	this.catalogNumber=catalogNumber;
    }

    /** @param name sets new String name for the object, (e,g, Earth etc) */
    public void setName(String name){
	this.name=name;
    }

    /** @return String containing name of the object (e.g. Earth etc) */
    public String getName(){
	return this.name;
    }

    /** @param catalogNumber integer to assign as new catalog number for object, generally incrementing per object */
    public void setCatalogNumber(int catalogNumber){
	this.catalogNumber=catalogNumber;
    }

    /** @return integer that is catalog number of object, largely arbitrary */
    public int getCatalogNumber(){
	return this.catalogNumber;
    }

    /** Prints object to String with name and catalog number
	@return String with format "CatalogNumber - Name"
    */
    public String toString(){
	return this.catalogNumber+"-"+this.name;
    }

    /**Are two objects the same?
       @return Whether two objects have the same name and catalog number
     */
    public boolean equals(SpaceObject o){
	return o.getName().equals(this.name) && o.getCatalogNumber()==this.catalogNumber;
    }

    /**
       A sample main that uses this object.
    */
    public static void main(String[] args){
	SpaceObject o = new SpaceObject();
	SpaceObject n = new SpaceObject("Luna", 2);

	System.out.println("Object 1: "+o);
	System.out.println("Object 2: "+n);
    }
}
