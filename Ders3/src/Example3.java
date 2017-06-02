import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/**
		 * 
		 * if number is between 50 and 70 
		 *  and than if number is divide by 13 print divided else not divided
		 *  
		 *  else
		 *  if divide by 9 print divide by 9  
		 * 
		 * 
		 */
	
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number :");
		
		int number=scanner.nextInt();
		
		
		if((50<number && number<70) && (number%13==0)){
			
			
			if(number%13==0)
			{
				System.out.println("divide by 13");
			}
			else
			{
				System.out.println("not divide by 13");
			}
			
			
		}
		else
		{
			
			if(number%9==0)
			{
				System.out.println("divide by 9");
			}
			else
			{
				System.out.println("not divide by 9");
			}
			
		}
		
		
	
	
	
	
	}
	
	

}
