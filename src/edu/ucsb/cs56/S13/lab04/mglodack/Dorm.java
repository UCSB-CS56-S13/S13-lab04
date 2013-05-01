package edu.ucsb.cs56.S13.lab04.mglodack;
import java.text.Format;
/** Class for Dorm
    @author Mathew Glodack
    @version 04/25/13 lab04, cs56, s13
*/

public class Dorm{
    String name; 	//indicates name of the Dorm
    int currentNum; 	//indicates current number of students living in the dorm

    public Dorm(){
	this.name = ""; 
	this.currentNum = 0; 
    }
    public Dorm(String name, int currentNum){
	this.name = name;
	this.currentNum = currentNum; 
    }
    public void setName(String name){
	this.name = name; 
    }
    public String getName(){
	return this.name; 
    }

    public void setCurrentNum(int currentNum){
	this.currentNum = currentNum;
    }
    public int getCurrentNum(){
	return this.currentNum; 
    }
    public String toString(){
	String s = String.format("%d",this.currentNum);
	return "Dorm: " + this.name + ", currentNum: " + s;
    }
    public boolean equals(Object o){
	if (! (o instanceof Dorm))
	return false;
	Dorm d = (Dorm) o;
	if(this.name.equals(d.name) && this.currentNum == d.currentNum)
	return true;
    return false;
	
	
    }
public static void main(String [] args){
    Dorm ft = new Dorm("Santa Catalina",450);
    ft.toString();
}

}

