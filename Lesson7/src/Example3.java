import java.util.Scanner;

public class Example3 {
	
	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kelime giriniz :");
		
		String kelime=scanner.nextLine();
		
		
		
		System.out.println(kelime.substring(kelime.length()/2, kelime.length())+
				kelime.substring(0,kelime.length()/2));
		
	}

}
