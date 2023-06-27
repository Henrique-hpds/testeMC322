import java.util.ArrayList;

public class Peao extends Peca{

    private boolean primeiraJogada;
    
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
        
        if(this.getCor() == "preto") {
            if(primeiraJogada) {
                //Aplicar aqui condições para primeira jogada (andar duas casas)
                System.out.println("TESTE 1");
                for(int i = 0; i <= 2; i++) {
                    Coordenada coord = new Coordenada(0, i);
                    Coordenada soma = getPosicao().soma(coord);
                    boolean contem = false; 
                    for (Coordenada coorde1: limites) {
                        if ((coorde1.x() == soma.x()) && (coorde1.y() == soma.y())) {
                            contem = true;
                        }
                    }
                    if(contem) {
                        Coordenada coleta1 = new Coordenada(soma.x() + 1, soma.y());
                        Coordenada coleta2 = new Coordenada(soma.x() - 1, soma.y());
                        if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                            System.out.println("TESTE 3");
                            movimentosPossiveis.add(soma);
                        }
                        // else if((Validacao.coordenadaValida(coleta1)) && (!tabuleiro.getCasa(soma.x() + 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() + 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta1);
                        //     //break;
                        // }
                        // else if((Validacao.coordenadaValida(coleta2)) && (!tabuleiro.getCasa(soma.x() - 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() - 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta2);
                        //     //break;
                        // }
                    }
                }
            }
            else {
                //Restante
                    for(int i = 0; i <= 1; i++) {
                    Coordenada coord = new Coordenada(0, i);
                    Coordenada soma = getPosicao().soma(coord);
                    System.out.println("POSICAO");
                    System.out.println(getPosicao());
                    boolean contem = false;
                    for (Coordenada coorde1: limites) {
                        if ((coorde1.x() == soma.x()) && (coorde1.y() == soma.y())) {
                            contem = true;
                        }
                    }
                    if(contem) {
                        Coordenada coleta1 = new Coordenada(soma.x() + 1, soma.y());
                        Coordenada coleta2 = new Coordenada(soma.x() - 1, soma.y());
                        if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                            movimentosPossiveis.add(soma);
                        }
                        // else if((Validacao.coordenadaValida(coleta1)) && (!tabuleiro.getCasa(soma.x() + 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() + 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta1);
                        //     //break;
                        // }
                        // else if((Validacao.coordenadaValida(coleta2)) && (!tabuleiro.getCasa(soma.x() - 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() - 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta2);
                        //     //break;
                        // }
                    }
                }
            }
        }
        if(this.getCor() == "branco") {
            if(primeiraJogada) {
                //Aplicar aqui condições para primeira jogada (andar duas casas)
                System.out.println("TESTE 1");
                for(int i = 0; i >= -2; i--) {
                    Coordenada coord = new Coordenada(0, i);
                    Coordenada soma = getPosicao().soma(coord);
                    boolean contem = false; 
                    for (Coordenada coorde1: limites) {
                        if ((coorde1.x() == soma.x()) && (coorde1.y() == soma.y())) {
                            contem = true;
                        }
                    }
                    if(contem) {
                        Coordenada coleta1 = new Coordenada(soma.x() + 1, soma.y());
                        Coordenada coleta2 = new Coordenada(soma.x() - 1, soma.y());
                        if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                            System.out.println("TESTE 3");
                            movimentosPossiveis.add(soma);
                        }
                        // else if((Validacao.coordenadaValida(coleta1)) && (!tabuleiro.getCasa(soma.x() + 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() + 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta1);
                        //     //break;
                        // }
                        // else if((Validacao.coordenadaValida(coleta2)) && (!tabuleiro.getCasa(soma.x() - 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() - 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta2);
                        //     //break;
                        // }
                    }
                }
            }
            else {
                //Restante
                    for(int i = 0; i >= -1; i--) {
                    Coordenada coord = new Coordenada(0, i);
                    Coordenada soma = getPosicao().soma(coord);
                    System.out.println("POSICAO");
                    System.out.println(getPosicao());
                    boolean contem = false;
                    for (Coordenada coorde1: limites) {
                        if ((coorde1.x() == soma.x()) && (coorde1.y() == soma.y())) {
                            contem = true;
                        }
                    }
                    if(contem) {
                        Coordenada coleta1 = new Coordenada(soma.x() + 1, soma.y());
                        Coordenada coleta2 = new Coordenada(soma.x() - 1, soma.y());
                        if(!tabuleiro.getCasa(soma.x(), soma.y()).estaOcupado()) {
                            movimentosPossiveis.add(soma);
                        }
                        // else if((Validacao.coordenadaValida(coleta1)) && (!tabuleiro.getCasa(soma.x() + 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() + 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta1);
                        //     //break;
                        // }
                        // else if((Validacao.coordenadaValida(coleta2)) && (!tabuleiro.getCasa(soma.x() - 1, soma.y()).getPeca().getCor().equals(getCor())) &&
                        // (tabuleiro.getCasa(soma.x() - 1, soma.y()).estaOcupado())){
                        //     movimentosPossiveis.add(coleta2);
                        //     //break;
                        // }
                    }
                }
            }
        }
        // for (Coordenada coord: movimentosPossiveis){
        //     //Coordenada soma = getPosicao().soma(coord);
        //     if (Validacao.coordenadaValida(coord))
        //         movimentosLegais.add(coord);
        // }
        System.out.println(movimentosPossiveis);
        return movimentosPossiveis;
    }

    public void setPrimeiraJogada(boolean bool){
        primeiraJogada = bool;
    }
}
