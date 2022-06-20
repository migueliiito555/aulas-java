package main.gui;

import java.awt.Dimension;

public class NomeJogadores extends javax.swing.JFrame {
    public NomeJogadores() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_nomes = new javax.swing.JPanel();
        btn_confirmar = new javax.swing.JButton();
        txf_nome_j1 = new javax.swing.JTextField();
        lbl_pergunta = new javax.swing.JLabel();
        txf_nome_j2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhando");
        setMinimumSize(new java.awt.Dimension(800, 600));

        pnl_nomes.setBackground(new java.awt.Color(51, 51, 51));
        pnl_nomes.setForeground(new java.awt.Color(0, 0, 0));

        btn_confirmar.setBackground(new java.awt.Color(0, 0, 51));
        btn_confirmar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btn_confirmar.setForeground(new java.awt.Color(153, 153, 255));
        btn_confirmar.setText("CONFIRMAR");
        btn_confirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btn_confirmar.setDefaultCapable(false);
        btn_confirmar.setFocusPainted(false);
        btn_confirmar.setFocusable(false);
        btn_confirmar.setRequestFocusEnabled(false);
        btn_confirmar.setVerifyInputWhenFocusTarget(false);

        txf_nome_j1.setBackground(new java.awt.Color(51, 51, 51));
        txf_nome_j1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txf_nome_j1.setForeground(new java.awt.Color(255, 153, 153));
        txf_nome_j1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_nome_j1.setText("JOGADOR 1");
        txf_nome_j1.setAutoscrolls(false);
        txf_nome_j1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        txf_nome_j1.setCaretColor(new java.awt.Color(255, 102, 102));
        txf_nome_j1.setSelectedTextColor(new java.awt.Color(255, 102, 102));
        txf_nome_j1.setSelectionColor(new java.awt.Color(102, 0, 0));
        txf_nome_j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_nome_j1KeyReleased(evt);
            }
        });

        lbl_pergunta.setBackground(new java.awt.Color(255, 255, 102));
        lbl_pergunta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_pergunta.setForeground(new java.awt.Color(255, 255, 51));
        lbl_pergunta.setText("Quais os nomes dos jogadores?");

        txf_nome_j2.setBackground(new java.awt.Color(51, 51, 51));
        txf_nome_j2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txf_nome_j2.setForeground(new java.awt.Color(153, 255, 153));
        txf_nome_j2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_nome_j2.setText("JOGADOR 2");
        txf_nome_j2.setAutoscrolls(false);
        txf_nome_j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)));
        txf_nome_j2.setCaretColor(new java.awt.Color(102, 255, 102));
        txf_nome_j2.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        txf_nome_j2.setSelectionColor(new java.awt.Color(0, 102, 0));
        txf_nome_j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_nome_j2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_nomesLayout = new javax.swing.GroupLayout(pnl_nomes);
        pnl_nomes.setLayout(pnl_nomesLayout);
        pnl_nomesLayout.setHorizontalGroup(
            pnl_nomesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nomesLayout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(lbl_pergunta)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nomesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_nomesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nomesLayout.createSequentialGroup()
                        .addComponent(txf_nome_j1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(txf_nome_j2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nomesLayout.createSequentialGroup()
                        .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_nomesLayout.setVerticalGroup(
            pnl_nomesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nomesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lbl_pergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(pnl_nomesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nome_j1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_nome_j2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_nomes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_nomes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nome_j1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_nome_j1KeyReleased
        txf_nome_j1.setText(txf_nome_j1.getText().toUpperCase());
        
        char[] txf = txf_nome_j1.getText().toCharArray();
        
        if (txf.length > 10)
        {
            txf_nome_j1.setText("");
            
            for (int i = 0; i < 10; i++)
            {
                txf_nome_j1.setText(txf_nome_j1.getText() + txf[i]);
            }
        }
    }//GEN-LAST:event_txf_nome_j1KeyReleased

    private void txf_nome_j2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_nome_j2KeyReleased
        txf_nome_j2.setText(txf_nome_j2.getText().toUpperCase());
        
        char[] txf = txf_nome_j2.getText().toCharArray();
        
        if (txf.length > 10)
        {
            txf_nome_j2.setText("");
            
            for (int i = 0; i < 10; i++)
            {
                txf_nome_j2.setText(txf_nome_j2.getText() + txf[i]);
            }
        }
    }//GEN-LAST:event_txf_nome_j2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_confirmar;
    private javax.swing.JLabel lbl_pergunta;
    public javax.swing.JPanel pnl_nomes;
    public javax.swing.JTextField txf_nome_j1;
    public javax.swing.JTextField txf_nome_j2;
    // End of variables declaration//GEN-END:variables
}