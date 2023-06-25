import java.util.ArrayList;

public class Cavalo extends Peca{

    public Cavalo(String cor, Coordenada posicao){
        super(cor, posicao, 3, "cavalo");
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-2, -1), new Coordenada(-1, -2), new Coordenada(1, -2), new Coordenada(2, -1), new Coordenada(2, 1), new Coordenada(1, 2), new Coordenada(-1, 2), new Coordenada(-2, 1)};

    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        //ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
        for (Coordenada coord: MOVIMENTO_PADRAO){
            Coordenada soma = getPosicao().soma(coord);
            if (Validacao.coordenadaValida(soma))
                movimentosLegais.add(soma);
        }
        return movimentosLegais;
    }
}
