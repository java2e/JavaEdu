import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kelime giriniz :");
		
		String kelime=scanner.nextLine();
		
		String newKelime="";
		
		
		for (int i = 0; i < kelime.length(); i++) {
			
			
			if(kelime.charAt(i)!='z')
			{	
			char c=(char) ((byte)kelime.charAt(i)+2);
			newKelime=newKelime+c;
			}
			else
				newKelime=newKelime+'b';
		}
	
		
		System.out.println(newKelime);
		
	}

}
