package edu.ucsb.cs56.S13.lab04.bronhuston;

/**
    A Class that represents a drink.
    
    
    @author Bronwyn Perry-Huston
    @version CS56 S13 for lab04, 5-01-13 
*/

public class Drink{

    private String drink_name;
    private String size;
    private int cost_in_dollars;



    /**
       no-arg constructor of class Drink
     */
    public Drink()
    {
        drink_name = "water";
        size = "medium";
        cost_in_dollars = 0;
    }

    /**
     * Three-arg Constructor for objects of class Drink
     * @param drink_name The name of the Drink ex. "Latte", "Mocha"
     * @param size The size of the Drink ex. "small", "medium"
     * @param cost_in_dollars The cost of the Drink in US dollars ex. $2
     */
    public Drink(String drink_name, String size, int cost_in_dollars)
    {
        this.drink_name = drink_name;
        this.size = size;
        this.cost_in_dollars = cost_in_dollars;
    }


    /**
     * get the name of the drink
     * 
     * @return the name of the drink
     */
    public String getDrinkName()
    {
        return this.drink_name;
    }

    /**
     * get the size of the drink
     * 
     * @return the size of the drink
     */
    public String getSize()
    {
        return this.size;
    }

    /**
     * get the cost of the drink
     * 
     * @return the cost of the drink
     */
    public int getCost()
    {
        return this.cost_in_dollars;
    }

    /**
     * set the name of the drink
     * 
     * @param drink_name the new name of the drink
     */
    public void setDrinkName(String drink_name)
    {
        this.drink_name = drink_name;
    }

    /**
     * set the size of the drink
     * 
     * @param size the new size of the drink
     */
    public void setSize(String size)
    {
        this.size = size;
    }

    /**
     * set the cost of the drink
     * 
     * @param cost_in_dollars the new cost of the drink in US dollars
     */
    public void setCost(int cost_in_dollars)
    {
        this.cost_in_dollars = cost_in_dollars;
    }

    /** format Drink as String, in an expression like:
     *  Medium Latte, $2
     *  
     *  @return formatted Drink
     */
    public String toString()
    {
        return this.size + " " + this.drink_name + ", $" + this.cost_in_dollars;
    }

    /**
       Check if the Drinks are equal
       @param o another object to compare 
       @return true if this object is the same Drink as o
     */
    public boolean equals(Object o)
    {
	    if (! (o instanceof Drink) )
	        return false;
	    Drink other = (Drink) o;
	    return (other.getDrinkName().equals(this.getDrinkName()) &
	            other.getSize().equals(this.getSize()) &
                other.getCost()==this.getCost()); 
    }  

    /** 
	A sample main that uses the class.
     */
    public static void main(String [] args) {
        Drink coffee = new Drink("Mocha", "Medium", 3);
        System.out.println(coffee);
    }

}
