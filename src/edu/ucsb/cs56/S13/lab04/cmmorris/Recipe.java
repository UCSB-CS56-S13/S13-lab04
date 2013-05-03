package edu.ucsb.cs56.S13.lab04.cmmorris;

/**Recipe is a class that represents a recipe for a meal. Recipes have names that briefly describes what the meal is. Recipes also have an esimated cooking time that gives an estimate of how to the meal will take to make. This is represented in minutes.

 */

public class Recipe {

    private String meal;
    private int cookingTimeInMinutes;

    /** Default Constructor create a Recipe with the name empty and a cooking time of 0 minutes */

    public Recipe() {
	this.meal = "empty";
	this.cookingTimeInMinutes = 0;
    }

    /**
       @param meal name of meal (e.g. Macaroni and Cheese, Chocolate Chip Cookies)
       @param cookingTimeInMinutes cooking time in minutes (e.g. 15, 20, 30, 45)
    */
    public Recipe(String meal, int cookingTimeInMinutes) {
	this.meal = meal;
	this.cookingTimeInMinutes = cookingTimeInMinutes;
    }

    /**
       @return meal name of meal (e.g. Macaroni and Cheese, Chocolate Chip Cookies)
    */
    public String getMeal() {
	return this.meal;
    }

    /**
       @return cookingTimeInMinutes cooking time in minutes (e.g. 15, 20, 30, 45)
    */
    public int getCookingTimeInMinutes() {
	return this.cookingTimeInMinutes;
    }

    /** 
	@param meal the new meal
    */
    public void setMeal( String meal ) {
	this.meal = meal;
    }

    /**
       @param cookingTimeInMinutes the new cooking time
    */
    public void setCookingTimeInMinutes ( int cookingTimeInMinutes ) {
       	this.cookingTimeInMinutes = cookingTimeInMinutes;
    }

    /**
       Convert to a string representation. Examples: "Macaroni and Cheese, 15min", "Chocolate Chip Cookies, 30min"
       @return String representation of recipe
    */
    public String toString() {
	return this.meal + ", " + this.cookingTimeInMinutes + "min";
    }

    /**
       Are the two recipes equal?
       @param o another object to compare
       @return true of this object is the same radio station as o
    */
    public boolean equals(Object o) {
	if (o==null) {return false; }
	if (! (o instanceof Recipe) ) {return false;}
	Recipe r = (Recipe) o;
	if ( this.getMeal().equals(r.getMeal()) && this.cookingTimeInMinutes == r.cookingTimeInMinutes )
	    return true;
	return false;
    }

    /**
       A sample main that uses the class
    */
    public static void main(String [] args) {
	Recipe mac = new Recipe("Macaroni and Cheese", 15);
	Recipe cookies = new Recipe();
	System.out.println(mac);
    }
}
	
