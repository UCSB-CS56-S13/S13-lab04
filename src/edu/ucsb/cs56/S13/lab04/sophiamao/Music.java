package edu.ucsb.cs56.S13.lab04.sophiamao;

/** Music class
  @author Sophia Mao
  @version April 27 2013 lab04
 */

public class Music{
    private String trackName; // Track Name (e.g Come As You Are, Here Comes The Sun)
    private int secondsDuration; // Duration (in seconds)


    /** Constructor
     * empty constructor
     */

    public Music(){
    }

    /**Constructor
       @param trackName Track Name (e.g. Come As You Are, Here Comes The Sun)
       @param secondsDuration duration of song in seconds
     */
    
    public Music(String trackName, int secondsDuration){
	this.trackName = trackName;
	this.secondsDuration = secondsDuration;
    }

    /**
       Set track name
    */

    public void setTrackName( String trackName){
    }

    /**
       set seconds duration
    */

    public void setSecondsDuration(int secondsDuration){

    }

    /**
       get track name
    */
    
    public String getTrackName(){
	return "stub"; // @@@STUB fix meee!
    }

    /**
       get duration in seconds
    */

    public int getSecondsDuration(){
	return 0; //@@@STUB fix meee!
    }

    /**
       to string method (e.g Come As You Are - 219sec)
    */

    public String toString(){
	return "stub"; //@@@STUB fix meee!
    }
    
    /**
       equals method
    */

    public boolean equals(Music song){
	return true; //@@@STUB fix meee!
    }

    /**
       Main
    */
    
    public static void main(String[] args){
	Music song = new Music("Come As You Are", 219);
	System.out.println(song.toString());
    }

    



}
