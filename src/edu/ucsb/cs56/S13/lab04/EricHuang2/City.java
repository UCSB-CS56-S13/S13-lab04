package edu.ucsb.cs56.S13.lab04.EricHuang2;

/**
 * City represent a city with its name and population
 * @author Eric huang
 * @version CS56, S13, lab04
 * @see CityTest

*/
public class City {
	
	/* create two private variable */
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
		
		// set the name to default "Santa Barbara"
		this.name = "Santa Barbara";
		// set the population to the default 89045
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
		
		// set the name
		this.name = name;
		// set the population
		this.population = population;
	}
	
	/**
       @return name of the city     
    */
	public String getName()
	{
		//return "stub";
		return this.name; // return private variable "name"
	}
	
	/**
       @return population of the city
    */
	public int getPopulation()
	{
		//return 0;
		return this.population; // return private variable "population"
	}
	
	/**
	 *  @param name is the name of the city
	 */
	public void setName(String name)
	{
		this.name = name; // set private varialbe "name" to the parameter
	}
	
	/**
	 *  @param population is the population of the city
	 */
	public void setPopulation(int population)
	{
		this.population = population; // set the private varialbe "population" the parameter
	}
	
	/**
       Convert to a string representation. 
       @return String represntation of the name of the city and the population of the city
     */
	public String toString()
	{
		//return "stub";
		
		// modify the string to fit the format I want for output
		String result = "City name: " + this.name + ". Population: " + this.population;
		return result; // return
	}
	
	/**
       @param o another object to compare with
       @return true if this object is the same city as o
     */
	public boolean equals(Object o)
	{
		/* I have tolerance because sometimes people might want to move 
		 * around to other places out of the blue, I guess. I don't know
		 * I never have to run a city in my past 20 years of existence
		 */
		int tolerance = 3;
		if (! (o instanceof City) ) // if not a city object return false
			return false;
		City otherCity = (City) o;
		
		return (otherCity.getName().equals(this.getName()) &
		Math.abs(otherCity.getPopulation() - this.getPopulation()) < tolerance );
		
		//return false;
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

