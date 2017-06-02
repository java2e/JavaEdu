import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/**
		 * 
		 * Switch(value)
		 * {
		 * case v1: break;
		 * case v2: break;
		 * case v3: break;
		 * default: break;
		 * } 
		 *
		 * 
		 */
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Gün Sayýsýný Giriniz :");
		
		
		int gun=scanner.nextInt();
		
		switch (gun) {
		case 1:
			System.out.println("PAZARTESÝ");
		case 2: 
			System.out.println("SALI");
		case 3:
			System.out.println("CARSAMBA");
		case 4:
			System.out.println("PERSEMBE");
		case 5:
			System.out.println("CUMA");
		case 6: 
			System.out.println("CUMARTESÝ");
		case 7:
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("1 HAFTA 7 GUN");
			break;
		}
		
		

	}

}
