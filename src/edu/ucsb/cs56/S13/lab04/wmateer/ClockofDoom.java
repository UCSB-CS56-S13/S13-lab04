package edu.ucsb.cs56.S13.lab04.wmateer;

/** ClockofDoom class
   @author Will Mateer
   @version CS56, S13, lab04
 */

public class ClockofDoom {
	
	private String event;
	private int SecondsRemaining;
	/**
		no arg constructor, sets event to null and SecondsRemaining to 0
	*/
	public ClockofDoom(){
		this.event = null;
		this.SecondsRemaining = 0;
	}
	/**
		two arg construtor
		@param event name of input event
		@param TimeRemaining time left in seconds until the given event
	*/
	public ClockofDoom(String event, int TimeRemaining){
		this.event = event;
		this.SecondsRemaining = TimeRemaining;
	}    
	/**	setter for event
		@param event name of input event
	*/
	public void setEvent(String event){
		this.event = event;
	}
	/**	setter for SecondsRemaining
		@param TimeRemaining input of seconds left until event
	*/
	public void setTimeRemaining(int TimeRemaining){
		this.SecondsRemaining = TimeRemaining;
	}
	/**	getter for event
		@return event name
	*/
	public String getEvent(){
		return this.event;
	}
	/**	getter for SecondsRemaining
		@return SecondsRemaining time in seconds until the event
	*/
	public int getTimeRemaining(){
		return this.SecondsRemaining;
	}
	/**	toString function that returns a formatted string of event and SecondsRemaining
		@return Formatted String of both private variables
	*/
	public String toString(){
		return ("The event is " + this.event +" with " + this.SecondsRemaining + " seconds remaining");
	}
	/**	equals function ot check equality between object instances.
		@param o ambiguous object for input to check the equality
		@return boolean of equality
	*/
	public boolean equals(Object o){
		if (o == null)
	    		return false;
		if (!(o instanceof ClockofDoom))
		    return false;

		ClockofDoom Test = (ClockofDoom) o;

		if ((Test.getEvent() == this.getEvent()) && (Test.getTimeRemaining() == this.getTimeRemaining())) {
			return true;
		}
		
		return false;
	}
	/**
		Example of a main of the class ClockofDoom
	*/
	public static void main (String [] args)
	{
		ClockofDoom Example = new ClockofDoom();
		Example.setEvent("Insanity");
		Example.setTimeRemaining(42);
		System.out.println(Example.toString());
	}
}


