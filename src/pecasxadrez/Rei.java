package src.pecasxadrez;

import src.jogotabuleiro.Tabuleiro;
import src.xadrez.Cor;
import src.xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

    public Rei(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString() {
        return "R";
    }    
}
