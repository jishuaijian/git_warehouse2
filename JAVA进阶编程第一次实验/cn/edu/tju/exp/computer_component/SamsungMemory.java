package edu.tju.exp.computer_component;

public class SamsungMemory extends memory{
	final int default_volume=1024;
	final int default_price=599;
	public SamsungMemory(String name,int volume,int price){
		setName(name);
		setVolume(volume);
		setPrice(price);
	}
	public SamsungMemory(){
		setName("SamsungMemory");
		setVolume(default_volume);
		setPrice(default_price);
	}
	
	
	public void work(){
		System.out.print("SamsungMemory work");
	}

}
