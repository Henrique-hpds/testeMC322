import java.io.Serializable;

public class Perfil implements Entidade, Serializable {
    private static final long serialVersionUID = 100L;
    private String username;
    private int vitorias, derrotas, empates;

    public Perfil(String username){
        this.username = username;
        vitorias = derrotas = empates = 0;
    }
    
    public boolean criar(){
        return true;
    }

    public boolean destruir(){
        return true;
    }

    public double getTaxaVitoria(){
        return (vitorias) / (vitorias + derrotas + empates);
    }

    public String getUsername(){
        return username;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getEmpates(){
        return empates;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void adicionarVitoria(){
        vitorias++;
    }

    public void adicionarEmpate(){
        empates++;
    }

    public void adicionarDerrota(){
        derrotas++;
    }



}
