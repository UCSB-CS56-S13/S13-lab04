package edu.ucsb.cs56.S13.lab04.thebohster;

public class MechanicalPencil{

    private String brand = "bic";
    private int leadSize = 42; //in micrometers

    public MechanicalPencil(){
    }

    /**
       @param brand Brand of the pencil
       @param leadSize Size of the lead in micrometers
    */

    public MechanicalPencil(String brand, int leadSize){
	this.brand = brand;
	this.leadSize = leadSize;
    }

    /**
       @return Brand of pencil
    */

    public String getBrand(){
	return this.brand;
    }

    /**
       @return Size of the lead in micrometers
    */

    public int getLeadSize(){
	return this.leadSize;
    }

    /**
       @param brand Brand of pencil
    */

    public void setBrand(String brand){
	this.brand = brand;
    }

    /**
       @param leadSize Size of lead in micrometers
    */

    public void setLeadSize(int leadSize){
	this.leadSize = leadSize;
    }

    /**
       @return pencil Pencil that includes the brand and size of lead
    */

    public String toString(){
	String pencil;
	pencil = brand + " " + leadSize + "um";
	return pencil;
    }

    /**
       @param mechPencil MechanicalPencil object which includes a brand name and size of lead
       @return true if the brands and lead sizes match, false otherwise
    */

    public boolean equals(MechanicalPencil mechPencil){
	if(mechPencil.brand == this.brand && mechPencil.leadSize == this.leadSize)
	    return true;
	else
	    return false;
    }

    /**
       main function
    */

    public static void main(String[] args){
	MechanicalPencil bic = new MechanicalPencil("bic", 500);
        System.out.println(bic.toString());
    }
}
