package edu.ucsb.cs56.S13.lab04.EricHuang2;

/**
 * City represent a city with its name and population
 * @author Eric huang
 * @version CS56, S13, lab04
 * @see CityTest

*/
public class City {
	
	private String name = "";
	private int population = 0;
	
	/**
	 * default constructor, setting
	 * the name of the city to 
	 * Santa Barbara, and population to 89045
	 */
	public City()
	{
		//this.name = "stub";
		//this.population = 0;
		this.name = "Santa Barbara";
		this.population = 89045;
	}
	
	/** 
	@param name is the name of the city
	@param population is the population of the city
     */
	public City(String name, int population)
	{
		//this.name = "stub";
		//this.population = 0;
		this.name = name;
		this.population = population;
	}
	
	/**
       @return name of the city     
    */
	public String getName()
	{
		//return "stub";
		return this.name;
	}
	
	/**
       @return population of the city
    */
	public int getPopulation()
	{
		//return 0;
		return this.population;
	}
	
	/**
       Convert to a string representation. 
       @return String represntation of the name of the city and the population of the city
     */
	public String toString()
	{
		//return "stub";
		String result = "City name: " + this.name + ". Population: " + this.population;
		return result;
	}
	
	/**
       @param o another object to compare with
       @return true if this object is the same city as o
     */
	public boolean equals(Object o)
	{
		/* if the city is missing more than 3 people you might have a 
		 * problem...
		 */
		//return false;
		int tolerance = 3;
		if (! (o instanceof City) )
			return false;
		City otherCity = (City) o;
		
		return (otherCity.getName().equals(this.getName()) &
		Math.abs(otherCity.getPopulation() - this.getPopulation()) < tolerance );
	}
	
	/** 
	A sample main that uses the class.
     */
	public static void main(String [] args) 
	{ 
		City santaBarbara = new City();
		City gothem = new City("Gothem", 30000000);
		System.out.println(santaBarbara);
		System.out.println(gothem);
    }
}

