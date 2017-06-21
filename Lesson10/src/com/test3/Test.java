package com.test3;

public class Test {

	public static void main(String[] args) {


		Araba araba=new Araba();
		araba.freneBas();
		araba.gazaBas();
		araba.vitesAt();
		
		BMW bmw=new BMW();
		bmw.freneBas();
		bmw.gazaBas();
		bmw.vitesAt();
		bmw.zenonAc(); // BMW sýnýfýn ozellýgý
		
		Mercedes mercedes=new Mercedes();
		mercedes.freneBas();
		mercedes.gazaBas();
		mercedes.vitesAt();
		mercedes.cruiseKontrol();
		
		
		
	}

}
