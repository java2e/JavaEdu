package com.test3;

public class BMW extends Araba{
	
	public BMW() {

		System.out.println("BMW nesnesi �retildi");
	}
	
	@Override
	public void freneBas() {

		System.out.println("BMW FRENE BASTI");
		
	}
	
	
	public void zenonAc()
	{
		System.out.println("Zenon ac�ld�");
	}

}
