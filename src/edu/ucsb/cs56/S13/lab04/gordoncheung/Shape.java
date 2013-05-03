
package edu.ucsb.cs56.S13.lab04.gordoncheung;

	
public class Shape{
    public String name;
    public int sides;
    
    public Shape(){

    }
    public Shape(String name, int sides){
	this.name="name";
	this.sides=4;
    }

    public void setName(String name){
	this.name="namestub";
    }
    public void setSides(int sides){
	this.sides=6;
    }
    public String getName(){
	return "stub";
    }
    public int getSides(){
	return 5;
    }

    public String toString(){
	Shape s = new Shape("name", 5);
	return "toStringStub";
	//return "Name= " + name + ", Sides= " + sides;
    }
    public boolean equals(Shape s){
	return true;
    }


    public static void main(String args[]){
    }




}
