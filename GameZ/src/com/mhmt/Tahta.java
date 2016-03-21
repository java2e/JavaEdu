package com.mhmt;


import java.util.Scanner;

public class Tahta {

	private int[][] oyunMatrisi;

	private Oyuncu oyuncular[];

	public Tahta(int[][] oyunMatrisi, Oyuncu[] oyuncular) {
		// TODO Auto-generated constructor stub

		this.oyunMatrisi = oyunMatrisi;
		this.oyuncular = oyuncular;

	}

	public boolean oyunBittimi() {

		int sayac = 0;

		for (int i = 0; i < oyunMatrisi.length; i++) {

			for (int j = 0; j < oyunMatrisi.length; j++) {

				if (oyunMatrisi[i][j] == 0)
					sayac++;

			}

		}

		if (sayac == 16) {
			System.out.println();
			System.out.println("OYUN BÝTTÝ:)");
			if (oyuncular[0].getToplamPuan() > oyuncular[1].getToplamPuan())
				System.out.println("Kazanan: " + oyuncular[0].oyuncuAdi
						+ "Puaný: " + oyuncular[0].getToplamPuan());
			else if (oyuncular[1].getToplamPuan() > oyuncular[0]
					.getToplamPuan())
				System.out.println("Kazanan :" + oyuncular[1].oyuncuAdi
						+ "Puaný: " + oyuncular[1].getToplamPuan());
			else
				System.out.println("Berabere kaldýnýz:)");

			return false;
		} else
			return true;

	}

	public void oyunuOynat() {

		tahtayiYazdir();

		Scanner scanner = new Scanner(System.in);

		boolean change = true;
		while (oyunBittimi())

			if (change) {
				System.out.println();
				System.out
						.println("Sayýn A, lütfen hareket yönünüzü seçiniz:(b,k,d,g)");

				String a = scanner.next();

				if (a.length() == 1) {

					if (a.charAt(0) == 'b') {

						oyuncular[0].hareketEt('b', 4, 4);

						oyuncular[0]
								.puanEkle(oyunMatrisi[oyuncular[0].getY()][oyuncular[0]
										.getX()]);

					}

					else if (a.charAt(0) == 'd') {

						oyuncular[0].hareketEt('d', 4, 4);

						oyuncular[0]
								.puanEkle(oyunMatrisi[oyuncular[0].getY()][oyuncular[0]
										.getX()]);

					}

					else if (a.charAt(0) == 'k') {

						oyuncular[0].hareketEt('k', 4, 4);

						oyuncular[0]
								.puanEkle(oyunMatrisi[oyuncular[0].getY()][oyuncular[0]
										.getX()]);

					}

					else if (a.charAt(0) == 'g') {

						oyuncular[0].hareketEt('g', 4, 4);

						oyuncular[0]
								.puanEkle(oyunMatrisi[oyuncular[0].getY()][oyuncular[0]
										.getX()]);

					}

					else
						System.out
								.println("Geçersiz bir yön girdiniz!Yerinizde kaldýnýz!");

				}

				else
					System.out
							.println("Geçersiz bir yön girdiniz!Yerinizde kaldýnýz!");

				change = false;

				oyunMatrisi[oyuncular[0].getY()][oyuncular[0].getX()] = 0;

				tahtayiYazdir();

			}

			else {
				System.out.println();
				System.out
						.println("Sayýn B, lütfen hareket yönünüzü seçiniz:(b,k,d,g)");

				String a = scanner.next();

				if (a.length() == 1) {

					if (a.charAt(0) == 'b') {

						oyuncular[1].hareketEt('b', 4, 4);

						oyuncular[1]
								.puanEkle(oyunMatrisi[oyuncular[1].getY()][oyuncular[1]
										.getX()]);

					}

					else if (a.charAt(0) == 'd') {

						oyuncular[1].hareketEt('d', 4, 4);

						oyuncular[1]
								.puanEkle(oyunMatrisi[oyuncular[1].getY()][oyuncular[1]
										.getX()]);

					}

					else if (a.charAt(0) == 'k') {

						oyuncular[1].hareketEt('k', 4, 4);

						oyuncular[1]
								.puanEkle(oyunMatrisi[oyuncular[1].getY()][oyuncular[1]
										.getX()]);

					}

					else if (a.charAt(0) == 'g') {

						oyuncular[1].hareketEt('g', 4, 4);

						oyuncular[1]
								.puanEkle(oyunMatrisi[oyuncular[1].getY()][oyuncular[1]
										.getX()]);

					}

					else
						System.out
								.println("Geçersiz bir yön girdiniz!Yerinizde kaldýnýz!");

				}

				else
					System.out
							.println("Geçersiz bir yön girdiniz!Yerinizde kaldýnýz!");

				change = true;

				oyunMatrisi[oyuncular[1].getY()][oyuncular[1].getX()] = 0;
				tahtayiYazdir();
			}

	}

	public void tahtayiYazdir() {

		for (int i = 0; i < oyunMatrisi.length; i++) {

			for (int j = 0; j < oyunMatrisi.length; j++) {

				if (oyuncular[0].getX() == j && oyuncular[0].getY() == i)
					System.out.print(oyuncular[0].oyuncuAdi + " ");
				else if (oyuncular[1].getX() == j && oyuncular[1].getY() == i)
					System.out.print(oyuncular[1].oyuncuAdi + " ");
				else
					System.out.print(oyunMatrisi[i][j] + " ");
			}

			System.out.println();
		}

		for (int i = 0; i < oyuncular.length; i++) {
			System.out.print(oyuncular[i].oyuncuAdi + ":"
					+ oyuncular[i].getToplamPuan() + "  ");
		}

	}

	public int[][] getOyunMatrisi() {
		return oyunMatrisi;
	}

	public void setOyunMatrisi(int[][] oyunMatrisi) {
		this.oyunMatrisi = oyunMatrisi;
	}

	public Oyuncu[] getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Oyuncu[] oyuncular) {
		this.oyuncular = oyuncular;
	}

}
