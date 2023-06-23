import java.util.ArrayList;

public class Peao extends Peca{
    
    public Peao(String cor, Coordenada posicao){
        super(cor, posicao, 1);
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(-1, 1), new Coordenada(1, 1)};

    public ArrayList<Coordenada> getPossiveisMovimentos() {
        return super.getPossiveisMovimentos(MOVIMENTO_PADRAO);
    }
}
