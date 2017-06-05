import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);
		
		int number=scanner.nextInt();
		
		
		
		int index=0;
		
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
				System.out.println("ASAL DEÐÝLDÝR");
			}
				
		}
		
		if(index==2)
		{
			System.out.println("ASALDIR");
		}
		else
		{
			System.out.println("ASAL DEÐÝLDÝR");
		}
		

	}

}
