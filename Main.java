public class Main {  
    public static void main(String[] args) {  

		Maneger jogo = new Maneger();		

		jogo.iniciarTabuleiro();



		
		jogo.getTela().setSize(2000,2000);  
		jogo.getTela().setLayout(null);
		jogo.getTela().setVisible(true);  
	}  
}  