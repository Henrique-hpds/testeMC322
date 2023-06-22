import java.util.ArrayList;

public class Cavalo extends Peca{

    private final static  ArrayList<Integer> MOVIMENTO_PADRAO = {-17, -15, -10, -6, 6, 10, 15, 17};

    @Override
    public ArrayList<Integer> getPossiveisMovimentos() {
        List <Integer> movimentos = new ArrayList<>();
        
        for (Integer n: MOVIMENTO_PADRAO){
            if (0 < getPosicao() + n && getPosicao() + n < 63)
                movimentos.add(getPosicao() + n);
        }

        return movimentos;
    }
}
