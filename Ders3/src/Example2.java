import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 
		 * if bigger than 50 print F
		 * İf bigger than 50 and less than 70 print C 
		 * if bigger than 70 and less than 80 print B
		 * if bigger than 80 and less than 100 print A
		 * if bigger than 100 print error process
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter number :");
		
		int number=scanner.nextInt();
		
		
		if(number>=0 || number <=50)
		{
			System.out.println("F");
		}
		else if(number>50 && number<=70)
		{
			System.out.println("B");
		}
		else if(number>70 && number<=80)
		{
			System.out.println("C");
		}
		else if(number>80 && number<=100)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("Error Number");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
