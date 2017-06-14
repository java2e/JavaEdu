
public class Example1 {

	public static void main(String[] args) {

		
		/**
		 * 
		 * String Ýþlemleri:
		 * 
		 * Referans Veri Tipleri : String , ArrayList
		 * 
		 *
		 * char [] ={'J','A','V','A'}
		 * 
		 * String isim="JAVA";
		 * 
		 * String isim=new String();
		 * 
		 * +
		 * 
		 * StringBuilder
		 * 
		 * append()
		 * 
		 */
		
		
		String isim="Java"; 
		
		//char dizi[] = {'J','a','v','a'};
		
		System.out.println(isim);
		
		
		
		
		isim=isim.substring(1); // baslangýc index 
		
		System.out.println(isim);
		
		int uzunluk=isim.length(); // kac tane karakter mevcut 
		
		isim.trim(); // sað ve soldaki bosluklarý alýr
		
		char c=isim.charAt(2);  // v
		

		System.out.println(isim.charAt(2));
		
		System.out.println((char)isim.codePointAt(1));
		
		System.out.println(isim.compareTo("va"));
		
		isim=isim.concat("Developer");
		
		System.out.println(isim);
		
		boolean isEsit=isim.equals("avaDeveloper"); // ?  ==
		
		
		String isim1=new String("Ahmet");
		String isim2=new String("Ahmet");
		
		String isim3=isim2;
		
		Integer i=new Integer(2);
		int j=2;
		
		
		// hashcode diðeri value???
		
		if(isim1.equals(isim2)) // isim1==isim2
		{
			System.out.println("Eþit");
		}
		else
			System.out.println("Eþit deðil");
		
		
		
		String test="Vektorel";
		System.out.println(test.getBytes()[0]);
		
		byte bite='Y';
		
		System.out.println(bite);
		
		String temp="";
		
		for(int k=0;k<test.length();k++)
		{
			if(test.charAt(k)!='e')
				temp=temp+test.charAt(k);
		}

		System.out.println(temp);
		
		isim.indexOf("ava");
		
		isim.toUpperCase();
		isim.toLowerCase();
		isim=""+1+5;
		
		System.out.println(isim);
		
		isim.startsWith("as	");
		
		isim.split("a"); // String dizi []
		
		
		
	}

}
