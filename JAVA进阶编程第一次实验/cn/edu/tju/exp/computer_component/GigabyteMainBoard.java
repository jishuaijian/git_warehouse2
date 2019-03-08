package edu.tju.exp.computer_component;

public class GigabyteMainBoard extends mainboard{
	
	final int default_speed=1024;
	final int default_price=588;
	public GigabyteMainBoard(String name,int speed,int price){
		setName(name);
		setSpeed(speed);
		setPrice(price);
	}
	public GigabyteMainBoard(){
		setName("GigabyteMainBoard");
		setSpeed(default_speed);
		setPrice(default_price);
	}
	
	
	public void work(){
		System.out.print("GigabyteMainBoard work");
	}
	
}
