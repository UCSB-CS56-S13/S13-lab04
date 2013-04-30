/** 4/24/13
   @author Fanny Kuang
*/

package edu.ucsb.cs56.S13.lab04.Yokura;

public class Spaceship {

    private String destination;
    private int numPeople;
    
    /** 
     * No Argument constructor for Spaceship Class
     */
    public Spaceship() {
        this.destination = "";
        this.numPeople = 0;
    }

    /**
     * Two argument constructor for Spaceship Class
     */
    public Spaceship(String destination, int numPeople) {
        this.numPeople = numPeople;
        this.destination = destination;
    }

    /** 
     * Get spaceship destination
     */
    public String getDestination() {
        return this.destination;
    }

    /** 
     * Get Number of spaceship people
     */
    public int getNumPeople() {
        return this.numPeople;
    }

    /**
     * Set new destination
     * @param newDestination new spaceship destination
     */
    public void setDestination(String newDestination) {
        this.destination = newDestination;
    }

    /**
     * Set new number of people in spaceship
     * @param newNum New number of people in spaceship
     */
    public void setNumPeople(int newNum) {
        this.numPeople = newNum;
    }

    /**
     * tostring returns a format that is the following
     * Destination: Mars
     * People: 3
     */
    public String toString() {
        return "Destination: " + this.destination + "\nPeople: " + this.numPeople;
    }

    /**
     * Test against another spaceship class to see if they are equal
     * equal if both numPeople and Destination are equal
     * @param someSpaceship  Spaceship object to compare to
     */
    public boolean equals(Spaceship someSpaceship) {
        if (this.numPeople != someSpaceship.getNumPeople())
            return false;
        if (this.destination != someSpaceship.getDestination())
            return false;
        return true;
    }

    /**
     * Main method. Testing general outputs.
     * simple testing for constructors and tostring
     */
    public static void main (String[] args) {
        Spaceship galactia = new Spaceship();
        Spaceship martial = new Spaceship("Mars",3);
        System.out.println(galactia);
        System.out.println(martial);
    }

}
