package edu.ucsb.cs56.S13.lab04.briankwan;

/**

 Flower represents a Flower. This class will show the name of the flower as a string and the number of petals as an int

*/

public class Flower {
    private String name = "Sunflower";
    private int petal = 16;
	/**
	 Default constructor 
	 */
 
    public Flower (){};
    
    /** 
	@param name  (e.g. Sunflower, Rose, Lilac, Lily)
	@param petal (e.g. 16, 10, 8, 12)
     */
     
    public Flower (String name, int petal) {
	this.name = name;
	this.petal = petal;
    }
    
	 /**
	 @return name (e.g. Sunflower, Rose, Lilac, Lily)
	 */
     
    public String getName() {
	return this.name; 
    }

	/**
	 @return petal (e.g. 16, 10, 8, 12)
	 */
	 
    public int getPetal() {
	return this.petal; 
    }
    /**
     sets the name of a flower
     @param n  (e.g. Sunflower, Rose, Lilac, Lily)
     */ 
    public void setName(String n){
	this.name = n;
    }
    
    /**
     sets the number of petals of a flower
     @param p  (e.g. 16, 10, 8, 12)
     */ 
     
    public void setPetal(int p){
	this.petal = p;
    }
	
	/**
       Convert to a string representation.  Examples: "Name: Sunflower, Number of Petals: 16", "Name: Rose, Number of Petals: 10"
       @return String represntation of flower.
     */
     
    public String toString(){
	return "Name: " + this.name + ", Number of Petals: " + this.petal;
    }
    
    /**
       Are the flowers equal?
       @param o another object to compare 
       @return true if this object is the same flower as o
     */
     
     public boolean equals(Object o) {

        if (o == null)
            return false;
        if (!(o instanceof Flower))
            return false;

	    Flower a = (Flower) o;
	    
	    if(a.getName() == this.name && a.getPetal() == this.petal){ return true;}
	    return false;    
	}

	/**
	 Main function that creates flower and uses toString()
	 */ 
	public static void main(String [] args){
		Flower f = new Flower("Rose", 10);
		f.toString();
	}
}
