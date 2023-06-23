import java.util.ArrayList;

public class Rainha extends Peca{
    
    public Rainha(String cor, Coordenada posicao){
        super(cor, posicao, 9);
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-7, -7), new Coordenada(-6, -6), new Coordenada(-5, -5), new Coordenada(-4, -4), new Coordenada(-3, -3), new Coordenada(-2, -2), new Coordenada(-1, -1), new Coordenada(1, 1), new Coordenada(2, 2), new Coordenada(3, 3), new Coordenada(4, 4), new Coordenada(5, 5), new Coordenada(6, 6), new Coordenada(7, 7), new Coordenada(7, -7), new Coordenada(6, -6), new Coordenada(5, -5), new Coordenada(4, -4), new Coordenada(3, -3), new Coordenada(2, -2), new Coordenada(1, -1), new Coordenada(1, -1), new Coordenada(2, -2), new Coordenada(3, -3), new Coordenada(4, -4), new Coordenada(5, -5), new Coordenada(6, -6), new Coordenada(7, -7), new Coordenada(0, -7), new Coordenada(0, -6), new Coordenada(0, -5), new Coordenada(0, -4), new Coordenada(0, -3), new Coordenada(0, -2), new Coordenada(0, -1), new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(0, 3), new Coordenada(0, 4), new Coordenada(0, 5), new Coordenada(0, 6), new Coordenada(0, 7), new Coordenada(-7, 0), new Coordenada(-6, 0), new Coordenada(-5, 0), new Coordenada(-4, 0), new Coordenada(-3, 0), new Coordenada(-2, 0), new Coordenada(-1, 0), new Coordenada(1, 0), new Coordenada(2, 0), new Coordenada(3, 0), new Coordenada(4, 0), new Coordenada(5, 0), new Coordenada(6, 0), new Coordenada(7, 0)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        return super.getPossiveisMovimentos(MOVIMENTO_PADRAO, tabuleiro);
    }
}
