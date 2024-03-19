package xadrez;

import tabuleiro.Peça;
import tabuleiro.Tabuleiro;

public class Peça_xadrez extends Peça {

	private Color Color;

	public Peça_xadrez(Tabuleiro tabuleiro, xadrez.Color color) {
		super(tabuleiro);
		Color = color;
	}

	public Color getColor() {
		return Color;
	}

}
