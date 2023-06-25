import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaJogadores extends JFrame implements ActionListener {

    private Perfil jBrancas, jPretas;
    private JComboBox<String> opcoesBranco, opcoesPreto;
    private JButton botaoOK;
    private JLabel texto;
    private JFrame tela = new JFrame("Escolha de Jogadores");


    private ArrayList<Perfil> listaJogadores = Leitura.lerPossiveisJogadores();

    public TelaJogadores(){

        tela.getContentPane().setBackground(new java.awt.Color(238, 238, 210));

        String[] listaJogadoresString = new String[listaJogadores.size()];

        int i = 0;
        for (Perfil atual : listaJogadores)
            listaJogadoresString[i++] = atual.getUsername();

        opcoesBranco = new JComboBox<String>(listaJogadoresString);
        opcoesPreto = new JComboBox<String>(listaJogadoresString);
        
        opcoesBranco.setBounds(100, 100, 100, 100);
        opcoesPreto.setBounds(300, 100, 100, 100);

        botaoOK = new JButton("OK");
        botaoOK.setBounds(150, 300, 100, 100);
        botaoOK.addActionListener(this);

        texto = new JLabel("Escolha o nome do jogador");
        texto.setBounds(200, 200, 400, 100);


        tela.add(opcoesPreto);
        tela.add(opcoesBranco);
        tela.add(botaoOK);
        tela.add(texto);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.setSize(700,700);    
		tela.setLayout(null);
		tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev){
        if(opcoesPreto.getSelectedItem().hashCode() == opcoesBranco.getSelectedItem().hashCode()){
            texto.setText("Opção Inválida (Jogadores Iguais)");
            return;
        }
        
        String jBrancasString, jPretasString;

        jBrancasString = (String)opcoesBranco.getSelectedItem();
        jPretasString = (String)opcoesPreto.getSelectedItem();

        System.out.println("1 - " + jBrancasString);
        System.out.println("2 - " + jPretasString);

        for (Perfil atual : listaJogadores) {
            System.out.println(atual.getUsername());
            if(atual.getUsername().equals(jBrancasString)){
                jBrancas = atual;
            }else if(atual.getUsername().equals(jPretasString)){
                jPretas = atual;
            }

        Manager jogo = new Manager();
        jogo.getTela().setVisible(true);
        tela.setVisible(false);

        }


    }

    public Perfil getJBrancas(){
        
        return jBrancas;
    }

    public Perfil getJPretas(){
        return jPretas;
    }
}
