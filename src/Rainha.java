import java.util.ArrayList;

public class Rainha extends Peca{
    
    public Rainha(String cor, Coordenada posicao){
        super(cor, posicao, 9, "rainha");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList <Coordenada> movimentosPossiveis = new ArrayList<Coordenada>();

        for (int i = 1; i <= 7; i++){
            Coordenada coord = new Coordenada(0, i);
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
            Coordenada coord = new Coordenada(0, -i);
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
            Coordenada coord = new Coordenada(i, 0);
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
            Coordenada coord = new Coordenada(-i, 0);
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
