package edu.ucsb.cs56.S13.lab04.dvicory;

/**
   Processor represents a CPU. Two key identifiers for a CPU are its family name and the core speed.

   @author Daniel Vicory
   @version CS56, S13, lab04
*/

public class Processor {
    /**
       Stores the common family name of the processor
     */
    private String family;

    /**
       Stores the core speed of the processor, in MHz
     */
    private int coreSpeed;

    /**
       No-arg constructor for Processor, creates a generic processor with family name "Generic x86" and a core speed of 16 MHz
     */
    public Processor() {
	// TODO stub
	this.family = "stub";
	this.coreSpeed = -42;
    }

    /**
       Two-arg constructor for Processor, initializing it with the family name and core speed given

       @param family the common family name of the processor
       @param coreSpeed the core speed of the processor, in MHz
    */
    public Processor(String family, int coreSpeed) {
	// TODO stub
	this.family = "stub";
	this.coreSpeed = -42;
    }

    /**
       @return the common family name of the processor
    */
    public String getFamily() { return "stub"; } // TODO stub

    /**
       Sets the common family name of the processor

       @param family the common family name to be set
    */
    public void setFamily(String family) { } // TODO stub

    /**
       @return the core speed of the processor, in MHz
    */
    public int getCoreSpeed() { return -42; } // TODO stub

    /**
       Sets the core speed of the processor

       @param coreSpeed the core speed to be set
    */
    public void setCoreSpeed(int coreSpeed) { } // TODO stub

    /**
       Convert processor to a string representation. Examples: "[Ivy Bridge, 3100 MHz]"

       @return String representation of processor
    */
    public String toString() { return "stub"; } // TODO stub

    /**
       Are the processors equal?

       @param o another object to compare
       @return true if this object is the same processor as o
    */
    public boolean equals(Object o) { return false; } // TODO stub

    /**
       A sample main that uses the class
    */
    public static void main(String[] args) {
	// TODO stub
    }
}
