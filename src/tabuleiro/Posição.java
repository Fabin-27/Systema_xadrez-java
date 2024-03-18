package tabuleiro;

public class Posição {
	
	private int Linha;
	private int Coluna;
	
	public Posição(int linha, int coluna) {
		this.Linha = linha;
		this.Coluna = coluna;
	}

	public int getLinha() {
		return Linha;
	}

	public void setLinha(int linha) {
		this.Linha = linha;
	}

	public int getColuna() {
		return Coluna;
	}

	public void setColuna(int coluna) {
		this.Coluna = coluna;
	}
	
	@Override
	public String toString() {
		return Linha + ", " + Coluna;
	}
	
	

}
