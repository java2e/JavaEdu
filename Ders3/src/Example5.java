import java.util.Scanner;

public class Example5 {
	
	
	public static void main(String args[])
	{
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�lk Kenar� giriniz :");
		
		int a=scanner.nextInt();
		
		System.out.println("�kinci kenar� giriniz :");
		
		int b=scanner.nextInt();
		
		System.out.println("�c�nc� kenar� giriniz :");
		
		int c=scanner.nextInt();
		
		
		if((a+b)>c && c>(a-b))
		{
			if((a+c)>b && b>(a-c))
			{
				if((b+c)>a && a>(b-c))
				{
					System.out.println(a+" "+b+" "+c+" kenarlar�na sahip Bir �cgendir");
				}
				else
				{
					System.out.println("��gen de�ildir");
				}
			}
			else
			{
				System.out.println("��gen de�ildir");
			}
		}
		else
		{
			System.out.println("��gen de�ildir");
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
