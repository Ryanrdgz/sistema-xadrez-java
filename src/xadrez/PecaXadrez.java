package src.xadrez;

import src.jogotabuleiro.Peca;
import src.jogotabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
    
    private Cor color;

    public PecaXadrez(Tabuleiro tabuleiro, Cor color) {
        super(tabuleiro);
        this.color = color;
    }

    public Cor getColor() {
        return color;
    }

}
