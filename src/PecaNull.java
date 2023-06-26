import java.util.ArrayList;

public class PecaNull extends Peca{
    public PecaNull(){
        super("", null, 0, "");
    }
    
    public ArrayList<Coordenada> getPossiveisMovimentos(Tabuleiro tabuleiro){
        return new ArrayList<Coordenada>();
    }
}
