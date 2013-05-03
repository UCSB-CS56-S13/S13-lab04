package edu.ucsb.cs56.S13.lab04.wmateer;
/*
/** ClockofDoom class
   @author Will Mateer
   @version CS56, S13, lab04
 */
/*
public class ClockofDoom {
	
	private String event;
	private int SecondsRemaining;
	
	public ClockofDoom(){
		this.event = "stub";
		this.SecondsRemaining = -42;
	}

	public ClockofDoom(String event, int TimeRemaining){
		this.event = "stub";
		this.SecondsRemaining = -42;
	}    

	public void setEvent(String event){
		this.event="stub";
	}

	public void setTimeRemaining(int TimeRemaining){
		this.SecondsRemaining = 42;
	}
	
	public String getEvent(){
		return "stub";
	}

	public int getTimeRemaining(){
		return -42;
	}

	public String toString(){
		return "stub";
	}

	public boolean equals(Object o){
		return false;
	}
	
	public static void main (String [] args)
	{
		ClockofDoom Example = new ClockofDoom();
		Example.setEvent("Insanity");
		Example.setTimeRemaining(42);
		Example.toString();
	}

}*/
/** ClockOfDoom represents time to some bad thing
 @author Phill Conrad
 @author Will M.
 @version 2013/04/09 for CS56 lecture
 */

public class ClockOfDoom {
	
    public ClockofDoom(){
		this.event = "stub";
		this.SecondsRemaining = -42;
	}
	/** Constructor 
	 @param event Something that will happen
	 @param secondsRemaming how long til it happens
	 */
	
	
    public ClockOfDoom(String event, int secondsRemaining)
    {
		// assign attributes from parameters
		// STUB.. do nothing!
    }
	
    /**
	 Get department Abbreviation (e.g. CMPSC, MATH, PSTAT)
     */
    
    public String getEvent () { return "Stub, you sucka!"; } 
	
    /**
	 Get course number (e.g. "56", "3A", "120A")
     */
    public int getSecondsRemaining () {
		return -1; 
    } // @@@ STUB fixme!!!
    
	
} // class ClockOfDoom



