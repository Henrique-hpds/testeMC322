import java.util.ArrayList;

public class Peao extends Peca {

    private boolean primeiraJogada;
    
    public Peao(String cor, Coordenada posicao){
        super(cor, posicao, 1, "peao");
        this.primeiraJogada = true;
    }

    //private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(0, 1), new Coordenada(0, 2), new Coordenada(-1, 1), new Coordenada(1, 1), new Coordenada(0, -1), new Coordenada(0, -2), new Coordenada(-1, -1), new Coordenada(1, -1)};

    //Atenção para as condições especiais de primeira jogada, usar a boolean "primeiraJogada"
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();

        if(this.getCor() == "preto") {

            for (int i = 1; i <= 2; i++){
                Coordenada coord = new Coordenada(0, i);
                Coordenada soma = coord.soma(getPosicao());
                if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                    movimentosPossiveis.add(soma);            
                if(!primeiraJogada)
                    break;
            }

            Coordenada coordTeste = new Coordenada(1, 1);
            Coordenada somaTeste = coordTeste.soma(getPosicao());
            if(Validacao.coordenadaValida(somaTeste) && tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).estaOcupado() && !getCor().equals(tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).getPeca().getCor()))
                movimentosPossiveis.add(somaTeste);

            coordTeste = new Coordenada(-1, 1);
            somaTeste = coordTeste.soma(getPosicao());
            if(Validacao.coordenadaValida(somaTeste) && tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).estaOcupado() && !getCor().equals(tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).getPeca().getCor()))
                movimentosPossiveis.add(somaTeste);   

        }
        else if(this.getCor() == "branco") {
            for (int i = 1; i <= 2; i++){
                Coordenada coord = new Coordenada(0, -i);
                Coordenada soma = coord.soma(getPosicao());
                if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                    movimentosPossiveis.add(soma);            
                if(!primeiraJogada)
                    break;
            }
                
            Coordenada coordTeste = new Coordenada(1, -1);
            Coordenada somaTeste = coordTeste.soma(getPosicao());
            if(Validacao.coordenadaValida(somaTeste) && tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).estaOcupado() && !getCor().equals(tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).getPeca().getCor()))
                movimentosPossiveis.add(somaTeste);

            coordTeste = new Coordenada(-1, -1);
            somaTeste = coordTeste.soma(getPosicao());
            if(Validacao.coordenadaValida(somaTeste) && tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).estaOcupado() && !getCor().equals(tabuleiro.getCasa(somaTeste.x(), somaTeste.y()).getPeca().getCor()))
                movimentosPossiveis.add(somaTeste);                        
        }
        System.out.println(movimentosPossiveis);
        return movimentosPossiveis;
    
    }

    public void setPrimeiraJogada(boolean bool){
        primeiraJogada = bool;
    }
}
