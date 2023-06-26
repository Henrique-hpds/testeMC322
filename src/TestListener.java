import java.awt.event.*;
import java.util.ArrayList;

public class TestListener implements ActionListener{
    private Casa casa;
    private Tabuleiro tabuleiro;
    private ArrayList<Coordenada> listaMovimentos;

    public TestListener (Casa casa, Tabuleiro tabuleiro){
        this.casa = casa;
        this.tabuleiro = tabuleiro;
        this.listaMovimentos = new ArrayList<Coordenada>();
    }

    public void actionPerformed(ActionEvent ev){
        Peca peca = casa.getPeca();
        String tipo  = peca.getTag();
        if(tipo.equals("peao")){
            System.out.println("Peao");
            listaMovimentos = ((Peao)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);
        }
        else if(tipo.equals("torre")){
            System.out.println("Torre");
            listaMovimentos = ((Torre)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);        
        }
        else if(tipo.equals("cavalo")){
            System.out.println("Cavalo");
            listaMovimentos = ((Cavalo)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);
        }
        else if(tipo.equals("bispo")){
            System.out.println("Bispo"); 
            listaMovimentos = ((Bispo)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);        
        }
        else if(tipo.equals("rainha")){
            System.out.println("Rainha");
            listaMovimentos = ((Rainha)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);
        }
        else if(tipo.equals("rei")){
            System.out.println("Rei");
            listaMovimentos = ((Rei)peca).getPossiveisMovimentos(tabuleiro);
            tabuleiro.moverPeca(casa, listaMovimentos);     
        }
    }

    public ArrayList<Coordenada> getListaMovimentos() {
        return listaMovimentos;
    }

}
