import java.util.Scanner;

public class Example4 {

	
	public static void main(String args[])
	{
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kelime giriniz :");
		
		String kelime=scanner.nextLine();
		
		System.out.println(kelime.indexOf('a'));
		
		for (int i = 0; i <kelime.length(); i++) {
			
			char c=kelime.charAt(i);
			int j=0;
			
			if(kelime.indexOf(c)!=i)
				continue;
			
			for(int k=0;k<kelime.length();k++)
			{
				if(kelime.charAt(k)==c)
					j++;
			}
			
			System.out.println(c+" : "+j);
			
			
		}
		
	}
	
}
