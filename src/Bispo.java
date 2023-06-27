import java.util.ArrayList;

public class Bispo extends Peca{
     
    public Bispo(String cor, Coordenada posicao){
        super(cor, posicao, 3, "bispo");
    }

    //private final static Coordenada[] MOVIMENTO_PADRAO = {new Coordenada(-7, -7), new Coordenada(-6, -6), new Coordenada(-5, -5), new Coordenada(-4, -4), new Coordenada(-3, -3), new Coordenada(-2, -2), new Coordenada(-1, -1), new Coordenada(1, 1), new Coordenada(2, 2), new Coordenada(3, 3), new Coordenada(4, 4), new Coordenada(5, 5), new Coordenada(6, 6), new Coordenada(7, 7), new Coordenada(7, -7), new Coordenada(6, -6), new Coordenada(5, -5), new Coordenada(4, -4), new Coordenada(3, -3), new Coordenada(2, -2), new Coordenada(1, -1), new Coordenada(1, -1), new Coordenada(2, -2), new Coordenada(3, -3), new Coordenada(4, -4), new Coordenada(5, -5), new Coordenada(6, -6), new Coordenada(7, -7)};

    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();
        //ArrayList <Coordenada> movimentosLegais = new ArrayList<Coordenada>();


        //// KANT
        for (int i = 1; i <= 7; i++){
            Coordenada coord = new Coordenada(i, i);
            Coordenada soma = coord.soma(getPosicao());
            if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                movimentosPossiveis.add(soma);            
            else{
                if(Validacao.coordenadaValida(soma) && Validacao.coordenadaValida(soma) &&  !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                    movimentosPossiveis.add(soma);
                break;
            }
        }
        for (int i = 1; i <= 7; i++){
            Coordenada coord = new Coordenada(-i, -i);
            Coordenada soma = coord.soma(getPosicao());
            if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                movimentosPossiveis.add(soma);            
            else{
                if(Validacao.coordenadaValida(soma) && !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                    movimentosPossiveis.add(soma);
                break;
            }
        }
        for (int i = 1; i <= 7; i++){
            Coordenada coord = new Coordenada(-i, i);
            Coordenada soma = coord.soma(getPosicao());
            if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                movimentosPossiveis.add(soma);            
            else{
                if(Validacao.coordenadaValida(soma) && !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                    movimentosPossiveis.add(soma);
                break;
            }
        }
        for (int i = 1; i <= 7; i++){
            Coordenada coord = new Coordenada(i, -i);
            Coordenada soma = coord.soma(getPosicao());
            if(Validacao.coordenadaValida(soma) && !tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado())
                movimentosPossiveis.add(soma);            
            else{
                if(Validacao.coordenadaValida(soma) && !getCor().equals(tabuleiro.getCasa(soma.x(), soma.y()).getPeca().getCor()))
                    movimentosPossiveis.add(soma);
                break;
            }
        }

        return movimentosPossiveis;
    }
}
