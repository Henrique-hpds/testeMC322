import java.util.ArrayList;

public class Peao extends Peca{

    boolean primeiraJogada;
    
    public Peao(String cor, Coordenada posicao){
        super(cor, posicao, 1, "peao");
        this.primeiraJogada = true;
    }

    //private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(-1, 1), new Coordenada(1, 1), new Coordenada(0, -1), new Coordenada(0, -2), new Coordenada(-1, -1), new Coordenada(1, -1)};

    //Atenção para as condições especiais de primeira jogada, usar a boolean "primeiraJogada"
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();

        ArrayList <Coordenada> limites = new ArrayList<Coordenada>();

        for(int i = 0; i <= 7; i++) {
            for(int j = 0; j <= 7; j++) {
                Coordenada coord = new Coordenada(i, j);
                limites.add(coord);
            }
        }

        if(primeiraJogada) {
            //Aplicar aqui condições para primeira jogada (andar duas casas)
            for(int i = 0; i <= 2; i++) {
                Coordenada coord = new Coordenada(i, 0);
                Coordenada soma = getPosicao().soma(coord);
                if(limites.contains(soma)) {
                    if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                        movimentosPossiveis.add(soma);
                    }
                    else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
                        movimentosPossiveis.add(soma);
                        break;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        else {
            //Restante
                for(int i = 0; i <= 1; i++) {
                Coordenada coord = new Coordenada(i, 0);
                Coordenada soma = getPosicao().soma(coord);
                if(limites.contains(soma)) {
                    if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                        movimentosPossiveis.add(soma);
                    }
                    else if(!tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor().equals(getCor())) {
                        movimentosPossiveis.add(soma);
                        break;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        for (Coordenada coord: movimentosPossiveis){
            //Coordenada soma = getPosicao().soma(coord);
            if (Validacao.coordenadaValida(coord))
                movimentosLegais.add(coord);
        }
        return movimentosLegais;
    }
}
