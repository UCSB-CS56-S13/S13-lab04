package edu.ucsb.cs56.S13.lab04.kreimer314;

/**
 * RadioChannel class for lab04
 *
 *@author Keenan Reimer
 *@version 0:lab04
 */

public class RadioChannel{

    private String name;
    private int freq;

    /**
     *Default constructor for RadioChannel. Sets instance variables to default values.
     */

    public RadioChannel(){
	this.name = "stub";
	this.freq = 42;
    }

    /**
     * Two argument constructor for RadioChannel.
     *@param name is the name of the RadioChannel
     *@param freq is the frequency that it operates at
     */

    public RadioChannel(String name, int freq){
	this.name = "stub";
	this.freq = 42;
    }

    /**
     * Getter for name private instance variable.
     *@return the value stored in name
     */

    public String getName(){
	return "stub";
    }

    /**
     * Getter for the frequency instance varaible
     *@return the string stored in freq
     */

    public int getFreq(){
	return 42;
    }

    /**
     * Setter for name variable
     *@param The new name of the channel
     */

    public void setName(String name){
	this.name = "stub";
    }
    
    /**
     * Setter for freq variable
     *@param The new frequency 
     */

    public void setFreq(int freq){
	this.freq =42;
    }

    /**
     * toString() method converts information into a meaningful String
     *@return formatted RadioChannel String
     */

    public String toString(){
	return "stub";
    }

    /**
     * equals() method for RadioChannel objects
     *@return true for equals false for not equals
     */

    public boolean equals(){
	return false;
    }

}
