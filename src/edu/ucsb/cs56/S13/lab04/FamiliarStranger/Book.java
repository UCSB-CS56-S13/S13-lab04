package edu.ucsb.cs56.S13.lab04.FamiliarStranger;

/** 
  A book with a title and number of pages
 
  @author Dario Castellanos
  @version 2013/5/3 for Lab04, CS56, S13
 */

public class Book {
    private String title;
    private int numPages;

    /**
      No-arg constructor for a Book object
     */

    public Book() {
	this.title = "no title";
	this.numPages = 0;
    }

    /**
      Two-arg constructor for a Book object
      @param title Title of the book
      @param numPages Number of Pages
     */

    public Book(String title, int numPages) {
	this.title = title;
	this.numPages = numPages;
    }

    /**
      Get the book's title
      @return Title
     */

    public String getTitle() {return this.title;}

    /**
      Get the number of pages in the book
      @return Number of Pages
     */

    public int getNumPages() {return this.numPages;}

    /**
      Set the title
      @param title The new title
     */

    public void setTitle(String title) {this.title = title;}

    /** 
      Set the number of pages
      @param numPages New number of pages
     */

    public void setNumPages(int numPages) {this.numPages = numPages;}

    /**
      Return information about a Book in the format:
      title (numPages pages)
      e.g. And Then There Were None (256 pages)
      @return Formatted book info: e.g. And Then There Were None (256 pages)
     */

    public String toString() {
	return this.title + " (" + this.numPages + " pages)";
    }

    /**
      Check to see if two Book objects are identical
      They are considered identical if their title and page number are equal
      @param otherBook A second book to compare this one to
     */

    public boolean equals(Book otherBook) {
	if(this.title != otherBook.getTitle())
	    return false;
	if(this.numPages != otherBook.getNumPages())
	    return false;
	return true;
    }

    /**
      A sample main that uses the class
     */

    public static void main(String[] args) {
	Book ATTWN = new Book("And Then There Were None", 256);
	Book blank = new Book();
	System.out.println(ATTWN);
    }
}
