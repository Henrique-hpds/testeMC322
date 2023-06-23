public class Validacao {
    
    public static boolean coordenadaValida(Coordenada coord){
        if(0 > coord.x() || coord.x() > 7)
            return false;

        if(0 > coord.y() || coord.y() > 7)
            return false;

        return true;
    }

    // public static boolean casaVazia(Tabuleiro tabuleiro, Coordenada coord) {
    //     if(tabuleiro.getCasa(coord.x(),coord.y()))
    // }
}
