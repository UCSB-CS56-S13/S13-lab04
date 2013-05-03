package edu.ucsb.cs56.S13.lab04.ProtossJane;


/** class for Shoes from W01

@author Wenjie Huang
@version CS56, S13, lab04, 05/03/2013

*/

public class Shoes  {
	private String Color = "Yellow";
	private int Size = 35;

	/** Default Constructor creates a Shoes with Yellow color and size 35*/
	
	public Shoes ()	{ };

	/** 
	@param Color of shoes (e.g. Black, Red)
	@param Size of shoes (e.g. 35, 40)
     */
     
	public Shoes (String Color, int Size) 
	{
		this.Color = Color;
		this.Size = Size;
	}
	
	 /**
       @return Shoes color  (e.g. Black, Red)       
    */

	public String getColor ()
	{
		return Color; 
	}

	/**
       @return Shoes size  (e.g. 35, 40)       
    */
	
	public int getSize ()
	{
		return Size;
	}
	
	/** 
		@param Color of shoes (e.g. Black, Red)
     */

	public void setColor (String Color)
	{
		this.Color = Color;
	}

	/** 
		@param Size of shoes (e.g. 35, 40)
     */
     
	public void setSize (int Size)
	{
		this.Size = Size;
	}
	
	/**
	   Convert to a string representation.  Examples: "Color: Green Size: 40"
       @return String represntation of Shoes.    
    */

	public String toString ()
	{
		return "Color: "+this.Color+" Size: "+this.Size;
	}
	
	/**
       Are the shoes equal?
       @param o another object to compare 
       @return true if this object is the same shoes as o
     */

	public boolean equals (Object o)
	{
		if(! (o instanceof Shoes) )
			return false;
		Shoes other = (Shoes) o;
		return (other.getColor().equals(this.getColor())&&other.getSize()==this.getSize());
	}

	/** 
		A sample main that uses the class.
    */
   
	public static void main (String [] args)
	{
		Shoes myShoes =  new Shoes("Black",37);
		System.out.println(myShoes);

	}

}
