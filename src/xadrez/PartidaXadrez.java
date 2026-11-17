package src.xadrez;

import src.jogotabuleiro.Posicao;
import src.jogotabuleiro.Tabuleiro;
import src.pecasxadrez.Rei;
import src.pecasxadrez.Torre;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
        configInicial();
    }

    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getRows()][tabuleiro.getColumns()];
        for (int i=0; i<tabuleiro.getRows(); i++) {
            for (int j=0; j<tabuleiro.getColumns(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }

    private void configInicial() {
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(0, 4));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(7, 4));
    }
}
