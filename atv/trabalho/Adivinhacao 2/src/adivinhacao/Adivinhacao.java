package adivinhacao;

import adivinhacao.gui.*;

public class Adivinhacao extends Perguntas
{
    private Jogador[] j = {new Jogador(), new Jogador()};
    private boolean turno = false, mult = false;
    
    public Adivinhacao()
    {
        GUI frm_g = new GUI();
        
        frm_g.setVisible(true);
        
        // Quando o botão do painel inicial for pressionado...
        frm_g.btn_play.addActionListener((e) ->
        {
            JogoSolo pnl_js = new JogoSolo();
            
            // Retira o menu inicial.
            frm_g.pnl_tela_inicial.setVisible(false);
            
            // Configura o painel do jogo.
            pnl_js.setVisible(true);
            pnl_js.setBounds(0, 0, 32767, 32767);
            
            /* Atribui as características do jogador.
            pnl_js.lbl_qntPontos.setText("" + j[0].getPontos());
            pnl_js.lbl_qntPulos.setText("" + j[0].getPulos());
            pnl_js.lbl_qntVidas.setText("" + j[0].getVidas());*/
            pnl_js.txa_perg.setText(perguntas[0][0]);
            
            // Adiciona o painel.
            frm_g.add(pnl_js);
        });
        
        // Quando o botão multiplayer for pressionado.;;
        frm_g.btn_mult.addActionListener((e) ->
        {
            JogoMult pnl_jm = new JogoMult();
            
            // Retira o menu inicial.
            frm_g.pnl_tela_inicial.setVisible(false);
            
            // Configura o painel do jogo.
            pnl_jm.setVisible(true);
            pnl_jm.setBounds(0, 0, 32767, 32767);
            
            // Adiciona o painel.
            frm_g.add(pnl_jm);
            
            // Diz para a classe que o jogo é multiplayer.
            setMult(true);
        });
    }
    
    // Setters
    private void setTurno(boolean turno) 
    { this.turno = turno; }

    private void setMult(boolean mult)
    { this.mult = mult; }

    // Getters
    public boolean isTurno() 
    { return turno; }

    public boolean isMult()
    { return mult; }
    
    public void jogar()
    {
        System.out.println("A");
    }
}
