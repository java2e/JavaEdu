import java.util.Scanner;

public class Tahta {
	
	private int oyunMatrisi [][];
	
	private Oyuncu oyuncular [];
	
	public Tahta(int x,int y) {
		
		oyunMatrisi=new int[x][y];
		
		for (int i = 0; i < oyunMatrisi.length; i++) {
			
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				
				oyunMatrisi[i][j]=(int) (Math.random()*10);
				
			}
		}
		
		
		
		oyuncular=new Oyuncu[2];
		oyuncular[0]=new Oyuncu("A", 0, 0);
		oyuncular[1]=new Oyuncu("B",x-1, y-1);
		
		
		oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]=0;
		oyunMatrisi[oyuncular[1].getX()][oyuncular[1].getY()]=0;
		
		setOyuncular(oyuncular);
		
		tahtayiYazdir();
		
		

	}
	
	
	public void oyunuOynat()
	{
		
		Scanner scanner =new Scanner(System.in);
		
		boolean siradaki=true;
		
		while(!oyunBittiMi())
		{
			
			if(siradaki) // 1. oyuncu
			{
				
				System.out.println("Sayýn "+oyuncular[0].oyuncuAdi+" lütfen hareket yönünüzü seçiniz (b, k, d, g):");
				
				String yon=scanner.next();
				
				char y=yon.charAt(0);
				
				oyuncular[0].hareketEt(y, oyunMatrisi.length,oyunMatrisi[0].length);
				
				oyuncular[0].puanEkle(oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]);
				
				oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]=0;
				
				siradaki=false;
			}
			else // 2. oyuncu
			{
				
				System.out.println("Sayýn "+oyuncular[1].oyuncuAdi+" lütfen hareket yönünüzü seçiniz (b, k, d, g):");
				
				String yon=scanner.next();
				
				char y=yon.charAt(0);
				
				oyuncular[1].hareketEt(y, oyunMatrisi.length,oyunMatrisi[0].length);
				
				oyuncular[1].puanEkle(oyunMatrisi[oyuncular[1].getX()][oyuncular[1].getY()]);
				
				oyunMatrisi[oyuncular[1].getX()][oyuncular[1].getY()]=0;
				
				
				
				siradaki=true;
			}
			
			tahtayiYazdir();
			
		}
		
		
		System.out.println("OYUN BÝTTÝ");
		
		if(oyuncular[0].getToplamPuan()>oyuncular[1].getToplamPuan())
			System.out.println("KAZANAN "+oyuncular[0].oyuncuAdi);
		else if(oyuncular[0].getToplamPuan()<oyuncular[1].getToplamPuan())
			System.out.println("KAZANAN "+oyuncular[1].oyuncuAdi);
		else
			System.out.println("MALESEF KAZANAN YOK");

		
		
	}
	
	public void tahtayiYazdir()
	{
		
		System.out.println("<---SON DURUM--->");
		
		for (int i = 0; i < oyunMatrisi.length; i++) {
			
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				
				if(i==oyuncular[0].getX() && j==oyuncular[0].getY())
				
					System.out.print(oyuncular[0].oyuncuAdi+" ");
				
				else if(i==oyuncular[1].getX() && j==oyuncular[1].getY())
				
					System.out.print(oyuncular[1].oyuncuAdi+" ");
				
				else
				System.out.print(oyunMatrisi[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println(oyuncular[0].oyuncuAdi+"  : "+oyuncular[0].getToplamPuan());
		System.out.println(oyuncular[1].oyuncuAdi+"  : "+oyuncular[1].getToplamPuan());
		
		
		
		
	}
	
	public boolean oyunBittiMi()
	{
		
	for (int i = 0; i < oyunMatrisi.length; i++) {
			
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				
				if(oyunMatrisi[i][j]>0)
					return false;
				
			}
		}
		
	return true;
	
	}
	
	
	public int[][] getOyunMatrisi()
	{
		return this.oyunMatrisi;
	}
	
	public void setOyunMatrisi(int oyunMatrisi[][])
	{
		this.oyunMatrisi=oyunMatrisi;
	}
	
	public Oyuncu[] getOyuncular()
	{
		return this.oyuncular;
	}
	
	public void setOyuncular(Oyuncu oyuncular[])
	{
		this.oyuncular=oyuncular;
	}
	

}
