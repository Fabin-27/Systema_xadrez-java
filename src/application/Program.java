package application;

import xadrez.Partida_xadrez;

public class Program {

	public static void main(String[] args) {


		Partida_xadrez partida = new Partida_xadrez();
		UI.Mostrar_Tabuleiro(partida.getpecas());

	}

}
