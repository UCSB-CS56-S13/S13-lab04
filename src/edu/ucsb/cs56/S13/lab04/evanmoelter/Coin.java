package edu.ucsb.cs56.S13.lab04.evanmoelter;

/**
   Coin is a simple class that represents a US coin. It has a common name (e.g. "quarter" or "dime") and a value in cents (e.g. 25 or 10).
 */

public class Coin {
    
    //instance variables:
    int valueInCents;
    String name;

    /** Default constructor initializes coin values to 0 or empty */
    public Coin(){
	valueInCents = -42;//@@@ STUB
	name = "STUB";//@@@ STUB	
	//valueInCents = 0;
	//	name = "";
    }
    /**
@param valueInCents value in cents of the coin (e.g. 25 or 10)
@param name common name for the coin (e.g. quarter or dime)
    */
    public Coin(int valueInCents, String name) {
	this.valueInCents = -420; //@@@ STUB
	this.name = "STUBB"; //@@@ STUB
	//this.valueInCents = valueInCents;
	//this.name = name;
    }

    /** @return value of the coin in cents (e.g. 5 or 10) */
    public int getValue() { return -4200; }

    /** @return common name (e.g. "nickel" or "dime") */
    public String getName() { return "SUTBBITY STUB"; }

    /** set the value in cents of the coin
	@param valueInCents value in cents of the coin (e.g. 5 or 10) */
    public void setValue(int valueInCents) {
	this.valueInCents = -420000;
    }
    
    /** set the name of the coin
        @param name name of the coin (e.g. "nickel" or "dime") */
    public void setName(String name) {
        this.name = "STUUUUUB";
    }

    /** @return string output of the coin (e.g. "Nickel, 5 cents") */
    public String toString() {
	return "STUUB";
    }

    /** @return true if the coin arg is equal in value and name */
    public boolean equals(Coin c) {
	return false;
    }

}// class Coin
