package com.mhmt;



public class Oyuncu {

	public String oyuncuAdi;

	private int x;

	private int y;

	private int toplamPuan;

	public Oyuncu(String oyuncuAdi, int x, int y) {
		// TODO Auto-generated constructor stub

		this.oyuncuAdi = oyuncuAdi;
		this.x = x;
		this.y = y;

	}

	public void puanEkle(int puan) {
		toplamPuan = toplamPuan + puan;
	}

	public void hareketEt(char c, int x, int y) {

		if (c == 'b') {
			if (getX() > 0)
				setX(getX() - 1);
			else
				System.out
						.println("Belirttiðiniz yöne gidemezsiniz. Yerinizde kaldýnýz.");
		} else if (c == 'd') {
			if (getX() < 3)
				setX(getX() + 1);
			else
				System.out
						.println("Belirttiðiniz yöne gidemezsiniz. Yerinizde kaldýnýz.");
		}

		else if (c == 'k') {
			if (getY() > 0)
				setY(getY() - 1);
			else
				System.out
						.println("Belirttiðiniz yöne gidemezsiniz. Yerinizde kaldýnýz.");
		}

		else if (c == 'g') {
			if (getY() < 3)
				setY(getY() + 1);
			else
				System.out
						.println("Belirttiðiniz yöne gidemezsiniz. Yerinizde kaldýnýz.");
		}

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamPuan() {
		return toplamPuan;
	}

	public void setToplamPuan(int toplamPuan) {
		this.toplamPuan = toplamPuan;
	}

}
