package edu.ucsb.cs56.S13.lab04.YunSuk;

public class Gun{
	
	private String model;
	private int bulletsRemaining;
	private int maxBullets;
	public Gun(){
	/* Stub!
		model="Hand Gun";
		bulletsRemaining=0;
		maxBullets=6;
	*/
	}
	public Gun(String name, int bullets, int max)
	{
	/* Stub!
		model=name;
		if(max<0)
		maxBullets=0;
		else
		maxBullets=max;
		if(bullets<0)
		bulletsRemaining=0;
		else if(bullets>maxBullets)
		bulletsRemaining=maxBullets;
		else
		bulletsRemaining=bullets;
	*/
	}
	public int getMaxBullets(){
		return -199;//Stub!
		//return maxBullets;
	}	
	public String getModel(){
		return "Stub!";//Stub!
		//return model;
	}
	public int getBulletsRemaining(){
		return -199;//Stub!
		//return bulletsRemaining;
	}
	public void setMaxBullets(int max){
	/* Stub!
		if(max<0)
		maxBullets=0;
		else
		maxBullets=max;
	*/
	}
	public void setModel(String name){
	/* Stub!
		model=name;
	*/
	}
	public void setBulletsRemaining(int bullets){
	/*Stub!
		if(bullets<0)
		bulletsRemaining=0;
		else if(bullets>maxBullets)
		bulletsRemaining=maxBullets;
		else
		bulletsRemaining=bullets;
	*/
	}
	public String toString()
	{
		return "Stub";//Stub!
	/*
		return "Model: "+model+"   BulletsRemaining: "+ bulletsRemaining + "   MaxBullets: "+maxBullets;
	*/
	}
	public boolean equals(Object o)
	{
		return false; //Stub!
	/* Stub!
		if(o==null)
			return false;
		if(!(o instanceof Gun))
			return false;
		if(bulletsRemaining!=((Gun) o).getBulletsRemaining())
			return false;
		if(maxBullets!=((Gun) o).getMaxBullets())
			return false;
		if(model.equals(((Gun) o).getModel()))
			return true;
		
		return false;
	*/
	}
	public void shoot()
	{
	/* Stub!
		if(bulletsRemaining>0)
		bulletsRemaining--;
		
		else
		System.out.println("Out of bullet");
	*/
	}
	public boolean isEmpty()
	{
		return false;//Stub!
	/*
		if(bulletsRemaining==0)
			return true;
		return false;
	*/
	}
	public void reload()
	{
	/* Stub!
		bulletsRemaining=maxBullets;
	*/
	}
	
	public static void main(String[] args)
	{
	/*  Stub!
		Gun gun = new Gun();
		Gun ak47= new Gun("AK-47",30,30);
		for(int i=0;i<3;i++){
		while(!gun.isEmpty()){
		System.out.println(gun);
		
		gun.shoot();
		}
		System.out.println(gun);
	
		while(!ak47.isEmpty()){
		System.out.println(ak47);
		
		ak47.shoot();
		}
		System.out.println(ak47);
	
		ak47.reload();
		gun.reload();
		System.out.println(gun);
	
		System.out.println(ak47);
		}
	*/
	}
}
