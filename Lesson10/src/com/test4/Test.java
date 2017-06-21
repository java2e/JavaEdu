package com.test4;

public class Test {

	public static void main(String[] args) {
		
		
		Akademisyen akademisyen=new Akademisyen(2);
		
		akademisyen.adress=new Adress[2];
		
		akademisyen.adress[0]=new Adress();
		
		akademisyen.adress[0].city="Adana";
		akademisyen.adress[0].location="Seyhan";
		
		
		akademisyen.ad="Java";
		akademisyen.soyad="developer";
		akademisyen.birim="Muhendislik";
		akademisyen.sicilNo="1234";
		
		Idari idari=new Idari(2);
		
		idari.ad="Mustafa";
		idari.soyad="Nusret";
		idari.sicilNo="23423";
		
		idari.kayitYap(akademisyen); // bir akademisyen bir personeli kapsar
		
		idari.kayitYap(idari); // bir idari bir personeli 
		
		akademisyen.dersAc("YAZILIM");

	}

}
