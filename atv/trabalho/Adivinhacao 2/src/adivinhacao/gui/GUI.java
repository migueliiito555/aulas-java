package adivinhacao.gui;

public class GUI extends javax.swing.JFrame {
    public GUI() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_tela_inicial = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        btn_mult = new javax.swing.JButton();
        btn_play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Adivinhação");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnl_tela_inicial.setBackground(new java.awt.Color(51, 51, 51));
        pnl_tela_inicial.setForeground(new java.awt.Color(0, 0, 0));

        lbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 51));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Jogo da Adivinhação");
        lbl_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setRequestFocusEnabled(false);
        lbl_titulo.setVerifyInputWhenFocusTarget(false);

        btn_mult.setForeground(new java.awt.Color(204, 255, 255));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mult/mult_stand.png"))); // NOI18N
        btn_mult.setBorder(null);
        btn_mult.setBorderPainted(false);
        btn_mult.setContentAreaFilled(false);
        btn_mult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mult.setFocusPainted(false);
        btn_mult.setFocusable(false);
        btn_mult.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mult/mult_click.png"))); // NOI18N
        btn_mult.setRequestFocusEnabled(false);
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mult/mult_hover.png"))); // NOI18N
        btn_mult.setVerifyInputWhenFocusTarget(false);

        btn_play.setForeground(new java.awt.Color(204, 255, 255));
        btn_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play/play_stand.png"))); // NOI18N
        btn_play.setBorder(null);
        btn_play.setBorderPainted(false);
        btn_play.setContentAreaFilled(false);
        btn_play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_play.setFocusPainted(false);
        btn_play.setFocusable(false);
        btn_play.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_play.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play/play_click.png"))); // NOI18N
        btn_play.setRequestFocusEnabled(false);
        btn_play.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play/play_hover.png"))); // NOI18N
        btn_play.setVerifyInputWhenFocusTarget(false);
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_tela_inicialLayout = new javax.swing.GroupLayout(pnl_tela_inicial);
        pnl_tela_inicial.setLayout(pnl_tela_inicialLayout);
        pnl_tela_inicialLayout.setHorizontalGroup(
            pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tela_inicialLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_tela_inicialLayout.createSequentialGroup()
                        .addComponent(btn_play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mult))
                    .addComponent(lbl_titulo))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        pnl_tela_inicialLayout.setVerticalGroup(
            pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tela_inicialLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addGroup(pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mult)
                    .addComponent(btn_play))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_tela_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_tela_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_playActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_mult;
    public javax.swing.JButton btn_play;
    private javax.swing.JLabel lbl_titulo;
    public javax.swing.JPanel pnl_tela_inicial;
    // End of variables declaration//GEN-END:variables
}