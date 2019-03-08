package edu.tju.exp.computer_component;

public  abstract class CPU  implements worktype{
	private String name;
	private String coreNum;
	private int price;
	
	public void setName(String name){
		this.name=name;
	}
	public void setCoreNum(String coreNum){
		this.coreNum=coreNum;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public abstract void work();

	
	
	
	public String getName(){
		return this.name;
	}
	public  String getcoreNum(){
		return this.coreNum;
	}
	public  int getPrice(){
		return this.price;
	}
}
