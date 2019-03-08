package edu.tju.exp.computer_component;

public class IntelCPU extends CPU {
	
	final  String default_coreNum="0x86";
	final int default_price=3999;
	public IntelCPU(String name,String coreNum,int price){
		setName(name);
		setCoreNum(coreNum);
		setPrice(price);
	}
	public IntelCPU(){
		setName("IntelCPU");
		setCoreNum(default_coreNum);
		setPrice(default_price);
	}
	
	public void work(){
		System.out.print("IntelCPU work");
	}
}
