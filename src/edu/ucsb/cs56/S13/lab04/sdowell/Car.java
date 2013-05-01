package edu.ucsb.cs56.S13.lab04.sdowell;

class Car{

    String name;
    int year;

    public Car(){
	name = "Dodge Challenger";
	year = 2010;
    }
    public Car(String name, int year){
	this.name = name;
	this.year = year;
    }
    public String getName(){
	return "stub";
	//return name;
    }
    public int getYear(){
	return -1;
	//return year;
    }
    public void setName(String name){
	this.name = name;
    }
    public void setYear(int year){
	this.year = year;
    }
    public String toString(){
	return "stub";
	//return this.year + " " + this.name;
    }
    public boolean equals(Object o){
	return false;
	/*
	Car c = (Car) o;
	if(c.getName().equals(this.name) && c.getYear()==this.year)
	    return true;
	return false;
	*/
    }
    public static void main(String args[]){
	Car c = new Car("Honda CRV", 2004);
	System.out.println(c.toString());
	
    }
}
