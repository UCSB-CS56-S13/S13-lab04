package edu.ucsb.cs56.S13.lab04.dlyd2b;

/**
   The Job class represents a job. It contains a String
   and an int that represent the title of the job and
   its annual wage in dollars.
 */

public class Job {
    private String job;
    private int annualWageInDollars;
    
    /**
       Default constructor creates a Job "Unemployed", 0
     */
    public Job(){
	/*
	this.job = "Unemployed";
	this.annualWageInDollars = 0;
	*/
	this.job = "STUBB";
	this.annualWageInDollars = -1; //STUBB
    }

    /**
       Two argument constructor
       @param job The title of the job
       @param annualWageInDollars The job's annual wage in dollars
     */
    public Job(String job, int annualWageInDollars){
	/*
	this.job = job;
	this.annualWageInDollars = annualWageInDollars;
	*/
	this.job = "STUBB";
	this.annualWageInDollars = -1; //STUBB
    }

    /**
       Sets the job to the parameter
       @param job Title of job
     */
    public void setJob(String job){
	//this.job = job;
	this.job = "STUBB";
    }

    /**
       Sets the annualWageInDollars to the parameter
       @param annualWageInDollars Annual wage in dollars
    */
    public void setAnnualWageInDollars(int annualWageInDollars){
	//this.annualWageInDollars = annualWageInDollars;
	this.annualWageInDollars = -1; //STUBB
    }

    /**
       @return job (e.g. Professor, Lecturer, Programmer
    */
    public String getJob(){
	//return job;
	return "STUBB";
    }

    /**
      @return annualWageInDollars (e.g. 20000, 35000, 100000)
    */
    public int getAnnualWageInDollars(){
	//return annualWageInDollars;
	return -1; //STUBB
    }

    /**
       Compares the jobs
       @param o Another object to compare
       @return true if this object and o share the same values
    */
    public boolean equals(Object o){
	/*
	if (! (o instanceof Job) )
	    return false;
	Job other = (Job) o;
	return (other.getJob().equals(this.getJob()) &
		other.getAnnualWageInDollars().equals(
		this.getAnnualWageInDollars);
	*/
	return false; //STUBB
    }

    /**
       Converts to a string representation in the form of "Job, annualWageInDollars"
       @return String representation of Job
    */
    public String toString(){
	/*String string;
	string = getJob() + ", " getAnnualWageInDollars();
	return string;*/
	return "STUBB";
    }
    /**
       Sample main that uses the default, two-arg constructors and toString
    */
    public static void main(String [] args) {
	Job j = new Job();
	Job k = new Job("Programmer", 75000);
	System.out.println(k);
    }
}
