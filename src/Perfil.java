import java.io.Serializable;

public class Perfil implements Entidade, Serializable {
    private static final long serialVersionUID = 100L;
    private String username;
    private int vitorias, derrotas, empates;
    private Dictionary<Perfil, Integer> placares; // Adversário: João -> Vitórias: 2


    public Perfil(String username){
        this.username = username;
        this.placares = new Hashtable<>();
        vitorias = derrotas = empates = 0;
    }
    
    public boolean criar(){
        return true;
    }

    public boolean destruir(){
        return true;
    }

    public double getTaxaVitoria(){
        if (vitorias + derrotas + empates == 0)
            return 0;
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

    public Dictionary<Perfil,Integer> getPlacares(){
        return placares;
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

    // adiciona uma vitória ao placar relativo a outro player
    public void adicionarPlacar(Perfil oponente){
        placares.put(oponente, placares.get(oponente) + 1);
    }


}
