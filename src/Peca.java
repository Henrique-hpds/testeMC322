import java.util.ArrayList;

public class Peca {
    private final String cor;
    private final int valor;
    private Coordenada posicao;
    private final String tag;

    public Peca() {
        this.cor = "";
        this.valor = 0;
        this.posicao = null;
        this.tag = "";
    }

    public Peca(String cor, Coordenada posicao, int valor, String tag) {
        this.cor = cor;
        this.valor = valor;
        this.posicao = posicao;
        this.tag = tag;
    }

    public String getCor() {
        return cor;
    }

    public int getValor(){
        return valor;
    }

    public Coordenada getPosicao() {
        return posicao;
    }

    public String getTag(){
        return tag;
    }

    public void setPosicao(Coordenada posicao) {
        this.posicao = posicao;
    }

    // public ArrayList<Coordenada> getPossiveisMovimentos(Coordenada [] MOVIMENTO_PADRAO, Tabuleiro tabuleiro) {
    //     ArrayList <Coordenada> movimentos = new ArrayList<Coordenada>();
        
    //     for (Coordenada coord: MOVIMENTO_PADRAO){
    //         Coordenada soma = getPosicao().soma(coord);
    //         if (Validacao.coordenadaValida(soma))
    //             movimentos.add(soma);
    //     }

    //     return movimentos;
    // }

    public static Peca comerPeca(Casa casa) {
        Peca peca = casa.getPeca();
        casa.setPeca(null);
        return peca;
    }

}
