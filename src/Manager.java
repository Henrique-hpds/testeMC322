import javax.swing.JButton;   
import javax.swing.JFrame;
import java.awt.event.*;

public class Manager{

    private JFrame tela;
    private Tabuleiro tabuleiro;

	private Perfil jogadorBrancas, jogadorPretas;
    private int pontuacaoBrancas, pontuacaoPretas;
    
    public Manager(){
        tela = new JFrame();
		tela.setSize(800, 800);
        tabuleiro = new Tabuleiro();
		tabuleiro.posicaoInicialTabuleiro();

		for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++){
				Casa casa = tabuleiro.getCasa(i, j);
				JButton botao = casa.getBotao();
				Peca peca = casa.getPeca();

				if(peca.getTag().equals("peao")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("peao");
							for(Coordenada coord: ((Peao)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else if(peca.getTag().equals("torre")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("torre");
							for(Coordenada coord: ((Torre)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else if(peca.getTag().equals("cavalo")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("cavalo");
							for(Coordenada coord: ((Cavalo)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else if(peca.getTag().equals("bispo")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("bispo");
							for(Coordenada coord: ((Bispo)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else if(peca.getTag().equals("rainha")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("rainha");
							for(Coordenada coord: ((Rainha)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else if(peca.getTag().equals("rei")){
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("rei");
							for(Coordenada coord: ((Rei)peca).getPossiveisMovimentos(tabuleiro)){
								System.out.println(coord.toString());
							}
						}
					});
				}
				else{
					botao.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("Outra Peça");
						}
					});
				}
				tela.add(botao);
			}
    }

    public JFrame getTela(){
        return tela;
    }

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

}