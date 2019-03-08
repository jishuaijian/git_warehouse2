package edu.tju.exp.computer_store;

import edu.tju.exp.computer_assemb.*;
import edu.tju.exp.computer_component.*;


public class ComputerStore {
	static Computer storeList1=new Computer();
	static Computer storeList2=new Computer(new IntelCPU(),new KingstonMemory(),new WestDigitalsDisk(),new AsusMainboard());
	static Computer storeList3=new Computer(new AMDCPU(),new SamsungMemory(),new SeagateDisk(),new GigabyteMainBoard());
	
	public static  void showComputersList(){
		storeList1.showComputer();
		storeList2.showComputer();
		storeList3.showComputer();
	}
	
	public static void main(String[] args) {
		showComputersList();
	}
}
