
public class Example1 {

	public static void main(String[] args) {


		
		
		/**
		 * Loop
		 * do-while
		 * while
		 * for
		 * 
		 * for= bir baslangýc degerýnden baslayýp bir sartý saglayana
		 *  kadar belirlenen increment artýrýma göre kod blogun calýstýrýlmasý
		 *  
		 *  
		 *  for(baslangýc degeri;sart;artýrým)
		 *  {
		 *    // code block  for dongusu
		 *  }
		 *  
		 * syso(1);
		 * syso(2);
		 * .
		 * ..
		 * ..
		 * 
		 * for(int i=0;i<10 ;i++)
		 * {
		 *  
		 *  syso(i);
		 * 
		 * }
		 * 
		 * int sayi=0;
		 * for(int i=15;i<25;i++)  // i 1 artýr i=i+1;
		 * {
		 * sayi++;
		 * syso(sayi);
		 * }
		 * 
		 * 
		 * foreach =>>> java sytanx yok
		 * 
		 * for(Object obje:liste)
		 * {
		 * object
		 * }
		 * 
		 * 
		 */
		
		
		
		int dizi [] = {2,5,6,7,8}; //init
		
		System.out.println("Klasik Method :");
		for(int j=0;j<dizi.length;j++)
		{
			System.out.println(dizi[j]); // j.index degeri yazacak
		}
		
		System.out.println("Foreach Method :");
		int r=0;
		for(int k:dizi) // foreach yapýsý
		{
			
			r++;
			System.out.println(r+"->"+k);
			
		}
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
