package adivinhacao;

import adivinhacao.gui.PerderSolo;
import adivinhacao.gui.*;
import adivinhacao.gui.ganhar.*;
import java.awt.Color;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Adivinhacao extends Perguntas
{
    private final Jogador[] j = {new Jogador(), new Jogador()};
    private final JogoSolo frm_js = new JogoSolo();
    private final JogoMult frm_jm = new JogoMult();
    private boolean turno_j1 = true, mult = false;
    private int perg_atual, tema;
    
    public Adivinhacao()
    {
        TelaInicial frm_tl = new TelaInicial();
        
        frm_tl.setVisible(true);
        frm_js.lbl_txtRevelar.setForeground(Color.decode("#333333"));
        frm_js.lbl_txtRevelar.setText(revelar());
        
        frm_jm.lbl_txtRevelar.setForeground(Color.decode("#333333"));
        frm_jm.lbl_txtRevelar.setText(revelar());
        
        // Quando o botão solo for pressionado...
        frm_tl.btn_play.addActionListener((e) ->
        {
            // Deixará a tela inicial invisível e repassará ao sistema o valor do tema.
            frm_tl.setVisible(false);
            setTema(frm_tl.cb_tema.getSelectedIndex());
            
            // Mostrará depois a tela do jogo.
            frm_js.setVisible(true);
            
            jogar();
        });
        
        // Quando o botão multiplayer for pressionado...
        frm_tl.btn_mult.addActionListener((e) ->
        {
            // Diz à classe que o jogo está multiplayer.
            setMult(true);
            frm_tl.setVisible(false);
            
            // Mostra a tela para decidir os nomes.
            NomeJogadores frm_nj = new NomeJogadores();
            frm_nj.setVisible(true);
            
            // Espera confirmar para começar a jogar.
            frm_nj.btn_confirmar.addActionListener((l) ->
            {
                j[0].setNome(frm_nj.txf_nome_j1.getText());
                j[1].setNome(frm_nj.txf_nome_j2.getText());
                
                frm_nj.setVisible(false);
                frm_jm.setVisible(true);
                
                jogar();
                
                byte vez = 0;

                if (!isTurnoJ1())
                    vez = 1;

                frm_jm.lbl_txtTurno.setText("VEZ DE " + j[vez].getNome());
            });
        });
        
        // Quando o botão revelar for pressionado.
        frm_js.btn_revelar.addActionListener((e) ->
        {
            frm_js.lbl_txtRevelar.setForeground(Color.decode("#cccccc")); 
        });
        
        // Botão de revelar do multiplayer também funcionará.
        frm_jm.btn_revelar.addActionListener((e) ->
        {
            frm_jm.lbl_txtRevelar.setForeground(Color.decode("#cccccc"));
        }); 
        
        frm_js.btn_pular.addActionListener((e) ->
        {
            pularPergunta();
        });
    }
    
    // Setters
    private void setTurnoJ1(boolean turno) 
    { this.turno_j1 = turno; }

    private void setMult(boolean mult)
    { this.mult = mult; }
    
    private void setPergAtual(int perg_atual)
    { this.perg_atual = perg_atual; }
    
    private void setTema(int tema)
    { this.tema = tema; }

    // Getters
    public boolean isTurnoJ1() 
    { return turno_j1; }

    public boolean isMult()
    { return mult; }
    
    public int getPergAtual()
    { return perg_atual; }
    
    public int getTema()
    { return tema; }
    
    // Métodos
    public boolean verificarResposta()
    {
        String resp = frm_js.txf_resposta.getText().toLowerCase().strip();
        
        if (isMult())
            resp = frm_jm.txf_resposta.getText().toLowerCase().strip();
        
        String n = Normalizer.normalize(resp, Normalizer.Form.NFD);
        Pattern p = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        
        p.matcher(n).replaceAll("");
        return p.matcher(n).replaceAll("")
                .equals(respostas[getTema()][getPergAtual()]);
    }
    
    // Retorna metade da palavra, o resto das letras ficará como "_".
    private String revelar()
    {
        String metade = "";
        char[] resp = respostas[getTema()][getPergAtual()].toCharArray();
        
        for (int i = 0; i < resp.length; i++)
        {
            if (i % 2 != 0)
                metade += resp[i];
            
            else
                metade += "_";
        }
        
        return metade.toUpperCase();
    }
    
    private void acertar()
    {
        byte vez = 0;

        if (!isTurnoJ1())
            vez = 1;

        // +50 pontos.
        j[vez].alterarPontos(50);

        // +1 vida.
        if (j[vez].getVidas() < 5)
            j[vez].alterarVidas(1);

        // Altera a pergunta e limpa o campo de revelar meia palavra.
        if (getPergAtual() < 8)
        {
            setPergAtual(getPergAtual() + 1);
            frm_js.lbl_txtRevelar.setForeground(Color.decode("#333333"));
            frm_js.lbl_txtRevelar.setText(revelar());
            
            if (isMult())
            {
                frm_jm.lbl_txtRevelar.setForeground(Color.decode("#333333"));
                frm_jm.lbl_txtRevelar.setText(revelar());
            }
        }

        // Caso não haja mais perguntas, o jogador vence!
        else
            ganhar();

        // Apaga a resposta.
        frm_js.txf_resposta.setText("");
        frm_jm.txf_resposta.setText("");
        
        fazerPergunta();
        dadosJogador();
    }
    
    private void errar()
    {
        int vez = 0;
        
        if (!isTurnoJ1())
            vez = 1;
        
        // -25 pontos.
        j[vez].alterarPontos(-25);

        // -1 vida.
        if (j[vez].getVidas() > 1)
            j[vez].alterarVidas(-1);

        // Caso não tenha mais vidas, o jogador perde!
        else
        {
            // Vai ganhar um dos jogadores, por isso ele é chamado,
            // não há como empatar, armei tudo para que isso fosse impossível :v
            if (isMult())
                ganhar();
            
            else
                perder();
        }

        // Apaga a resposta.
        frm_js.txf_resposta.setText("");
        frm_jm.txf_resposta.setText("");

        dadosJogador();
    }
    
    private void perder()
    {
        if (!isMult())
        {
            PerderSolo ps = new PerderSolo();
            
            frm_js.setVisible(false);
            
            ps.setVisible(true);
            
            ps.lbl_qntPontos.setText("" + j[0].getPontos());
            ps.lbl_qntPulos.setText("" + j[0].getPulos());
        }
    }
    
    private void ganhar()
    {
        if (!isMult())
        {
            GanharSolo gs = new GanharSolo();
        
            frm_js.setVisible(false);

            gs.setVisible(true);

            gs.lbl_qntPontos.setText("" + j[0].getPontos());
            gs.lbl_qntPulos.setText("" + j[0].getPulos());
            gs.lbl_qntVidas.setText("" + j[0].getVidas());
        }
        
        else
        {
            GanharMult gm = new GanharMult();
            
            frm_jm.setVisible(false);
            
            gm.setVisible(true);
            
            byte vez = 0;
            
            if (j[0].getPontos() < j[1].getPontos())
                vez = 1;
            
            gm.lbl_txtTitulo.setText(j[vez].getNome() + " VENCEU :D");
            
            gm.lbl_nome_j1.setText(j[0].getNome());
            gm.lbl_qntPontosJ1.setText("" + j[0].getPontos());
            gm.lbl_qntVidasJ1.setText("" + j[0].getVidas());
            
            gm.lbl_nome_j2.setText(j[1].getNome());
            gm.lbl_qntPontosJ2.setText("" + j[1].getPontos());
            gm.lbl_qntVidasJ2.setText("" + j[1].getVidas());
        }
    }
    
    
    
    private void dadosJogador()
    {
        if (!isMult())
        {
            frm_js.lbl_qntPontos.setText("" + j[0].getPontos());
            frm_js.lbl_qntVidas.setText("" + j[0].getVidas());
            frm_js.lbl_qntPulos.setText("" + j[0].getPulos());
        }
        
        else
        {
            frm_jm.lbl_txtNomeJ1.setText("" + j[0].getNome());
            frm_jm.lbl_qntPontosJ1.setText("" + j[0].getPontos());
            frm_jm.lbl_qntVidasJ1.setText("" + j[0].getVidas());
            
            frm_jm.lbl_txtNomeJ2.setText("" + j[1].getNome());
            frm_jm.lbl_qntPontosJ2.setText("" + j[1].getPontos());
            frm_jm.lbl_qntVidasJ2.setText("" + j[1].getVidas());
        }
    }
    
    private void fazerPergunta()
    { 
        frm_js.txa_pergunta.setText(perguntas[getTema()][getPergAtual()]);
        frm_jm.txa_pergunta.setText(perguntas[getTema()][getPergAtual()]);
    }
    
    private void alternarVez()
    {
        setTurnoJ1(!isTurnoJ1());
        
        byte vez = 0;

        if (!isTurnoJ1())
            vez = 1;

        frm_jm.lbl_txtTurno.setText("VEZ DE " + j[vez].getNome());
    }
    
    private void pularPergunta()
    {
        if (j[0].getPulos() > 0 && getPergAtual() < 8)
        {
            setPergAtual(getPergAtual() + 1);
            j[0].alterarPulos(-1);
            
            frm_js.lbl_txtRevelar.setForeground(Color.decode("#333333"));
            frm_js.lbl_txtRevelar.setText(revelar());
            frm_js.txf_resposta.setText("");

            fazerPergunta();
            dadosJogador();
        }
        
    }
    
    // Método para jogar.
    private void jogar()
    {
        dadosJogador();
        fazerPergunta();
        
        // Quando o jogador tentar responder.
        frm_js.btn_resposta.addActionListener((e) ->
        {
            // Checa a resposta.
            if (verificarResposta())
                acertar();

            else
                errar();
        });
        
        if (isMult())
        {
            frm_jm.btn_resposta.addActionListener((e) ->
            {
                // Checa a resposta.
                if (verificarResposta())
                    acertar();

                else
                    errar();
                
                alternarVez();
            });
        }
    }
}
