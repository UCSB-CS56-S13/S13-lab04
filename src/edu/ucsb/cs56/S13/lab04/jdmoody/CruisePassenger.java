package edu.ucsb.cs56.S13.lab04.jdmoody;

/**

 CruisePassenger represents a CruisePassenger. 
 A cruise passenger has both a name and a corresponding room number.
 
*/

public class CruisePassenger {

	private String passenger = "No Passenger Name Set";
	private int roomNum = 0;

	/*** Default Constructor creates a Cruise Passenger with No Passenger Name Set and Room Number 0 .*/
	
    public CruisePassenger() {
		//passenger = "No Passenger Name Set";
		//roomNum = 0;
		return;
    }

	/** 
	@param passenger passenger name, (e.g. Homer Simpson, Sir Topham Hatt, John Smith)
	@param roomNum room number, (e.g. 100, 25, 300, 60, 42)
     */
	
    public CruisePassenger(String passenger, int roomNum) {
		//this.passenger = passenger;
		//this.roomNum = roomNum;
		return;
    }

	/**
	@param passenger passenger name,  (e.g. Homer Simpson, Sir Topham Hatt, John Smith)
	*/
	
    public void setPassenger(String passenger) {
		//this.passenger = passenger;
		return;
    }

	/**
	 @return passenger name, (e.g. Homer Simpson, Sir Topham Hatt, John Smith)
	*/
	
    public String getPassenger() {
		//return passenger;
		return "stub";
    }
	
	/**
	@param roomNum room number, (e.g. 100, 25, 300, 60, 42)
	*/
	
	public void setRoomNum(int roomNum) {
		//this.roomNum = roomNum;
		return;
	}
	
	/**
	 @return  room number, (e.g. 100, 25, 300, 60, 42)
	*/
	
	public int getRoomNum() {
		//return roomNum;
		return -42;
	}
	
	/**
     Convert to a string representation.  Examples: "Passenger Name: Homer Simpson, Room Number: 300", "Passenger Name: Sir Topham Hatt, Room Number: 42"
     @return String represntation of passenger.
     */
	
	public String toString() {
		//System.out.println("Passenger Name: " + passenger + ", Room Number: " + String.format("%d", roomNum));
		return "This is a stub!";
	}
	
	/**
       Are the passengers equal?
       @param o another object to compare 
       @return true if this object is the same cruise passenger as o
     */
	
	public boolean equals(Object o) { 
		return false;
		/*
		if (! (o instanceof CruisePassenger) )
			return false;
		CruisePassenger other = (CruisePassenger) o;
		return (other.getPassenger().equals(this.getPassenger()) & other.getRoomNum() == this.getRoomNum() ); 
		*/
    }
	
	/** 
	A sample main that uses the class.
     */
	public static void main(String [] args) {
		
		CruisePassenger Hatt = new CruisePassenger("Sir Topham Hatt", 42);
		CruisePassenger Default = new CruisePassenger();
		System.out.println(Hatt);
	}
}
