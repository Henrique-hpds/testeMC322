public class Tabuleiro {
    private Casa[][] matrizCasas;

    public Tabuleiro(){
        matrizCasas = new Casa[8][8];
    }

    public Casa getCasa(int x, int y){
        return matrizCasas[x][y];
    }
}
