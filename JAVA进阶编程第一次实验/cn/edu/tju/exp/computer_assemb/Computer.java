package edu.tju.exp.computer_assemb;

import edu.tju.exp.computer_component.*;

public class Computer {
	
	private CPU myCPU;
	private memory myMemory;
	private disk myDisk;
	private mainboard myMainboard;
	private int allPrice;
	private String name;
	private static Integer number=1;

	
	public Computer(){
		myCPU=new IntelCPU();
		myMemory=new SamsungMemory();
		myDisk=new SeagateDisk();
		myMainboard=new GigabyteMainBoard();
		allPrice=myCPU.getPrice()+myMemory.getPrice()+myDisk.getPrice()+myMainboard.getPrice();
		name="computer"+number.toString();
		number++;

	}
	
	public Computer(CPU cons_cpu,memory cons_memory,disk cons_disk,mainboard cons_mainboard){
		myCPU=cons_cpu;
		myMemory=cons_memory;
		myDisk=cons_disk;
		myMainboard=cons_mainboard;
		allPrice=cons_cpu.getPrice()+cons_memory.getPrice()+cons_disk.getPrice()+cons_mainboard.getPrice();
		name="computer"+number.toString();
		number++;
	}
	
	
	
	public void describe(){
		System.out.print("  infomation:");
		System.out.println("  CPU:"+myCPU.getName()+" "+"memory:"+myMemory.getName()+" "+"disk:"+myDisk.getName()+" "+"mainboard:"+myMainboard.getName());
	}
	
	public void work(){
		System.out.println("  Working condition:");
		System.out.print("  ");
		myCPU.work();
		System.out.print("  ");
		myMemory.work();
		System.out.print("  ");
		myDisk.work();
		System.out.print("  ");
		myMainboard.work();
		System.out.println();
	}
	
	public int getPrice(){
		return this.allPrice;
	}
	public void showComputer(){
		System.out.println(name+":");
		System.out.println("  price:"+allPrice);
		describe();
		work();
		System.out.println("----------------------");
	}
}
