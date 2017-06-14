import java.util.Scanner;

public class Example2 {
	
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		
		String adi=scanner.nextLine(); 
		
		String soyadi=scanner.nextLine();
		
		String fullName="";
		
		for(int i=adi.length()-1;i>=0;i--)
		{
			fullName=fullName+adi.charAt(i);
		}
		
		fullName=fullName+" "+soyadi;
		
		System.out.println(fullName);
		
		
	}
}
