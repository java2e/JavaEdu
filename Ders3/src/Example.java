import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Statement Kosul - �art C�mlecikleri
		 * 
		 * if
		 * 
		 * 1-if(�art) // sart mutlaka boolean e�er true olmas� durumunda code block cal�sacakt�r
		 * 2-{ 
		 * 3-code block
		 * 4-}
		 * 5-else
		 * {
		 * else block // sart false ise cal�sacakt�r
		 * }
		 * 
		 * true false olsada mutlaka cals�ackt�r
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
		
		
		
		
		
		
		// Girilen bir say�n�n 5den byuk ise buyuktur yazs�n
		//e�er kucukse 5den kucuktur yazs�n
		
		Scanner scanner=new Scanner(System.in);  // java.util.Scanner
		
		System.out.println("Bir say� giriniz :");
		
		int number=scanner.nextInt();
		
		// > < == >= <= != !>  <
		
		if(number>5)
		{
			
			System.out.println("Say� 5den buyuktur");
			
		}
		else if(number==5) 
		{
			System.out.println("Say� 5e e�ittir");
		}
		else
		{
			System.out.println("Say� 5den kucuktur");
		}
		
		
		
		if(number==5)
		{
			System.out.println("5DEN E��TT�R");
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
