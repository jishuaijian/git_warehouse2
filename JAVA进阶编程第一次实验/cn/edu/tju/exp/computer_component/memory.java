package edu.tju.exp.computer_component;

public abstract  class memory implements worktype{
	private String name;
	private int volume;
	private int price;
	
	public void setName(String name){
		this.name=name;
	}
	public void setVolume(int volume){
		this.volume=volume;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public abstract void work();
			
	
	public String getName(){
		return this.name;
	}
	public int getVolume(){
		return this.volume;
	}
	public int getPrice(){
		return this.price;
	}
}
