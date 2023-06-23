public class Validacao {
    
    public static boolean coordenadaValida(Coordenada coord){
        if(0 > coord.x() || coord.x() > 7)
            return false;

        if(0 > coord.y() || coord.y() > 7)
            return false;

        return true;
    }

    public static boolean casaVazia(Tabuleiro tabuleiro, Coordenada coord, Peca peca) {
        if(tabuleiro.getCasa(coord.x(),coord.y()).getPeca().equals(peca)) {
            return true;
        }
        else if(tabuleiro.getCasa(coord.x(),coord.y()).getPeca().getCor().equals(peca.getCor())) {
            //verifica se na coordenada da casa contem alguma peca de mesma cor
            return false;
        } 
        else if(!tabuleiro.getCasa(coord.x(),coord.y()).getPeca().getCor().equals(peca.getCor())) {
            //se a peca for de outra cor
            //chamar funcao de comer outra peca
            return true;
        }
        return false;
    }
}
