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

    public SpaceObject(){}

    public SpaceObject(String name, int catalogNumber){}

    public void setName(String name){}

    public String getName(){
	return "stub"; //@@@TODO STUB
    }

    public void setCatalogNumber(){}

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
