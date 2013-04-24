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
    public SpaceObject(){}

    /**
       @param name name of the object (e.g. Earth, SpaceBacon)
       @param catalogNumber arbitrary catalog number assigned to object, should be distinct
    */
    public SpaceObject(String name, int catalogNumber){}

    /** @param name sets new String name for the object, (e,g, Earth etc) */
    public void setName(String name){}

    /** @return String containing name of the object (e.g. Earth etc) */
    public String getName(){
	return "stub"; //@@@TODO STUB
    }

    /** @param catalogNumber integer to assign as new catalog number for object, generally incrementing per object */
    public void setCatalogNumber(int catalogNumber){}

    /** @return integer that is catalog number of object, largely arbitrary */
    public double getCatalogNumber(){
	return -1; //@@@TODO STUB
    }

    public String toString(){
	return "stub";
    }

    public boolean equals(SpaceObject o){
	return false;
    }

    public static void main(String[] args){
	//do stuff here
    }
}
