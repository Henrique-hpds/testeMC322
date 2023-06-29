import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.ArrayList;
public class Tabuleiro {
	private String jogador = "branco";
	// private boolean foiChamada = false;
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
                    matrizCasas[i][j] =  new Casa("branca", i, j);
				else
					matrizCasas[i][j] =  new Casa("preta",  i, j);
				matrizCasas[i][j].setPeca(null);
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
		matrizCasas[0][7].setPeca(new Torre("branco", new Coordenada(0, 7)));

		adicionarBotao(torreBrancaCasaBranca, 7, 7);
		matrizCasas[7][7].setPeca(new Torre("branco", new Coordenada(7, 7)));

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
		matrizCasas[3][7].setPeca(new Rainha("branco", new Coordenada(3, 7)));
		
		adicionarBotao(reiPretoCasaBranca, 4, 0);
		matrizCasas[4][0].setPeca(new Rei("preto", new Coordenada(4, 0)));
		
		adicionarBotao(reiBrancoCasaPreta, 4, 7);
		matrizCasas[4][7].setPeca(new Rei("branco", new Coordenada(4, 7)));
		
        return true;
    }
	
    public Casa getCasa(int x, int y){
        return matrizCasas[x][y];
    }

	public void adicionarIconeCasa(Casa casa){
		int i = casa.getCoordenada().x();
		int j = casa.getCoordenada().y();
		if((i + j) % 2 == 0)
		 	casa.getBotao().setIcon(casaBranca);
		else
		 	casa.getBotao().setIcon(casaPreta);

	}

	public void trocarIcone(Peca peca, Casa casa){
		if(peca.getTag().equals("peao")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(peaoPretoCasaPreta);
				else
					casa.getBotao().setIcon(peaoPretoCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(peaoBrancoCasaPreta);
				else
					casa.getBotao().setIcon(peaoBrancoCasaBranca);
			}
		}
		else if(peca.getTag().equals("cavalo")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(cavaloPretoCasaPreta);
				else
					casa.getBotao().setIcon(cavaloPretoCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(cavaloBrancoCasaPreta);
				else
					casa.getBotao().setIcon(cavaloBrancoCasaBranca);
			}
		}
		else if(peca.getTag().equals("bispo")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(bispoPretoCasaPreta);
				else
					casa.getBotao().setIcon(bispoPretoCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(bispoBrancoCasaPreta);
				else
					casa.getBotao().setIcon(bispoBrancoCasaBranca);
			}
		}
		else if(peca.getTag().equals("torre")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(torrePretaCasaPreta);
				else
					casa.getBotao().setIcon(torrePretaCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(torreBrancaCasaPreta);
				else
					casa.getBotao().setIcon(torreBrancaCasaBranca);
			}
		}
		else if(peca.getTag().equals("rainha")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(rainhaPretaCasaPreta);
				else
					casa.getBotao().setIcon(rainhaPretaCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(rainhaBrancaCasaPreta);
				else
					casa.getBotao().setIcon(rainhaBrancaCasaBranca);
			}
		}
		else if(peca.getTag().equals("rei")){
			if(peca.getCor().equals("preto")){
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(reiPretoCasaPreta);
				else
					casa.getBotao().setIcon(reiPretoCasaBranca);
			}
			else{
				if(casa.getCor().equals("preta"))
					casa.getBotao().setIcon(reiBrancoCasaPreta);
				else
					casa.getBotao().setIcon(reiBrancoCasaBranca);
			}
		}
	}

	public void movimentosValidos(Casa casa){
	    Peca peca = casa.getPeca();
		if(peca != null){
			if(peca.getCor().equals(jogador)){
				String tipo = peca.getTag();
				Listener.setCasaOrigem(casa);
				if(tipo.equals("peao")){
					System.out.println("Peao");
					Listener.setListaMovimentos(((Peao)peca).getPossiveisMovimentos(this));
				}
				else if(tipo.equals("torre")){
					System.out.println("Torre");
					Listener.setListaMovimentos(((Torre)peca).getPossiveisMovimentos(this));     
				}
				else if(tipo.equals("cavalo")){
					System.out.println("Cavalo");
					Listener.setListaMovimentos(((Cavalo)peca).getPossiveisMovimentos(this));
				}
				else if(tipo.equals("bispo")){
					System.out.println("Bispo"); 
					Listener.setListaMovimentos(((Bispo)peca).getPossiveisMovimentos(this));     
				}
				else if(tipo.equals("rainha")){
					System.out.println("Rainha");
					Listener.setListaMovimentos(((Rainha)peca).getPossiveisMovimentos(this));
				}
				else if(tipo.equals("rei")){
					System.out.println("Rei");
					((Rei)peca).setSelecionado(true);
					Listener.setListaMovimentos(((Rei)peca).getPossiveisMovimentos(this));  
				}
			}  

		}
	}  

	public boolean moverPeca(Casa origem, Casa destino, ArrayList<Coordenada> listaMovimentos){
		Coordenada coordDestino = destino.getCoordenada();
		for(Coordenada coord: listaMovimentos){
			if(coordDestino.x() == coord.x() && coordDestino.y() == coord.y()){
				System.out.println("Local valido");

				// destino.getBotao().setIcon(origem.getBotao().getIcon());
				this.trocarIcone(origem.getPeca(), destino);
				this.adicionarIconeCasa(origem);
				if(destino.getPeca() instanceof Rei){
					Manager.gameOver(destino.getPeca().getCor());
				}
				destino.setPeca(origem.getPeca());
				origem.setPeca(null);

				destino.getPeca().setPosicao(destino.getCoordenada());
				if(destino.getPeca().getTag().equals("peao")) // Caso especial para o peao
					((Peao)destino.getPeca()).setPrimeiraJogada(false);

				else if(destino.getPeca().getTag().equals("rei"))
					((Rei)destino.getPeca()).setSelecionado(false);

				if (destino.getPeca().getCor().equals("branco"))
					jogador = "preto";
				else
					jogador = "branco";
				return true;
			}
		}
		return true;
	}

	public ArrayList<Coordenada> todoMovimentosJogador(String jogador){
		ArrayList<Coordenada> listaMovimentos = new ArrayList<Coordenada>();
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(getCasa(i, j).estaOcupado() && getCasa(i, j).getPeca().getCor().equals(jogador)){
					Peca peca = getCasa(i, j).getPeca();						
					String tipo = peca.getTag();

					if(tipo.equals("peao")){
						for(Coordenada movimento: ((Peao)peca).getPossiveisMovimentos(this))							
							listaMovimentos.add( movimento);
					}
					else if(tipo.equals("torre")){
						for(Coordenada movimento:((Torre)peca).getPossiveisMovimentos(this))
							listaMovimentos.add( movimento);     
					}
					else if(tipo.equals("cavalo")){
						for(Coordenada movimento:((Cavalo)peca).getPossiveisMovimentos(this))
							listaMovimentos.add( movimento);
					}
					else if(tipo.equals("bispo")){
						for(Coordenada movimento:((Bispo)peca).getPossiveisMovimentos(this))
							listaMovimentos.add( movimento); 
					}
					else if(tipo.equals("rainha")){
						for(Coordenada movimento:((Rainha)peca).getPossiveisMovimentos(this))
							listaMovimentos.add( movimento);
					}
					else if(tipo.equals("rei")){
						if(!((Rei)peca).isSelecionado())
							for(Coordenada movimento:((Rei)peca).getPossiveisMovimentos(this))
								listaMovimentos.add( movimento);
						else{
							((Rei)peca).setSelecionado(false);
						}
					}
				}
			}
		}
		// else{
		// 	foiChamada = false;

		// }
		System.out.print(listaMovimentos);
		return listaMovimentos;
	}

}
