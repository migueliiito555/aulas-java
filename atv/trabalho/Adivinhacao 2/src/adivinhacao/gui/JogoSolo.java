package adivinhacao.gui;

public class JogoSolo extends javax.swing.JFrame {
    public JogoSolo() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_jogo = new javax.swing.JPanel();
        pnl_placar = new javax.swing.JPanel();
        lbl_txtPontos = new javax.swing.JLabel();
        lbl_txtVidas = new javax.swing.JLabel();
        lbl_txtPulos = new javax.swing.JLabel();
        lbl_qntPontos = new javax.swing.JLabel();
        lbl_qntVidas = new javax.swing.JLabel();
        lbl_qntPulos = new javax.swing.JLabel();
        pnl_resposta = new javax.swing.JPanel();
        txf_resposta = new javax.swing.JTextField();
        btn_resposta = new javax.swing.JButton();
        btn_revelar = new javax.swing.JButton();
        btn_pular = new javax.swing.JButton();
        lbl_txtRevelar = new javax.swing.JLabel();
        txa_pergunta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        pnl_jogo.setBackground(new java.awt.Color(51, 51, 51));
        pnl_jogo.setForeground(new java.awt.Color(0, 0, 0));

        pnl_placar.setOpaque(false);

        lbl_txtPontos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPontos.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtPontos.setText("Pontos:");

        lbl_txtVidas.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtVidas.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtVidas.setText("Vidas:");

        lbl_txtPulos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPulos.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtPulos.setText("Pulos:");

        lbl_qntPontos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPontos.setForeground(new java.awt.Color(255, 102, 102));
        lbl_qntPontos.setText("0");

        lbl_qntVidas.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntVidas.setForeground(new java.awt.Color(0, 255, 0));
        lbl_qntVidas.setText("0");

        lbl_qntPulos.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPulos.setForeground(new java.awt.Color(51, 255, 204));
        lbl_qntPulos.setText("0");

        javax.swing.GroupLayout pnl_placarLayout = new javax.swing.GroupLayout(pnl_placar);
        pnl_placar.setLayout(pnl_placarLayout);
        pnl_placarLayout.setHorizontalGroup(
            pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_txtPontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_qntPontos)
                .addGap(18, 18, 18)
                .addComponent(lbl_txtVidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_qntVidas)
                .addGap(18, 18, 18)
                .addComponent(lbl_txtPulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_qntPulos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_placarLayout.setVerticalGroup(
            pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_txtPulos)
                        .addComponent(lbl_qntPulos))
                    .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_txtVidas)
                        .addComponent(lbl_qntVidas))
                    .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_txtPontos)
                        .addComponent(lbl_qntPontos))))
        );

        pnl_resposta.setOpaque(false);

        txf_resposta.setBackground(new java.awt.Color(51, 51, 51));
        txf_resposta.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txf_resposta.setForeground(new java.awt.Color(255, 51, 51));
        txf_resposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_resposta.setAutoscrolls(false);
        txf_resposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        txf_resposta.setCaretColor(new java.awt.Color(255, 255, 51));
        txf_resposta.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        txf_resposta.setSelectionColor(new java.awt.Color(102, 0, 0));
        txf_resposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_respostaKeyReleased(evt);
            }
        });

        btn_resposta.setBackground(new java.awt.Color(0, 51, 0));
        btn_resposta.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_resposta.setForeground(new java.awt.Color(204, 204, 204));
        btn_resposta.setText("OK");
        btn_resposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        btn_resposta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_resposta.setFocusable(false);
        btn_resposta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resposta.setRequestFocusEnabled(false);
        btn_resposta.setRolloverEnabled(false);
        btn_resposta.setVerifyInputWhenFocusTarget(false);

        btn_revelar.setBackground(new java.awt.Color(102, 0, 0));
        btn_revelar.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        btn_revelar.setForeground(new java.awt.Color(204, 204, 204));
        btn_revelar.setText("REVELAR ½");
        btn_revelar.setToolTipText("");
        btn_revelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        btn_revelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_revelar.setFocusPainted(false);
        btn_revelar.setFocusable(false);
        btn_revelar.setRequestFocusEnabled(false);
        btn_revelar.setRolloverEnabled(false);
        btn_revelar.setVerifyInputWhenFocusTarget(false);

        btn_pular.setBackground(new java.awt.Color(0, 102, 102));
        btn_pular.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        btn_pular.setForeground(new java.awt.Color(204, 204, 204));
        btn_pular.setText("PULAR");
        btn_pular.setToolTipText("");
        btn_pular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        btn_pular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pular.setDefaultCapable(false);
        btn_pular.setFocusPainted(false);
        btn_pular.setFocusable(false);
        btn_pular.setRequestFocusEnabled(false);
        btn_pular.setRolloverEnabled(false);
        btn_pular.setVerifyInputWhenFocusTarget(false);

        lbl_txtRevelar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtRevelar.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtRevelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_txtRevelar.setText("a");
        lbl_txtRevelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnl_respostaLayout = new javax.swing.GroupLayout(pnl_resposta);
        pnl_resposta.setLayout(pnl_respostaLayout);
        pnl_respostaLayout.setHorizontalGroup(
            pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_respostaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_revelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_respostaLayout.createSequentialGroup()
                        .addComponent(txf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbl_txtRevelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_respostaLayout.setVerticalGroup(
            pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_respostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_txtRevelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_revelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btn_pular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        txa_pergunta.setEditable(false);
        txa_pergunta.setBackground(new java.awt.Color(51, 51, 51));
        txa_pergunta.setColumns(20);
        txa_pergunta.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txa_pergunta.setForeground(new java.awt.Color(255, 255, 204));
        txa_pergunta.setLineWrap(true);
        txa_pergunta.setRows(5);
        txa_pergunta.setText("03. A vitamina (X) é produzida pelo próprio organismo, com o auxílio da luz solar e interage com hormônios que regulam a quantidade de cálcio no organismo. Quando uma pessoa se expõe ao sol, os raios ultravioletas são absorvidos e atuam com o colesterol, transformando-o num precursor da vitamina (X). Pode ser encontrada em alimentos como fígado, gema de ovos e óleos de peixe. Sua deficiência causa o raquitismo, tanto em crianças como em adultos. A vitamina à qual o texto se refere é a:");
        txa_pergunta.setWrapStyleWord(true);
        txa_pergunta.setAutoscrolls(false);
        txa_pergunta.setBorder(null);
        txa_pergunta.setCaretColor(new java.awt.Color(0, 0, 0));
        txa_pergunta.setFocusable(false);

        javax.swing.GroupLayout pnl_jogoLayout = new javax.swing.GroupLayout(pnl_jogo);
        pnl_jogo.setLayout(pnl_jogoLayout);
        pnl_jogoLayout.setHorizontalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(txa_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnl_placar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_jogoLayout.setVerticalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(txa_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(pnl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_placar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_respostaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_respostaKeyReleased
        txf_resposta.setText(txf_resposta.getText().toUpperCase());
    }//GEN-LAST:event_txf_respostaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_pular;
    public javax.swing.JButton btn_resposta;
    public javax.swing.JButton btn_revelar;
    public javax.swing.JLabel lbl_qntPontos;
    public javax.swing.JLabel lbl_qntPulos;
    public javax.swing.JLabel lbl_qntVidas;
    private javax.swing.JLabel lbl_txtPontos;
    private javax.swing.JLabel lbl_txtPulos;
    public javax.swing.JLabel lbl_txtRevelar;
    private javax.swing.JLabel lbl_txtVidas;
    public javax.swing.JPanel pnl_jogo;
    private javax.swing.JPanel pnl_placar;
    private javax.swing.JPanel pnl_resposta;
    public javax.swing.JTextArea txa_pergunta;
    public javax.swing.JTextField txf_resposta;
    // End of variables declaration//GEN-END:variables
}