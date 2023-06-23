public class Tabuleiro {
    private Casa[][] matrizCasas;

    public Tabuleiro(){
        matrizCasas = new Casa[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if((i + j) % 2 == 0){
                    matrizCasas[i][j] =  new Casa("Preto");
				}else{
					matrizCasas[i][j] =  new Casa("Branco");
				}
    }

    public Casa getCasa(int x, int y){
        return matrizCasas[x][y];
    }
}
