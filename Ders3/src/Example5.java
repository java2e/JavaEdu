import java.util.Scanner;

public class Example5 {
	
	
	public static void main(String args[])
	{
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ýlk Kenarý giriniz :");
		
		int a=scanner.nextInt();
		
		System.out.println("Ýkinci kenarý giriniz :");
		
		int b=scanner.nextInt();
		
		System.out.println("Ücüncü kenarý giriniz :");
		
		int c=scanner.nextInt();
		
		
		if((a+b)>c && c>(a-b))
		{
			if((a+c)>b && b>(a-c))
			{
				if((b+c)>a && a>(b-c))
				{
					System.out.println(a+" "+b+" "+c+" kenarlarýna sahip Bir Ücgendir");
				}
				else
				{
					System.out.println("Üçgen deðildir");
				}
			}
			else
			{
				System.out.println("Üçgen deðildir");
			}
		}
		else
		{
			System.out.println("Üçgen deðildir");
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
