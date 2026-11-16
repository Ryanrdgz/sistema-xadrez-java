package src.application;

import src.xadrez.PartidaXadrez;

public class Program {
    public static void main(String[] args) {
        
        PartidaXadrez partida = new PartidaXadrez();
        UI.imprimirTabuleiro(partida.getPecas());
    }
}
