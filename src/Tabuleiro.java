import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Tabuleiro {
    private Casa[][] matrizCasas;
    // casas vazias
    private static final Icon casaBranca = new ImageIcon("../imagens/bege.png");
	private static final Icon casaPreta = new ImageIcon("../imagens/verde.png");

    // peças brancas
	private static final Icon peaoBrancoCasaBranca = new ImageIcon("../imagens/peaoBrancoCasaBranca.png");
	private static final Icon peaoBrancoCasaPreta = new ImageIcon("../imagens/peaoBrancoCasaPreta.png");
	private static final Icon torreBrancaCasaPreta = new ImageIcon("../imagens/torreBrancaCasaPreta.png");
	private static final Icon torreBrancaCasaBranca = new ImageIcon("../imagens/torreBrancaCasaBranca.png");
	private static final Icon cavaloBrancoCasaBranca = new ImageIcon("../imagens/cavaloBrancoCasaBranca.png");
	private static final Icon cavaloBrancoCasaPreta = new ImageIcon("../imagens/cavaloBrancoCasaPreta.png");
	private static final Icon bispoBrancoCasaBranca = new ImageIcon("../imagens/bispoBrancoCasaBranca.png");
	private static final Icon bispoBrancoCasaPreta = new ImageIcon("../imagens/bispoBrancoCasaPreta.png");
	private static final Icon rainhaBrancaCasaBranca = new ImageIcon("../imagens/rainhaBrancaCasaBranca.png");
	private static final Icon rainhaBrancaCasaPreta = new ImageIcon("../imagens/rainhaBrancaCasaPreta.png");
	private static final Icon reiBrancoCasaPreta = new ImageIcon("../imagens/reiBrancoCasaPreta.png");
	private static final Icon reiBrancoCasaBranca = new ImageIcon("../imagens/reiBrancoCasaBranca.png");
    
    // peças pretas
    private static final Icon peaoPretoCasaBranca = new ImageIcon("../imagens/peaoPretoCasaBranca.png");
	private static final Icon peaoPretoCasaPreta = new ImageIcon("../imagens/peaoPretoCasaPreta.png");
	private static final Icon torrePretaCasaPreta = new ImageIcon("../imagens/torrePretaCasaPreta.png");
	private static final Icon torrePretaCasaBranca = new ImageIcon("../imagens/torrePretaCasaBranca.png");
	private static final Icon cavaloPretoCasaBranca = new ImageIcon("../imagens/cavaloPretoCasaBranca.png");
	private static final Icon cavaloPretoCasaPreta = new ImageIcon("../imagens/cavaloPretoCasaPreta.png");
	private static final Icon bispoPretoCasaBranca = new ImageIcon("../imagens/bispoPretoCasaBranca.png");
	private static final Icon bispoPretoCasaPreta = new ImageIcon("../imagens/bispoPretoCasaPreta.png");
	private static final Icon rainhaPretaCasaBranca = new ImageIcon("../imagens/rainhaPretaCasaBranca.png");
	private static final Icon rainhaPretaCasaPreta = new ImageIcon("../imagens/rainhaPretaCasaPreta.png");
	private static final Icon reiPretoCasaPreta = new ImageIcon("../imagens/reiPretoCasaPreta.png");
	private static final Icon reiPretoCasaBranca = new ImageIcon("../imagens/reiPretoCasaBranca.png");

    public Tabuleiro(){
        matrizCasas = new Casa[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++){
                if((i + j) % 2 == 0)
                    matrizCasas[i][j] =  new Casa("Preto");
				else
					matrizCasas[i][j] =  new Casa("Branco");
				matrizCasas[i][j].setPeca(new PecaNull());

            }
		
    }

    private void adicionarBotao(Icon img, int x, int y){
		JButton botao = new JButton(img);  
		botao.setBounds(x * 100, y * 100, 100, 100);
		matrizCasas[x][y].setBotao(botao);
	}

    public boolean posicaoInicialTabuleiro(){
        
        for (int i = 0; i < 8; i++) {
			for (int j = 2; j < 6; j++) {
				if((i + j) % 2 == 0){
                    adicionarBotao(casaBranca, i, j);
				}else{
					adicionarBotao(casaPreta, i, j);
				}				
			}
		}
		
		// adicionando peão preto
		for (int i = 0; i < 8; i++) {
			if(i % 2 == 0){
				adicionarBotao(peaoPretoCasaPreta, i, 1);
			}else{
				adicionarBotao(peaoPretoCasaBranca, i, 1);
			}
			matrizCasas[i][1].setPeca(new Peao("preto", new Coordenada(i, 1)));
		}
		for (int i = 0; i < 8; i++) {
			if(i % 2 == 0){
				adicionarBotao(peaoBrancoCasaBranca, i, 6);
			}else{
				adicionarBotao(peaoBrancoCasaPreta, i, 6);
			}
			matrizCasas[i][6].setPeca(new Peao("branco", new Coordenada(i, 6)));


		}

		
		adicionarBotao(torrePretaCasaBranca, 0, 0);
		matrizCasas[0][0].setPeca(new Torre("preto", new Coordenada(0, 0)));

		adicionarBotao(torrePretaCasaPreta, 7, 0);
		matrizCasas[7][0].setPeca(new Torre("preto", new Coordenada(7, 0)));

		adicionarBotao(torreBrancaCasaPreta, 0, 7);
		matrizCasas[0][7].setPeca(new Torre("branca", new Coordenada(0, 7)));

		adicionarBotao(torreBrancaCasaBranca, 7, 7);
		matrizCasas[7][7].setPeca(new Torre("branca", new Coordenada(7, 7)));

		adicionarBotao(cavaloPretoCasaPreta, 1, 0);
		matrizCasas[1][0].setPeca(new Cavalo("preto", new Coordenada(1, 0)));

		adicionarBotao(cavaloPretoCasaBranca, 6, 0);
		matrizCasas[6][0].setPeca(new Cavalo("preto", new Coordenada(6, 0)));

		adicionarBotao(cavaloBrancoCasaBranca, 1, 7);
		matrizCasas[1][7].setPeca(new Cavalo("branco", new Coordenada(1, 7)));

		adicionarBotao(cavaloBrancoCasaPreta, 6, 7);
		matrizCasas[6][7].setPeca(new Cavalo("branco", new Coordenada(6, 7)));

		adicionarBotao(bispoPretoCasaBranca, 2, 0);
		matrizCasas[2][0].setPeca(new Bispo("preto", new Coordenada(2, 0)));

		adicionarBotao(bispoPretoCasaPreta, 5, 0);
		matrizCasas[5][0].setPeca(new Bispo("preto", new Coordenada(5, 0)));

		adicionarBotao(bispoBrancoCasaPreta, 2, 7);
		matrizCasas[2][7].setPeca(new Bispo("branco", new Coordenada(2, 7)));
		
		adicionarBotao(bispoBrancoCasaBranca, 5, 7);
		matrizCasas[5][7].setPeca(new Bispo("branco", new Coordenada(5, 7)));
		
		adicionarBotao(rainhaPretaCasaPreta, 3, 0);
		matrizCasas[3][0].setPeca(new Rainha("preto", new Coordenada(3, 0)));
		
		adicionarBotao(rainhaBrancaCasaBranca, 3, 7);	
		matrizCasas[3][7].setPeca(new Rainha("branca", new Coordenada(3, 7)));
		
		adicionarBotao(reiPretoCasaBranca, 4, 0);
		matrizCasas[4][0].setPeca(new Rei("preto", new Coordenada(4, 0)));
		
		adicionarBotao(reiBrancoCasaPreta, 4, 7);
		matrizCasas[4][7].setPeca(new Rei("branco", new Coordenada(4, 0)));
		
        return true;
    }
	
    public Casa getCasa(int x, int y){
        return matrizCasas[x][y];
    }

}
