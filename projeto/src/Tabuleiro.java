public class Tabuleiro {
    private Casa[][] matrizCasas;

    public Tabuleiro(){
        matrizCasas = new Casa[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                matrizCasas[i][j] =  new Casa();
    }

    public Casa getCasa(int x, int y){
        return matrizCasas[x][y];
    }
}
