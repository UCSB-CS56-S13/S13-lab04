package edu.ucsb.cs56.S13.lab04.YunSuk;

public class Gun{
	
	private String model;
	private int bulletsRemaining;
	private int maxBullets;
	public Gun(){
		model="Hand Gun";
		bulletsRemaining=0;
		maxBullets=6;
	}
	public Gun(String name, int bullets, int max)
	{
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
	}
	public int getMaxBullets(){
		return maxBullets;
	}	
	public String getModel(){
		return model;
	}
	public int getBulletsRemaining(){
		return bulletsRemaining;
	}
	public void setMaxBullets(int max){
		if(max<0)
		maxBullets=0;
		else
		maxBullets=max;
	}
	public void setModel(String name){
		model=name;
	}
	public void setBulletsRemaining(int bullets){
		if(bullets<0)
		bulletsRemaining=0;
		else if(bullets>maxBullets)
		bulletsRemaining=maxBullets;
		else
		bulletsRemaining=bullets;
	}
	public String toString()
	{
		return "Model: "+model+"   BulletsRemaining: "+ bulletsRemaining + "   MaxBullets: "+maxBullets;
	}
	public boolean equals(Object o)
	{
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
	}
	public void shoot()
	{
		if(bulletsRemaining>0)
		bulletsRemaining--;
		
		else
		System.out.println("Out of bullet");
	}
	public boolean isEmpty()
	{
		if(bulletsRemaining==0)
			return true;
		return false;
	}
	public void reload()
	{
		bulletsRemaining=maxBullets;
	}
	
	public static void main(String[] args)
	{
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
	}
}
