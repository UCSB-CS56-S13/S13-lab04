package edu.ucsb.cs56.S13.lab04.maperghis;

/**
 * Purchased represents an obeject/item purchased and the number
 * of the objects/items that were purchased.
 * For example if 4 books were bought then the name of the item
 * purchased is "Book" and the number of the items purchased is 4.
 * @author Miranda Aperghis
 * @version 25/04/2013 for lab04, cs56, s13
 */
public class Purchased{
	private String objectPurchased;
	private int numberPurchased;

	/**
 	*noarg default Constructor for objects of class Purchased
 	*/
	public Purchased(){
		this.objectPurchased = "";
		this.numberPurchased = 0;
	}

	/**
 	*Two-arg Constructor for object of class Purchased
	*@param objectPurchased object that was bought (e.g. Chair, Computer)
	*@param numberPurchased how many objects were bought (e.g. 3, 87)
	*/ 	
	public Purchased(String objectPurchased, int numberPurchased){
		this.objectPurchased = objectPurchased;
		this.numberPurchased = numberPurchased;
	}

	/**
 	*get the name of the object purchased
	*
	* @return object purchased
 	*/ 
	public String getObjectPurchased(){
		return this.objectPurchased;
	}	

	/**
 	*get the number of objects purchased
 	*
 	* @return number purchased
 	*/  
	public int getNumberPurchased(){
		return this.numberPurchased;
	}

	/**
 	*set the name of the object purchased
 	*
 	* @param object purchased (e.g. "Book")	
 	*/  
	public void setObjectPurchased(String objectPurchased){
		this.objectPurchased = objectPurchased;
	}

	/**
 	*set the number of object purchased
 	*
 	* @param number purchased (e.g. 3)
 	*/  
	public void setNumberPurchased(int numberPurchased){
		this.numberPurchased = numberPurchased;
	}

	/**
 	*format Purchased object as a string, in an expression like:
	*Book: 5 purchased, Chair: 2 purchased
 	*
 	* @return formatted Purchased object (e.g. Book: 5 purchased)
 	*/  
	public String toString(){
		return this.objectPurchased + ": " + this.numberPurchased + " purchased";
	}

	/**
 	*determine if two objects purchased are equal
 	*(same name and same number purchased)
	*
 	* @param o arbitary object to check for equality 
 	* @return true if objects are equal, otherwise false
 	*/  
	public boolean equals(Object o){
		if (o==null) return false;
		if (! (o instanceof Purchased) ) return false;
		Purchased p = (Purchased) o;
		if (p.getNumberPurchased()!=this.numberPurchased) return false;
		if (!(p.getObjectPurchased().equals(this.objectPurchased))) return false;

		return true;
	}

	/**
 	*Main for testing constructing Purchased objects and
	*for testing the toString() method
 	*/  	
	public static void main(String[] args){
		Purchased p = new Purchased();
		p.setObjectPurchased("Chair");
		p.setNumberPurchased(4);
		System.out.println(p.toString());
	}

}//End of Purchased class
