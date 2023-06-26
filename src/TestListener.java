import java.awt.event.*;
import java.util.ArrayList;

public class TestListener implements ActionListener{
    private Casa casa;
    private Tabuleiro tabuleiro;
    private static ArrayList<Coordenada> listaMovimentos = null;
    private static Casa casaSelecionada = null;

    public TestListener (Casa casa, Tabuleiro tabuleiro){
        this.casa = casa;
        this.tabuleiro = tabuleiro;
    }

    public void actionPerformed(ActionEvent ev){
        if (casaSelecionada == null){
            Peca peca = casa.getPeca();
            String tipo  = peca.getTag();
            if(peca != null)
                casaSelecionada = casa;
            if(tipo.equals("peao")){
                System.out.println("Peao");
                listaMovimentos = ((Peao)peca).getPossiveisMovimentos(tabuleiro);
            }
            else if(tipo.equals("torre")){
                System.out.println("Torre");
                listaMovimentos = ((Torre)peca).getPossiveisMovimentos(tabuleiro);     
            }
            else if(tipo.equals("cavalo")){
                System.out.println("Cavalo");
                listaMovimentos = ((Cavalo)peca).getPossiveisMovimentos(tabuleiro);
            }
            else if(tipo.equals("bispo")){
                System.out.println("Bispo"); 
                listaMovimentos = ((Bispo)peca).getPossiveisMovimentos(tabuleiro);     
            }
            else if(tipo.equals("rainha")){
                System.out.println("Rainha");
                listaMovimentos = ((Rainha)peca).getPossiveisMovimentos(tabuleiro);
            }
            else if(tipo.equals("rei")){
                System.out.println("Rei");
                listaMovimentos = ((Rei)peca).getPossiveisMovimentos(tabuleiro);  
            }
        }
        else{
            Coordenada localCasaAtual = casa.getCoordenada();
            for(Coordenada coord: listaMovimentos){
                if(localCasaAtual.x() == coord.x() && localCasaAtual.y() == coord.y()){
                    System.out.println("Local valido");
                    casa.getBotao().setIcon(casaSelecionada.getBotao().getIcon());
                    tabuleiro.adicionarIconeCasa(casaSelecionada);
                    break;
                }

            }

            casaSelecionada = null;
        }

    }

    public ArrayList<Coordenada> getListaMovimentos() {

        return listaMovimentos;
    }

}
