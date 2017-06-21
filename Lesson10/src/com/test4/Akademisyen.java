package com.test4;

public class Akademisyen extends Personel {

	public String unvan;
	
	public String birim;
	
	public Akademisyen(int arg) {
	
		super(arg);
	}
	
	public void dersAc(String ders)
	{
		System.out.println(ders+" dersi acıldı");
	}
	
}
