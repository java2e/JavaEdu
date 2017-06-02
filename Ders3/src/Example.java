import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Statement Kosul - Þart Cümlecikleri
		 * 
		 * if
		 * 
		 * 1-if(þart) // sart mutlaka boolean eðer true olmasý durumunda code block calýsacaktýr
		 * 2-{ 
		 * 3-code block
		 * 4-}
		 * 5-else
		 * {
		 * else block // sart false ise calýsacaktýr
		 * }
		 * 
		 * true false olsada mutlaka calsýacktýr
		 * 
		 * 
		 * if(sart)
		 * {
		 * }
		 * else if(sart2)
		 * {
		 * 
		 * }
		 * else
		 * {
		 * }
		 * 
		 * 
		 * 
		 * 
		 * switch
		 * 
		 * 
		 */
		
		
		
		
		
		
		// Girilen bir sayýnýn 5den byuk ise buyuktur yazsýn
		//eðer kucukse 5den kucuktur yazsýn
		
		Scanner scanner=new Scanner(System.in);  // java.util.Scanner
		
		System.out.println("Bir sayý giriniz :");
		
		int number=scanner.nextInt();
		
		// > < == >= <= != !>  <
		
		if(number>5)
		{
			
			System.out.println("Sayý 5den buyuktur");
			
		}
		else if(number==5) 
		{
			System.out.println("Sayý 5e eþittir");
		}
		else
		{
			System.out.println("Sayý 5den kucuktur");
		}
		
		
		
		if(number==5)
		{
			System.out.println("5DEN EÞÝTTÝR");
		}
		
		if(number>5)
		{
			System.out.println("5DEN BUYUKTUR");
		}
		
		else
		{
			System.out.println("5DEN KUCUKTUR");
		}
		
	
		
	



	}

}
