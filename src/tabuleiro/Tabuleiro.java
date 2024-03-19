package tabuleiro;

public class Tabuleiro {

	private int Linhas;
	private int Colunas;
	private Peça[][] Pecas;

	public Tabuleiro(int linhas, int colunas) {
		Linhas = linhas;
		Colunas = colunas;
		Pecas = new Peça[linhas][colunas];
	}

	public int getLinhas() {
		return Linhas; 
	}

	public void setLinhas(int linhas) {
		Linhas = linhas;
	}

	public int getColunas() {
		return Colunas;
	}

	public void setColunas(int colunas) {
		Colunas = colunas;
	}
	
	public Peça peca(int linha, int coluna) {
		return Pecas[linha][coluna];
	}
	
	public Peça peca(Posição posicao) {
		return Pecas[posicao.getLinha()] [posicao.getColuna()];
	}

}
