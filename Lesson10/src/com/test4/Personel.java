package com.test4;

public class Personel {
	
	public String ad;
	
	public String soyad;
	
	public String sicilNo;
	
	public Adress adress [];
	
	public Personel(int args) {
	
		adress=new Adress[args];
		// TODO Auto-generated constructor stub
	}
	
	public int maasHesapla()
	{
		return (int) (Math.random()*100); // 1-100 arasında bir sayı cevirir
	}
	

}
