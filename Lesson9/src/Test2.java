import java.util.Scanner;

import org.model.Adress;
import org.model.Author;
import org.tool.Book;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		Author author=new Author();
		
		System.out.println("Author Name :");
		
		author.name=scanner.next();
		
		System.out.println("Author Birth Year :");
		
		author.birthYear=scanner.nextInt();
		
		Adress [] adress=new Adress[2];
		
		System.out.println("Auhtor City :");
		
		// adress[0] indexde bulunacak Adress tipindeki obje üretilme
		adress[0]=new Adress();
		
		adress[0].city=scanner.next();
		
		
		System.out.println("Auhtor Location :");
		
		adress[0].location=scanner.next();
		
		adress[1]=new Adress();
		
		System.out.println("Auhtor City :");
		
		adress[1].city=scanner.next();
		
		
		System.out.println("Auhtor Location :");
		
		adress[1].location=scanner.next();
		
		// Author address
		author.adress=adress;
		
		
		Book book=new Book();
		
		System.out.println("Book Name :");
		
		book.bookName=scanner.next();
		
		System.out.println("ISBN No :");
		
		book.ISBN=scanner.next();
		
		book.author=author;  // Yukarýdaki book instance yani nesnesi
		
		book.printAuthorAndBook();
		
		
	}

}
