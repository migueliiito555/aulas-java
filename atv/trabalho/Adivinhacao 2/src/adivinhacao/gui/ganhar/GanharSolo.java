package adivinhacao.gui.ganhar;

public class GanharSolo extends javax.swing.JFrame {
    public GanharSolo() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_jogo = new javax.swing.JPanel();
        pnl_placar = new javax.swing.JPanel();
        lbl_txtVidas = new javax.swing.JLabel();
        lbl_txtPulos = new javax.swing.JLabel();
        lbl_txtPontos = new javax.swing.JLabel();
        lbl_qntPontos = new javax.swing.JLabel();
        lbl_qntVidas = new javax.swing.JLabel();
        lbl_qntPulos = new javax.swing.JLabel();
        lbl_txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Adivinhação");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnl_jogo.setBackground(new java.awt.Color(0, 51, 0));
        pnl_jogo.setForeground(new java.awt.Color(0, 0, 0));

        pnl_placar.setOpaque(false);

        lbl_txtVidas.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_txtVidas.setForeground(new java.awt.Color(204, 255, 204));
        lbl_txtVidas.setText("Vidas:");

        lbl_txtPulos.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_txtPulos.setForeground(new java.awt.Color(153, 255, 204));
        lbl_txtPulos.setText("Pulos:");

        lbl_txtPontos.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_txtPontos.setForeground(new java.awt.Color(255, 204, 204));
        lbl_txtPontos.setText("Pontos:");

        lbl_qntPontos.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_qntPontos.setForeground(new java.awt.Color(255, 102, 102));
        lbl_qntPontos.setText("0");

        lbl_qntVidas.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_qntVidas.setForeground(new java.awt.Color(51, 255, 51));
        lbl_qntVidas.setText("0");

        lbl_qntPulos.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        lbl_qntPulos.setForeground(new java.awt.Color(0, 204, 204));
        lbl_qntPulos.setText("0");

        javax.swing.GroupLayout pnl_placarLayout = new javax.swing.GroupLayout(pnl_placar);
        pnl_placar.setLayout(pnl_placarLayout);
        pnl_placarLayout.setHorizontalGroup(
            pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_txtPontos)
                    .addComponent(lbl_txtVidas)
                    .addComponent(lbl_txtPulos))
                .addGap(26, 26, 26)
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_qntPulos)
                    .addComponent(lbl_qntVidas)
                    .addComponent(lbl_qntPontos)))
        );
        pnl_placarLayout.setVerticalGroup(
            pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_placarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtPontos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lbl_qntPontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtVidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_qntVidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_placarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_txtPulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_qntPulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbl_txtTitulo.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        lbl_txtTitulo.setForeground(new java.awt.Color(204, 255, 102));
        lbl_txtTitulo.setText("VOCÊ VENCEU :D");

        javax.swing.GroupLayout pnl_jogoLayout = new javax.swing.GroupLayout(pnl_jogo);
        pnl_jogo.setLayout(pnl_jogoLayout);
        pnl_jogoLayout.setHorizontalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(lbl_txtTitulo)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_placar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_jogoLayout.setVerticalGroup(
            pnl_jogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_jogoLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(lbl_txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(pnl_placar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lbl_qntPontos;
    public javax.swing.JLabel lbl_qntPulos;
    public javax.swing.JLabel lbl_qntVidas;
    private javax.swing.JLabel lbl_txtPontos;
    private javax.swing.JLabel lbl_txtPulos;
    private javax.swing.JLabel lbl_txtTitulo;
    private javax.swing.JLabel lbl_txtVidas;
    public javax.swing.JPanel pnl_jogo;
    private javax.swing.JPanel pnl_placar;
    // End of variables declaration//GEN-END:variables
}