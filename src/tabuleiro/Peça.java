package tabuleiro;

public class Peça {

	private Posição posicao;
	private Tabuleiro tabuleiro;

	public Peça(Tabuleiro tabuleiro) { // para criar uma peça eu informo o tabuleiro
		this.tabuleiro = tabuleiro;
		posicao = null; // uma peça recem criada recebe valor nulo
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
