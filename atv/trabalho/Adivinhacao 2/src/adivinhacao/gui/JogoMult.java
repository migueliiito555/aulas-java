package adivinhacao.gui;

public class JogoMult extends javax.swing.JFrame {
    public JogoMult() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_jogo = new javax.swing.JPanel();
        pnl_resposta = new javax.swing.JPanel();
        txf_resposta = new javax.swing.JTextField();
        btn_resposta = new javax.swing.JButton();
        btn_revelar = new javax.swing.JButton();
        lbl_txtRevelar = new javax.swing.JLabel();
        lbl_txtTurno = new javax.swing.JLabel();
        txa_pergunta = new javax.swing.JTextArea();
        pnl_placar_j1 = new javax.swing.JPanel();
        lbl_txtPontosJ1 = new javax.swing.JLabel();
        lbl_txtVidasJ1 = new javax.swing.JLabel();
        lbl_qntPontosJ1 = new javax.swing.JLabel();
        lbl_qntVidasJ1 = new javax.swing.JLabel();
        lbl_txtNomeJ1 = new javax.swing.JLabel();
        pnl_placar_j2 = new javax.swing.JPanel();
        lbl_txtPontosJ2 = new javax.swing.JLabel();
        lbl_txtVidasJ2 = new javax.swing.JLabel();
        lbl_qntPontosJ2 = new javax.swing.JLabel();
        lbl_qntVidasJ2 = new javax.swing.JLabel();
        lbl_txtNomeJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnl_jogo.setBackground(new java.awt.Color(51, 51, 51));
        pnl_jogo.setForeground(new java.awt.Color(0, 0, 0));

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

        lbl_txtRevelar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtRevelar.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtRevelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_txtRevelar.setText("a");
        lbl_txtRevelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbl_txtTurno.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtTurno.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_txtTurno.setText("VEZ DE ADSDASDSDF");
        lbl_txtTurno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnl_respostaLayout = new javax.swing.GroupLayout(pnl_resposta);
        pnl_resposta.setLayout(pnl_respostaLayout);
        pnl_respostaLayout.setHorizontalGroup(
            pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_respostaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_revelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_respostaLayout.createSequentialGroup()
                        .addComponent(txf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbl_txtRevelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_txtTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_respostaLayout.setVerticalGroup(
            pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_respostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_txtRevelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_revelar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(pnl_respostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_txtTurno)
                .addContainerGap())
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

        pnl_placar_j1.setOpaque(false);

        lbl_txtPontosJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPontosJ1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtPontosJ1.setText("Pontos:");

        lbl_txtVidasJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtVidasJ1.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtVidasJ1.setText("Vidas:");

        lbl_qntPontosJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPontosJ1.setForeground(new java.awt.Color(153, 0, 0));
        lbl_qntPontosJ1.setText("0");

        lbl_qntVidasJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntVidasJ1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_qntVidasJ1.setText("0");

        lbl_txtNomeJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtNomeJ1.setForeground(new java.awt.Color(255, 102, 102));
        lbl_txtNomeJ1.setText("ABCDEFGHIJ");

        javax.swing.GroupLayout pnl_placar_j1Layout = new javax.swing.GroupLayout(pnl_placar_j1);
        pnl_placar_j1.setLayout(pnl_placar_j1Layout);
        pnl_placar_j1Layout.setHorizontalGroup(
            pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                        .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                                .addComponent(lbl_txtVidasJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_qntVidasJ1))
                            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                                .addComponent(lbl_txtPontosJ1)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_qntPontosJ1)))
                        .addContainerGap())
                    .addComponent(lbl_txtNomeJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
        );
        pnl_placar_j1Layout.setVerticalGroup(
            pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                .addComponent(lbl_txtNomeJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtPontosJ1)
                    .addComponent(lbl_qntPontosJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtVidasJ1)
                    .addComponent(lbl_qntVidasJ1))
                .addGap(33, 33, 33))
        );

        pnl_placar_j2.setOpaque(false);

        lbl_txtPontosJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPontosJ2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtPontosJ2.setText("Pontos:");

        lbl_txtVidasJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtVidasJ2.setForeground(new java.awt.Color(204, 204, 204));
        lbl_txtVidasJ2.setText("Vidas:");

        lbl_qntPontosJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPontosJ2.setForeground(new java.awt.Color(0, 153, 0));
        lbl_qntPontosJ2.setText("0");

        lbl_qntVidasJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntVidasJ2.setForeground(new java.awt.Color(0, 255, 0));
        lbl_qntVidasJ2.setText("0");

        lbl_txtNomeJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtNomeJ2.setForeground(new java.awt.Color(153, 255, 153));
        lbl_txtNomeJ2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_txtNomeJ2.setText("ABCDEFGHIJ");

        javax.swing.GroupLayout pnl_placar_j2Layout = new javax.swing.GroupLayout(pnl_placar_j2);
        pnl_placar_j2.setLayout(pnl_placar_j2Layout);
        pnl_placar_j2Layout.setHorizontalGroup(
            pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_placar_j2Layout.createSequentialGroup()
                        .addComponent(lbl_txtVidasJ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_qntVidasJ2))
                    .addGroup(pnl_placar_j2Layout.createSequentialGroup()
                        .addComponent(lbl_txtPontosJ2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_qntPontosJ2))))
            .addComponent(lbl_txtNomeJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        pnl_placar_j2Layout.setVerticalGroup(
            pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j2Layout.createSequentialGroup()
                .addComponent(lbl_txtNomeJ2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtPontosJ2)
                    .addComponent(lbl_qntPontosJ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtVidasJ2)
                    .addComponent(lbl_qntVidasJ2))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout pnl_jogoLayout = new javax.swing.GroupLayout(pnl_jogo);
        pnl_jogo.setLayout(pnl_jogoLayout);
        pnl_jogoLayout.setHorizontalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_jogoLayout.createSequentialGroup()
                        .addComponent(pnl_placar_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_placar_j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txa_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnl_jogoLayout.setVerticalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txa_pergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_placar_j2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnl_placar_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
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
    public javax.swing.JButton btn_resposta;
    public javax.swing.JButton btn_revelar;
    public javax.swing.JLabel lbl_qntPontosJ1;
    public javax.swing.JLabel lbl_qntPontosJ2;
    public javax.swing.JLabel lbl_qntVidasJ1;
    public javax.swing.JLabel lbl_qntVidasJ2;
    public javax.swing.JLabel lbl_txtNomeJ1;
    public javax.swing.JLabel lbl_txtNomeJ2;
    private javax.swing.JLabel lbl_txtPontosJ1;
    private javax.swing.JLabel lbl_txtPontosJ2;
    public javax.swing.JLabel lbl_txtRevelar;
    public javax.swing.JLabel lbl_txtTurno;
    private javax.swing.JLabel lbl_txtVidasJ1;
    private javax.swing.JLabel lbl_txtVidasJ2;
    public javax.swing.JPanel pnl_jogo;
    private javax.swing.JPanel pnl_placar_j1;
    private javax.swing.JPanel pnl_placar_j2;
    private javax.swing.JPanel pnl_resposta;
    public javax.swing.JTextArea txa_pergunta;
    public javax.swing.JTextField txf_resposta;
    // End of variables declaration//GEN-END:variables
}