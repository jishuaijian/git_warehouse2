package edu.tju.exp.computer_component;

public abstract class mainboard implements worktype{
	private String name;
	private int speed;
	private int price;
	
	public void setName(String name){
		this.name=name;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public abstract void work();

	
	public String getName(){
		return this.name;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getPrice(){
		return this.price;
	}
	

}
