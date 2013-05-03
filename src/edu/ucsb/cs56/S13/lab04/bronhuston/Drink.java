package edu.ucsb.cs56.S13.lab04.bronhuston;

public class Drink{

    private String drink_name;
    private String size;
    private int cost_in_dollars;

    public Drink()
    {
        //stub
        drink_name = "water";
        size = "medium";
        cost_in_dollars = 0;
    }

    public Drink(String drink_name, String size, int cost_in_dollars)
    {
        this.drink_name = drink_name;
        this.size = size;
        this.cost_in_dollars = cost_in_dollars;
    }

    public String getDrinkName()
    {
        return this.drink_name;
    }

    public String getSize()
    {
        return this.size;
    }

    public int getCost()
    {
        return this.cost_in_dollars;
    }

    public void setDrinkName(String drink_name)
    {
        this.drink_name = drink_name;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public void setCost(int cost_in_dollars)
    {
        this.cost_in_dollars = cost_in_dollars;
    }

    public String toString()
    {
        return this.size + " " + this.drink_name + ", $" + this.cost_in_dollars;
    }

    public boolean equals(Object o)
    {
	    if (! (o instanceof Drink) )
	        return false;
	    Drink other = (Drink) o;
	    return (other.getDrinkName().equals(this.getDrinkName()) &
	            other.getSize().equals(this.getSize()) &
                other.getCost()==this.getCost()); 
        
    }  

    public static void main(String [] args) {

        //stub!
    }















}
