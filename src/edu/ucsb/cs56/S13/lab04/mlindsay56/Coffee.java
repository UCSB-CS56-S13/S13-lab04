package edu.ucsb.cs56.S13.lab04.mlindsay56;

/** Coffee class

@author Marc Lindsay
@version CS56, S13, lab04

*/
public class Coffee {
	

    private String typeOfCoffee; //the name of the type of coffee
    private int height_inches; //the height of coffee drink served

    public Coffee(){
	//no-arg constructor, values are set to default
	this.typeOfCoffee = "Coffee";
	this.height_inches = 10; 
    }

    public Coffee(String typeOfCoffee, int height_inches){
       	this.typeOfCoffee = typeOfCoffee;
	this.height_inches = height_inches;
    }
    
    public String getTypeOfCoffee(){
	return this.typeOfCoffee;
    }
    
    public int getHeight_inches(){
	return this.height_inches;
    }
    
    public void setTypeOfCoffee(String typeOfCoffee){
	this.typeOfCoffee = typeOfCoffee;
    }
   
    public void setHeight_inches(int height_inches){
	this.height_inches = height_inches;
    }

    public String toString(){
	return String.format("%d inch %s",this.height_inches,this.typeOfCoffee);
     }
    
    public boolean equals(Object o){
	double tol = 1; 
	if (! (o instanceof Coffee) )
	    return false;
	Coffee other = (Coffee) o;
	return (other.getTypeOfCoffee().equals(this.getTypeOfCoffee()) &
	Math.abs(other.getHeight_inches() - this.getHeight_inches()) < tol); 
	}
	
	public static void main(String [] args) { 
	Coffee c = new Coffee("Latte",12);
	System.out.println(c);
    }

}
