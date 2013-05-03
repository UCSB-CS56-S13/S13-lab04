package edu.ucsb.cs56.S13.lab04.richard_nguyen;
/** 
    Game is a class to represent a Game with its name and the year it is released.
    @author Richard Nguyen
    @version 05/02/2013 for lab04, cs56, S13
*/


class Game{
    private String name="noname";  //name of game
    private int year=0; // year released
    /** Default Constructor creates a noname and the year 0 */
    public Game(){ }
    /**
       @param name name ( e.g Pacman, Zelda, Mario)
       @param year year ( e.g 1980, 2013)
    */
    public Game( String name, int year){
	this.name = name;
	this.year = year;
    }
    /** 
	@return name of game(e.g Pacman, Zelda, Mario)

    */
    public String getName(){
	return name;
    }
    /** 
	@return year released  (e.g 1980, 2013)
    */
    public int getYear(){
	return year;
    }
    /** 
	Set the name of the game
    */
    public void setName(String name){
	this.name = name;
    }
    /**
       Set the year of the game
    */
    public void setYear( int year){
	this.year = year;
    }
    
    /**
       Are the games equal?
       @param a another object to compare 
       @return true if this object is the same game as a
    */
    public boolean equals(Object a){
	if (! (a instanceof Game) )
	    return false;
	Game b = (Game) a;
	if( b.getName() == this.name && b.getYear()==this.year)
	    return true;
	return false;
		
	
    }
    /**
       Convert to a string representation.  Examples: "[Bioshock, 2013]", "[Fez, 2012]"
       @return String represntation of Game.
    */
    public String toString(){
	String result = "["+name+": "+year+"]";
	return result;
    }
    /** 
	A sample main that uses the class.
    */
    public static void main(String[] args){
	Game Battlefield = new Game("Battlefield3",2012);
	Game game = new Game();
	System.out.println(Battlefield);
    }
}
