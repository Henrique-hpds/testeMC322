import java.util.ArrayList;

public class Peao extends Peca{

    boolean primeiraJogada;
    
    public Peao(String cor, Coordenada posicao){
        super(cor, posicao, 1, "peao");
        this.primeiraJogada = true;
    }

    private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(-1, 1), new Coordenada(1, 1), new Coordenada(0, -1), new Coordenada(0, -2), new Coordenada(-1, -1), new Coordenada(1, -1)};

    //Atenção para as condições especiais de primeira jogada, usar a boolean "primeiraJogada"
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();
        if(primeiraJogada) {
            //Aplicar aqui condições para primeira jogada (andar duas casas)
        }
        else {
            //Restante
        }
        return movimentosLegais;
        //return super.getPossiveisMovimentos(MOVIMENTO_PADRAO, tabuleiro);
    }
}
