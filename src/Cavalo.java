import java.util.ArrayList;

public class Cavalo extends Peca{

    public Cavalo(String cor, Coordenada posicao){
        super(cor, posicao, 3);
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-2, -1), new Coordenada(-1, -2), new Coordenada(1, -2), new Coordenada(2, -1), new Coordenada(2, 1), new Coordenada(1, 2), new Coordenada(-1, 2), new Coordenada(-2, 1)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        return super.getPossiveisMovimentos(MOVIMENTO_PADRAO, tabuleiro);
    }
}
