import java.util.ArrayList;

public class Cavalo extends Peca{

    private final static  ArrayList<Integer> MOVIMENTO_PADRAO = {-17, -15, -10, -6, 6, 10, 15, 17};

    @Override
    public ArrayList<Integer> getPossiveisMovimentos() {
        List <Integer> movimentos = new ArrayList<>();
        return ArrayList<Integer> MOVIMENTO_PADRAO = {getPosicao() -17, getPosicao() - 15,  getPosicao() - 10, getPosicao() -6, getPosicao() + 6, getPosicao() + 10, getPosicao() + 15, getPosicao() + 17};
    }
}
