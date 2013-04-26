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
	this.name = null;
	this.freq = 0;
    }

    /**
     * Two argument constructor for RadioChannel.
     *@param name is the name of the RadioChannel
     *@param freq is the frequency that it operates at
     */

    public RadioChannel(String name, int freq){
	this.name = name;
	this.freq = freq;
    }

    /**
     * Getter for name private instance variable.
     *@return the value stored in name
     */

    public String getName(){
	return this.name;
    }

    /**
     * Getter for the frequency instance varaible
     *@return the string stored in freq
     */

    public int getFreq(){
	return this.freq;
    }

    /**
     * Setter for name variable
     *@param The new name of the channel
     */

    public void setName(String name){
	this.name = name;
    }
    
    /**
     * Setter for freq variable
     *@param The new frequency 
     */

    public void setFreq(int freq){
	this.freq = freq;
    }

    /**
     * toString() method converts information into a meaningful String
     *@return formatted RadioChannel String
     */

    public String toString(){
	return String.format(name + " at frequency " + freq + "Hz" );
    }

    /**
     * equals() method for RadioChannel objects
     *@return true for equals false for not equals
     */

    public boolean equals(Object o){
	
	if(o==null) return false;
	if( ! ( o instanceof RadioChannel )) return false;
	
	RadioChannel rc = (RadioChannel) o;
	
	if(this.name == rc.name && this.freq == rc.freq) return true;
	else return false;
	
    }

/**
*Main method for RadioChannel class
*/

	public static void main(String[] args){
		RadioChannel rc = new RadioChannel("UCSBTalks", 3500);
		System.out.println("Two arg constructor: " + rc);
		RadioChannel rc2 = new RadioChannel();
		System.out.println("No arg constructor: " + rc2);
	}
	
}
