package xadrez;

import tabuleiro.Tabuleiro;

public class Partida_xadrez {

	private Tabuleiro Tabuleiro;

	public Partida_xadrez() {
		Tabuleiro = new Tabuleiro(8, 8);
	}

	public Peça_xadrez[][] getpecas() {
		Peça_xadrez[][] mat = new Peça_xadrez[Tabuleiro.getLinhas()][Tabuleiro.getColunas()];
		for (int i = 0; i < Tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < Tabuleiro.getColunas(); j++) {
				mat[i][j] = (Peça_xadrez) Tabuleiro.peca(i, j);
			}
		}

		return mat;

	}

}
