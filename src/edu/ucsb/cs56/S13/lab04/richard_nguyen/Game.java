package edu.ucsb.cs56.S13.lab04.richard_nguyen;

class Game{
    String name="BattleToad";  //name of game
    int barCode=0; // bar code on box
    public Game(){ }
    public Game( String name, int barCode){
	this.name = name;
	this.barCode = barCode;
    }
    public String getName(){
	return "stub";
    }
    public int getBarCode(){
	return 0;
    }
    public void setName(String name){
	this.name = name;
    }
    public void setBarCode( int barCode){
	this.barCode = barCode;
    }
    public boolean equal(Object a){
	return false;
    }
    public String toString(){
	return "stub";}
    
    
}
