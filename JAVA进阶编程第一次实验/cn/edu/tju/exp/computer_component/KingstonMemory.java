package edu.tju.exp.computer_component;

public class KingstonMemory extends memory {
	final int default_volume=1024;
	final int default_price=999;
	public KingstonMemory(String name,int volume,int price){
		setName(name);
		setVolume(volume);
		setPrice(price);
	}
	public KingstonMemory(){
		setName("SamsungMemory");
		setVolume(default_volume);
		setPrice(default_price);
	}
	public void work(){
		System.out.print("KingstonMemory work");
	}
}
