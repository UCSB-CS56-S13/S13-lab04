package edu.ucsb.cs56.S13.lab04.dlyd2b;

public class Job {
    private String job;
    private int annualWageInDollars;
    
    public Job(){
	this.job = "Unemployed";
	this.annualWageInDollars = 0;
    }

    public Job(String job, int annualWageInDollars){
	this.job = job;
	this.annualWageInDollars = annualWageInDollars;
    }

    public void setJob(String job){
	//this.job = job;
	this.job = "STUBB";
    }

    public void setAnnualWageInDollars(int annualWageInDollars){
	//this.annualWageInDollars = annualWageInDollars;
	this.annualWageInDollars = -1; //STUBB
    }

    public String getJob(){
	//return job;
	return "STUBB";
    }

    public int getAnnualWageInDollars(){
	//return annualWageInDollars;
	return "-1";
    }

    public boolean equals(){
	/*
	double tol = 0.01;
	if (! (o instanceof Job) )
	    return false;
	Job other = (Job) o;
	return (other.getJob().equals(this.getJob()) &
		Math.abs(other.getAnnualWageInDollars()
			 - this.getAnnualWageInDollars()) < tol); 
	*/
	return false; //STUBB
    }

    public String toString(){
	/*String string;
	string = getJob() + ", " getAnnualWageInDollars();
	return string;*/
	return "STUB";
    }
}
