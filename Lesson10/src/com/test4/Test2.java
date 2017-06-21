package com.test4;

import java.util.Scanner;

public class Test2 {
	
	
	
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		
		Akademisyen [] akademisyenArray=new Akademisyen[2];
		
		for (int i = 0; i <2; i++) {
			
			System.out.println("Akadamisyen Kac Adresi Var :");
			
			int adresSayisi=scanner.nextInt();
			
			 akademisyenArray[i]=new Akademisyen(adresSayisi);
			
			System.out.println("Akademisyen adý :");
			
			 akademisyenArray[i].ad=scanner.next();
			
			System.out.println("Akademisyen soyad :");
			
			akademisyenArray[i].soyad=scanner.next();
			
			System.out.println("Akademisyen unvan :");
			
			akademisyenArray[i].unvan=scanner.next();
			
			for (int j = 0; j < akademisyenArray[i].adress.length; j++) 
			{
				
				akademisyenArray[i].adress[j]=new Adress();
				
				System.out.println(akademisyenArray[i].ad+" "+(j+1)+" . Adres City :");
				
				akademisyenArray[i].adress[j].city=scanner.next();
				
			}
			
			
		}
		
		
		for (Akademisyen akademisyen : akademisyenArray) {
			
			System.out.println(akademisyen.ad+"  "+akademisyen.adress[0].city);
			
		}
		
		
		
	}
	
	
	

}
