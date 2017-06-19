
public class Test {
	
	public static void main(String args[])
	{
		
		
		Student student=new Student();
		student.name="Jaava";
		student.surname="Developer";
		//student.no=12;
		student.noAtama(15);
		
		
		student.printName(); // Ekrana adını yazdıracak
		
		int number=student.getNo(); // ogr. no number atayacak.
		
		System.out.println(number);
		
	}

}
