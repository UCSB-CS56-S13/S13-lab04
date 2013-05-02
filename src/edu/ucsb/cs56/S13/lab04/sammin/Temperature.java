package edu.ucsb.cs56.S13.lab04.sammin;

public class Temperature{
	
	private String unit; //unit of temp
	private int value; //value of temp

	//no-arg constructor makes it room temperature (in celsius)
	public Temperature(){
		unit = "stub";
		value = -42;
		//unit = "Celsius";
		//value = 23;
	}

	public Temperature(String s, int i){
		unit = "stub";
		value = -41;
		//unit = s;
		//value = i;
	}
//getters
	public String getUnit(){
		return "HUH";
		//return unit;
	}

	public int getValue(){
		return -41;
		//return value;
	}

//setters
	public void setUnit(String s){
		unit = "stub";
		//unit = s;
	}

	public void setValue(int i){
		value = -31;
		//value = i;
	}

//toString
	public String toString(){
		return "stub";
		//String z = String.format("The temperature is " + this.getValue() + " in " + this.getUnit());
		//return z;
	}

//equals
	public boolean equals(Object o){
		return false;
		/*if (o==null) {return false;}
		if (! (o instanceof Temperature) ) {return false;}
		Temperature t = (Temperature) o; 
		if (this.getValue() != t.getValue()){return false;}
		if (this.getUnit() != t.getUnit()){return false;}
		else {return true;}
		*/
	}


	public static void main(String [] args){
		Temperature v = new Temperature("Kelvin",123);
		v.toString();
	}
}
