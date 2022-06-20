package main.gui;

import java.awt.Dimension;

public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_tela_inicial = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        cb_tema = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_mult = new javax.swing.JButton();
        btn_play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        pnl_tela_inicial.setBackground(new java.awt.Color(51, 51, 51));
        pnl_tela_inicial.setForeground(new java.awt.Color(0, 0, 0));

        pnl_titulo.setOpaque(false);

        lbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Tw Cen MT", 1, 80)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 51));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Adivinhando");
        lbl_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setRequestFocusEnabled(false);
        lbl_titulo.setVerifyInputWhenFocusTarget(false);

        cb_tema.setBackground(new java.awt.Color(204, 204, 204));
        cb_tema.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        cb_tema.setForeground(new java.awt.Color(51, 51, 51));
        cb_tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biologia", "Geografia", "História", "Inglês", "Matemática", "Português", "Química" }));
        cb_tema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        cb_tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addComponent(cb_tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addComponent(lbl_titulo)
                .addGap(0, 0, 0)
                .addComponent(cb_tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setOpaque(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(btn_mult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_play)
                    .addComponent(btn_mult))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_tela_inicialLayout = new javax.swing.GroupLayout(pnl_tela_inicial);
        pnl_tela_inicial.setLayout(pnl_tela_inicialLayout);
        pnl_tela_inicialLayout.setHorizontalGroup(
            pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tela_inicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tela_inicialLayout.setVerticalGroup(
            pnl_tela_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tela_inicialLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_mult;
    public javax.swing.JButton btn_play;
    public javax.swing.JComboBox<String> cb_tema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_titulo;
    public javax.swing.JPanel pnl_tela_inicial;
    private javax.swing.JPanel pnl_titulo;
    // End of variables declaration//GEN-END:variables
}