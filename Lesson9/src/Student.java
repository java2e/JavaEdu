
public class Student {
	
	public Student() {

		System.out.println("Student nesnesi olusturuldu!");
		
	}
	
	private int no;
	
	public void noAtama(int no)
	{
		this.no=no;
	}
	
	public String name;
	
	public String surname;
	
	public void printName()
	{
		System.out.println(this.name);
	}
	
	public int getNo()
	{
		return this.no;
	}

}
