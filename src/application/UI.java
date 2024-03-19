package application;

import xadrez.Peça_xadrez;

public class UI {

	public static void Mostrar_Tabuleiro(Peça_xadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				Mostrar_Peça(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");

	}

	// imprimir uma peça
	private static void Mostrar_Peça(Peça_xadrez pecas) {
		if (pecas == null) {
			System.out.print("-");
		} else {
			System.out.print(pecas);
		}

		System.out.print(" ");

	}

}
