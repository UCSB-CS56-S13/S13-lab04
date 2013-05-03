package edu.ucsb.cs56.S13.lab04.Daized;

/** Movie class which represents a film with its title and year of release

 */


public class Movie{

    private String title; // name of movie
    private int yearOfRelease; //year that movie was released

    public Movie(){
	title = "stub";
	yearOfRelease = -1;
    }

    public Movie(String a, int b){
	title = "stub";
	yearOfRelease = -1;
    }

    public String getTitle(){
	return "stub";
    }

    public int getYearOfRelease(){
	return -1;
    }

    public void setTitle(String title){
	this.title = "stub";
    }

    public void setYearOfRelease(int yearOfRelease){
	this.yearOfRelease = -1;
    }

    public String toString(){
	return "stub";
    }

    public boolean equals(Object o){

	return false;
    }

    public static void main(String [] args){

	Movie ragingBull = new Movie("Raging Bull", 1980);

	String c = ragingBull.toString();
	System.out.println(c);

    }






}
