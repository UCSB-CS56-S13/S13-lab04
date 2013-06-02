package edu.ucsb.cs56.S13.lab04.mglodack;
import java.text.Format;
/** Class for Dorm
    @author Mathew Glodack
    @version 04/25/13 lab04, cs56, s13
*/

public class Dorm{
    String name; 	//indicates name of the Dorm
    int currentNum; 	//indicates current number of students living in the dorm
    /**
       Default Constructor
     */
    public Dorm(){
	this.name = ""; 
	this.currentNum = 0; 
    }

    /**Constructor with parameters
       @param String name for name of Dorm
       @param int currentNum for number of students
     */
    public Dorm(String name, int currentNum){
	this.name = name;
	this.currentNum = currentNum; 
    }

    /**Setter for Name
       @param String name sets the name
     */
    public void setName(String name){
	this.name = name; 
    }

    /**Getter for Name
       @return returns name
     */
    public String getName(){
	return this.name; 
    }

    /**Setter for currentNum
       @param int currentNum
     */
    public void setCurrentNum(int currentNum){
	this.currentNum = currentNum;
    }

    /**Getter for currentNum
       @return returns currentNum
     */
    public int getCurrentNum(){
	return this.currentNum; 
    }

    /**toString method

       @return returns a better string method
    */
    public String toString(){
	String s = String.format("%d",this.currentNum);
	return "Dorm: " + this.name + ", currentNum: " + s;
    }
    /**Equals method
       @return true if objects are equal
    */
    public boolean equals(Object o){
	if (! (o instanceof Dorm))
	    return false;
	Dorm d = (Dorm) o;
	if(this.name.equals(d.name) && this.currentNum == d.currentNum)
	    return true;
	return false;
    }	
    /**
       Main to test Dorm class toString()
    */
    public static void main(String [] args){
	Dorm ft = new Dorm("Santa Catalina",450);
	ft.toString();
    }
   
}

