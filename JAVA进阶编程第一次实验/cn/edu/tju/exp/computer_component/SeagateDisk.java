package edu.tju.exp.computer_component;

public class SeagateDisk extends disk {
	
	final int default_volume=1024;
	final int default_price=9999;
	public SeagateDisk(String name,int volume,int price){
		setName(name);
		setVolume(volume);
		setPrice(price);
	}
	public SeagateDisk(){
		setName("SeagateDisk");
		setVolume(default_volume);
		setPrice(default_price);
	}
	
	public void work(){
		System.out.print("SeagateDisk work");
	}
	
}
