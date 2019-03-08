package edu.tju.exp.computer_component;

public class AsusMainboard extends mainboard{
	final int default_speed=1024;
	final int default_price=488;
	public AsusMainboard(String name,int speed,int price){
		setName(name);
		setSpeed(speed);
		setPrice(price);
	}
	public AsusMainboard(){
		setName("AsusMainboard");
		setSpeed(default_speed);
		setPrice(default_price);
	}
	public void work(){
		System.out.print("AsusMainboard work");
	}

}
