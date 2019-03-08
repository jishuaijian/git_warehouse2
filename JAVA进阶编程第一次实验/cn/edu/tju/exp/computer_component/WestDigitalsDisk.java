package edu.tju.exp.computer_component;

public class WestDigitalsDisk extends disk {
	
	final int default_volume=512;
	final int default_price=5499;
	public WestDigitalsDisk(String name,int volume,int price){
		setName(name);
		setVolume(volume);
		setPrice(price);
	}
	public WestDigitalsDisk(){
		setName("WestDigitalsDisk");
		setVolume(default_volume);
		setPrice(default_price);
	}
	public void work(){
		System.out.print("WestDigitalsDisk work");
	}

}
