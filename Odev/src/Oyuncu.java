
public class Oyuncu {

	public String oyuncuAdi;
	
	private int x;
	
	private int y;
	
	private int toplamPuan;
	
	
	public Oyuncu(String oyuncuAdi,int x,int y) {

		this.oyuncuAdi=oyuncuAdi;
		this.x=x;
		this.y=y;
	
	}
	
	// D�sar�dan gelen puan parametres�n� toplam puana ekler
	public void puanEkle(int puan)
	{
		toplamPuan=toplamPuan+puan;
	}
	
	public void hareketEt(char c,int x,int y)
	{
		
		if(c=='k')
		{
			if(getX()!=0)
				setX(getX()-1);
			else
				System.out.println("Yanl�� y�n sectiniz!");
			
		}
		else if(c=='b')
		{
			if(getY()>0)
			setY(getY()-1);
			else
				System.out.println("Yanl�� y�n sectiniz!");
			
		}
		else if(c=='g')
		{
			if(getX()<x-1)
				setX(getX()+1);
			else
				System.out.println("Yanl�� y�n sectiniz!");

			
		}
		else if(c=='d')
		{
			
			if(getY()<y-1)
				setY(getY()+1);
			else
				System.out.println("Yanl�� y�n sectiniz!");

			
		}
		else
		{
			System.out.println("Yanl�s y�n sectiniz yerinizde kald�n�z!");
		}
		
		
		
		
	}
	
	
	
	public int getX()
	{
		return this.x;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	
	public void setToplamPuan(int toplamPuan)
	{
		this.toplamPuan=toplamPuan;
	}
	
	public int getToplamPuan()
	{
		return this.toplamPuan;
	}
	
	
	
	
	
	
}
