import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaJogadores extends JFrame implements ActionListener {

    private JComboBox<String> opcoesBranco, opcoesPreto;
    private JButton botaoOK;
    private JLabel textoPrincipal, textoJogadorBranco, textoJogadorPreto;
    private JFrame tela = new JFrame("Escolha de Jogadores");
    private String nomeEscolhido;


    private ArrayList<Perfil> listaJogadores = Leitura.lerPossiveisJogadores();
    private String[] listaJogadoresString = new String[listaJogadores.size()];

    private Perfil getPerfilPorNome(String nome){
        for (Perfil atual : listaJogadores)
            if(atual.getUsername().equals(nome))
                return atual;

        return new Perfil("");
    }

    public TelaJogadores(){

        tela.getContentPane().setBackground(new java.awt.Color(238, 238, 210));

        int i = 0;
        for (Perfil atual : listaJogadores)
            listaJogadoresString[i++] = atual.getUsername();

        opcoesBranco = new JComboBox<String>(listaJogadoresString);
        opcoesPreto = new JComboBox<String>(listaJogadoresString);
        
	    textoJogadorBranco = new JLabel("<html>Vitorias: " + listaJogadores.get(0).getVitorias() + "<br>Derrotas: " + listaJogadores.get(0).getDerrotas() + "<br>Empates: " + listaJogadores.get(0).getEmpates() + "<br>Taxa Vitoria: " + listaJogadores.get(0).getTaxaVitoria() * 100 + "%</html>");
        textoJogadorPreto = new JLabel("<html>Vitorias: " + listaJogadores.get(0).getVitorias() + "<br>Derrotas: " + listaJogadores.get(0).getDerrotas() + "<br>Empates: " + listaJogadores.get(0).getEmpates() + "<br>Taxa Vitoria: " + listaJogadores.get(0).getTaxaVitoria() * 100 + "%</html>");

	
	    opcoesBranco.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ev){
                Perfil perfil = getPerfilPorNome((String)opcoesBranco.getSelectedItem());
                textoJogadorBranco.setText("<html>Vitorias: " + perfil.getVitorias() + "<br>Derrotas: " + perfil.getDerrotas() + "<br>Empates: " + perfil.getEmpates() + "<br>Taxa Vitoria: " + perfil.getTaxaVitoria() * 100 + "%</html>");
            }
        });

        opcoesPreto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ev){
                Perfil perfil = getPerfilPorNome((String)opcoesPreto.getSelectedItem());
                textoJogadorPreto.setText("<html>Vitorias: " + perfil.getVitorias() + "<br>Derrotas: " + perfil.getDerrotas() + "<br>Empates: " + perfil.getEmpates() + "<br>Taxa Vitoria: " + perfil.getTaxaVitoria() * 100 + "%</html>");
            }
        });
   
        botaoOK = new JButton("OK");
        botaoOK.addActionListener(this);

textoPrincipal = new JLabel("Escolha o nome do jogador");
	    
	    JButton botaoCriarConta = new JButton("Criar Conta");
        JTextField caixaTextoUsername = new JTextField("Digite um Username");
        JLabel textoCriarConta = new JLabel("Não possui uma conta? Crie aqui!");
        JLabel textoContaCriada = new JLabel("Conta criada com sucesso!");
        textoContaCriada.setVisible(false);
        textoCriarConta.setFont(new Font("Dialog", Font.CENTER_BASELINE,  10));;
        caixaTextoUsername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent ev){
                caixaTextoUsername.setText("");
                textoContaCriada.setVisible(false);
            }
  
            public void focusLost(FocusEvent ev){
            }
        });
	    
        botaoCriarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                nomeEscolhido = caixaTextoUsername.getText();
                if(nomeEscolhido.equals("Digite um Username") || nomeEscolhido.equals("") || nomeEscolhido.equals("\n"))
                    return;
                
		for (String atual : listaJogadoresString) {
                    if(atual.equals(nomeEscolhido)){
                        textoCriarConta.setText("Username indisponivel. Tente Novamente!");
                        caixaTextoUsername.setText("Digite um Username");
                        return;
                    }
                }
		
                Leitura.gravarPerfil(new Perfil(nomeEscolhido));
                listaJogadores = Leitura.lerPossiveisJogadores();

                listaJogadoresString = new String[listaJogadores.size()];
		    
                int i = 0;
                for (Perfil atual : listaJogadores)
                    listaJogadoresString[i++] = atual.getUsername();
                
                opcoesBranco.addItem(listaJogadoresString[listaJogadores.size() - 1]);
                opcoesPreto.addItem(listaJogadoresString[listaJogadores.size() - 1]);
		    
                textoCriarConta.setText("Não possui uma conta? Crie aqui!");
                textoContaCriada.setVisible(true);
            }
        });
	    
        textoPrincipal.setBounds(150, 50, 400, 100);
        opcoesBranco.setBounds(100, 130, 150, 50);
        opcoesPreto.setBounds(300, 130, 150, 50);
        botaoOK.setBounds(500, 130, 70, 70);
        textoJogadorBranco.setBounds(100, 170, 150, 100);
        textoJogadorPreto.setBounds(300, 170, 150, 100);
        textoCriarConta.setBounds(180, 335, 300, 20);
        caixaTextoUsername.setBounds(180,365, 200, 30);
        botaoCriarConta.setBounds(400, 355, 150, 50);
        textoContaCriada.setBounds(200, 400, 200, 30);
	    
        textoPrincipal.setFont(new Font("Verdana", Font.BOLD, 18));

	    
        tela.add(opcoesPreto);
        tela.add(opcoesBranco);
	    tela.add(textoJogadorBranco);
        tela.add(textoJogadorPreto);
        tela.add(textoPrincipal);
        tela.add(botaoOK);
        tela.add(botaoCriarConta);
        tela.add(botaoCriarConta);
        tela.add(caixaTextoUsername);
        tela.add(textoCriarConta);
        tela.add(textoContaCriada);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.setSize(700,700);    
		tela.setLayout(null);
		tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev){
        if(opcoesPreto.getSelectedItem().hashCode() == opcoesBranco.getSelectedItem().hashCode()){
            textoPrincipal.setText("Opção Inválida (Jogadores Iguais)");
            return;
        }
        
        String jBrancasString, jPretasString;
    	Perfil jBrancas = null, jPretas = null;

        jBrancasString = (String)opcoesBranco.getSelectedItem();
        jPretasString = (String)opcoesPreto.getSelectedItem();

        for (Perfil atual : listaJogadores) {
            if(atual.getUsername().equals(jBrancasString)){
                jBrancas = atual;
            }if(atual.getUsername().equals(jPretasString)){
                jPretas = atual;
            }

        tela.setVisible(false);

        try{
            new Manager(jBrancas, jPretas);
        }catch(NullPointerException ex){
            return;
        }
        }
    }
}
