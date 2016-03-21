package com.mhmt;


public class Main {

	public static void main(String args[]) {

		int[][] oyunMatrisi = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0)
					oyunMatrisi[i][j] = 0;
				if (i == 4 && j == 4)
					oyunMatrisi[i][j] = 0;
				oyunMatrisi[i][j] = (int) (Math.random() * 9) + 1;

			}
		}

		oyunMatrisi[0][0] = 0;
		oyunMatrisi[3][3] = 0;

		Oyuncu oyuncular[] = new Oyuncu[2];

		oyuncular[0] = new Oyuncu("A", 0, 0);
		oyuncular[1] = new Oyuncu("B", 3, 3);

		Tahta tahta = new Tahta(oyunMatrisi, oyuncular);

		tahta.oyunuOynat();

	}

}
