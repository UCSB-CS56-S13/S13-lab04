package edu.ucsb.cs56.S13.lab04.cbarbello;

/**

PowerUsage contains the name of a household appliance and 
the number of watts required to operate the appliance. This
class was created for lab04 in the Spring 2013 course for CS56.

*/

public class PowerUsage{
    
    private String applianceName = "stub"; //"Refrigerator";
    private int watts = -42; //725;

    /** Default Constructor creates Refrigerator, 725 */

    public PowerUsage(){};

    /**
       @param applianceName appliance name (e.g. Refrigerator, Toaster, Fan)
       @param watts (e.g. 725, 800, 55)
    */

    public PowerUsage(String applianceName, int watts){
	this.applianceName = "stub"; // applianceName;
	this.watts = -42; //watts;
    }

    /**
       @return appliance name (e.g. Refrigerator, Toaster, Fan)
    */
    public String getApplianceName(){
	return "stub"; //applianceName;
    }

    /**
       @return watts (e.g. 725, 800, 55)
    */
    public int getWatts(){
	return -42; //watts;
    }

    /**
       Convert to a string representation.  Example: "Appliance Name and Wattage: Toaster 800"
       @return String represntation of PowerUsage
    */
    public String toString(){
	return "stub";//"Appliance Name and Wattage: " + this.applianceName + " " + this.watts;	   
    }

    /**
       A sample main that uses the clas.
    */
    public static void main(String [] args){
	PowerUsage refrigerator = new PowerUsage("Refrigerator",725);
	PowerUsage toaster = new PowerUsage("Toaster",800);
	System.out.println(refrigerator);
    }

    /**
       Are the objects equal?
       @param o another PowerUsage to compare
       @return true if this object is the same PowerUsage as o
    */
    public boolean equals(Object o){
	if(!(o instanceof PowerUsage))
	    return false;
	PowerUsage other = (PowerUsage) o;
	return  (!other.getApplianceName().equals(this.getApplianceName())&
		other.getWatts() != this.getWatts());
    }
} // class PowerUsage
