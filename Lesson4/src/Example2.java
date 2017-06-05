import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		int startNumber=scanner.nextInt();
		
		for(int i=startNumber;i<startNumber+10;i++)
		{
			
			if(i%2==0)
				System.out.println(i);
			
		}
		
	}

}
