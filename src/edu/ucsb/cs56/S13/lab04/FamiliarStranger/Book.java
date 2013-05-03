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
	this.title = "Look out! it's a stub!";
	this.numPages = -42;
    }

    /**
      Two-arg constructor for a Book object
      @param title Title of the book
      @param numPages Number of Pages
     */

    public Book(String title, int numPages) {
	this.title = "Oh no, a stub!";
	this.numPages = -42;
    }

    /**
      Get the book's title
      @return Title
     */

    public String getTitle() {return "Stub!";}

    /**
      Get the number of pages in the book
      @return Number of Pages
     */

    public int getNumPages() {return -42;}

    /**
      Set the title
      @param title The new title
     */

    public void setTitle(String title) {this.title = "Another stub!";}

    /** 
      Set the number of pages
      @param numPages New number of pages
     */

    public void setNumPages(int numPages) {this.numPages = -42;}

    /**
      Return information about a Book in the format:
      title (numPages pages)
      e.g. And Then There Were None (256 pages)
      @return Formatted book info: e.g. And Then There Were None (256 pages)
     */

    public String toString() {
	return "All hail the stubs";
	//return this.title + " (" + this.numPages + " pages)";
    }

    /**
      Check to see if two Book objects are identical
      They are considered identical if their title and page number are equal
      @param otherBook A second book to compare this one to
     */

    public boolean equals(Book otherBook) {
	//if(this.title != otherBook.getTitle())
	//  return false;
	//if(this.numPages != otherBook.getNumPages())
	//  return false;
	//return true;
	return false;   //stub
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
