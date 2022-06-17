package adivinhacao.gui.ganhar;

public class GanharMult extends javax.swing.JFrame {
    public GanharMult() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_jogo = new javax.swing.JPanel();
        lbl_txtTitulo = new javax.swing.JLabel();
        pnl_placar_j1 = new javax.swing.JPanel();
        lbl_txtVidasJ1 = new javax.swing.JLabel();
        lbl_nome_j1 = new javax.swing.JLabel();
        lbl_qntPontosJ1 = new javax.swing.JLabel();
        lbl_qntVidasJ1 = new javax.swing.JLabel();
        lbl_txtPontosJ1 = new javax.swing.JLabel();
        pnl_placar_j2 = new javax.swing.JPanel();
        lbl_txtVidasJ2 = new javax.swing.JLabel();
        lbl_nome_j2 = new javax.swing.JLabel();
        lbl_qntPontosJ2 = new javax.swing.JLabel();
        lbl_qntVidasJ2 = new javax.swing.JLabel();
        lbl_txtPontosJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnl_jogo.setBackground(new java.awt.Color(51, 0, 51));
        pnl_jogo.setForeground(new java.awt.Color(0, 0, 0));

        lbl_txtTitulo.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        lbl_txtTitulo.setForeground(new java.awt.Color(51, 255, 255));
        lbl_txtTitulo.setText("VOCÊ VENCEU :D");

        pnl_placar_j1.setOpaque(false);

        lbl_txtVidasJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtVidasJ1.setForeground(new java.awt.Color(255, 102, 102));
        lbl_txtVidasJ1.setText("Vidas:");

        lbl_nome_j1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_nome_j1.setForeground(new java.awt.Color(255, 153, 153));
        lbl_nome_j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome_j1.setText("AAAAAAAAAA");

        lbl_qntPontosJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPontosJ1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_qntPontosJ1.setText("0");

        lbl_qntVidasJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntVidasJ1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_qntVidasJ1.setText("0");

        lbl_txtPontosJ1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPontosJ1.setForeground(new java.awt.Color(255, 102, 102));
        lbl_txtPontosJ1.setText("Pontos:");

        javax.swing.GroupLayout pnl_placar_j1Layout = new javax.swing.GroupLayout(pnl_placar_j1);
        pnl_placar_j1.setLayout(pnl_placar_j1Layout);
        pnl_placar_j1Layout.setHorizontalGroup(
            pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nome_j1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_txtPontosJ1)
                    .addComponent(lbl_txtVidasJ1))
                .addGap(24, 24, 24)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntVidasJ1)
                    .addComponent(lbl_qntPontosJ1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_placar_j1Layout.setVerticalGroup(
            pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nome_j1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntPontosJ1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_txtPontosJ1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntVidasJ1)
                    .addComponent(lbl_txtVidasJ1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnl_placar_j2.setOpaque(false);

        lbl_txtVidasJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtVidasJ2.setForeground(new java.awt.Color(153, 255, 153));
        lbl_txtVidasJ2.setText("Vidas:");

        lbl_nome_j2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_nome_j2.setForeground(new java.awt.Color(204, 255, 204));
        lbl_nome_j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nome_j2.setText("AAAAAAAAAA");

        lbl_qntPontosJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntPontosJ2.setForeground(new java.awt.Color(0, 255, 0));
        lbl_qntPontosJ2.setText("0");

        lbl_qntVidasJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_qntVidasJ2.setForeground(new java.awt.Color(0, 255, 0));
        lbl_qntVidasJ2.setText("0");

        lbl_txtPontosJ2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lbl_txtPontosJ2.setForeground(new java.awt.Color(153, 255, 153));
        lbl_txtPontosJ2.setText("Pontos:");

        javax.swing.GroupLayout pnl_placar_j2Layout = new javax.swing.GroupLayout(pnl_placar_j2);
        pnl_placar_j2.setLayout(pnl_placar_j2Layout);
        pnl_placar_j2Layout.setHorizontalGroup(
            pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nome_j2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_placar_j2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_txtPontosJ2)
                    .addComponent(lbl_txtVidasJ2))
                .addGap(24, 24, 24)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntVidasJ2)
                    .addComponent(lbl_qntPontosJ2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_placar_j2Layout.setVerticalGroup(
            pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placar_j2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nome_j2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntPontosJ2)
                    .addComponent(lbl_txtPontosJ2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placar_j2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntVidasJ2)
                    .addComponent(lbl_txtVidasJ2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_jogoLayout = new javax.swing.GroupLayout(pnl_jogo);
        pnl_jogo.setLayout(pnl_jogoLayout);
        pnl_jogoLayout.setHorizontalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(pnl_placar_j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(pnl_placar_j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pnl_jogoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnl_placar_j1, pnl_placar_j2});

        pnl_jogoLayout.setVerticalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(lbl_txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_placar_j2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_placar_j1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pnl_jogoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pnl_placar_j1, pnl_placar_j2});

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lbl_nome_j1;
    public javax.swing.JLabel lbl_nome_j2;
    public javax.swing.JLabel lbl_qntPontosJ1;
    public javax.swing.JLabel lbl_qntPontosJ2;
    public javax.swing.JLabel lbl_qntVidasJ1;
    public javax.swing.JLabel lbl_qntVidasJ2;
    private javax.swing.JLabel lbl_txtPontosJ1;
    private javax.swing.JLabel lbl_txtPontosJ2;
    public javax.swing.JLabel lbl_txtTitulo;
    private javax.swing.JLabel lbl_txtVidasJ1;
    private javax.swing.JLabel lbl_txtVidasJ2;
    public javax.swing.JPanel pnl_jogo;
    private javax.swing.JPanel pnl_placar_j1;
    private javax.swing.JPanel pnl_placar_j2;
    // End of variables declaration//GEN-END:variables
}