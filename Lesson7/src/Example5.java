import java.util.Scanner;

public class Example5 {
	
	
	public static void main(String args[])
	{
		
		
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Kelime Giriniz :");
		 
		 String kelime=scanner.nextLine();
		 
		 System.out.println(kelime.charAt(kelime.length()-1)+kelime.substring(0, kelime.length()-1));
		
		 
		 String kelime2=kelime.substring(0,kelime.length()-2);
		 
		 kelime=kelime2+kelime.charAt(0)+kelime.charAt(0);
		 

		 System.out.println(kelime);

		 
		 
		
	}

}
