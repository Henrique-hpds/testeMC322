import java.util.ArrayList;

public class Rei extends Peca{
    public Rei(String cor, Coordenada posicao){
        super(cor, posicao, 0, "rei"); // Ver a questao do valor
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-1, 0), new Coordenada(-1, -1), new Coordenada(0, -1), new Coordenada(1, -1), new Coordenada(1, 0), new Coordenada(1, 1), new Coordenada(0, 1), new Coordenada(-1, 1)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        return super.getPossiveisMovimentos(MOVIMENTO_PADRAO, tabuleiro);
    }
}
