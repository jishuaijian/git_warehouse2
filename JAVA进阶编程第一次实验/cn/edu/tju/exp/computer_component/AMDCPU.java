package edu.tju.exp.computer_component;

public class AMDCPU extends CPU{
	final  String default_coreNum="AM12";
	final int default_price=2999;
	public AMDCPU(String name,String coreNum,int price){
		setName(name);
		setCoreNum(coreNum);
		setPrice(price);
	}
	
	public AMDCPU(){
		setName("AMDCPU");
		setCoreNum(default_coreNum);
		setPrice(default_price);
	}
	
	public void work(){
		System.out.print("AMDCPU work");
	}
}
