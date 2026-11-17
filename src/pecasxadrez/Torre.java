package src.pecasxadrez;

import src.jogotabuleiro.Tabuleiro;
import src.xadrez.Cor;
import src.xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

    public Torre(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString() {
        return "T";
    }
}
