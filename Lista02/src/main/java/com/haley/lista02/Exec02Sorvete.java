/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haley.lista02;

/**
 *
 * @author haley
 */
public class Exec02Sorvete extends javax.swing.JFrame {

    /**
     * Creates new form Exec02Sorvete
     */
    public Exec02Sorvete() {
        initComponents();
        lblResultado.setVisible(false);
        lblResultado.setText("casquinha custa R$2,00 \n\n sundae custa R$5,00 \n\n milkshake custa R$7,00");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblEscolha = new javax.swing.JLabel();
        rdBtnCasquinha = new javax.swing.JRadioButton();
        rdBtnSundae = new javax.swing.JRadioButton();
        rdBtnMilkshake = new javax.swing.JRadioButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Sorveteria");
        lblTitulo.setMaximumSize(new java.awt.Dimension(52, 25));
        lblTitulo.setMinimumSize(new java.awt.Dimension(52, 25));
        lblTitulo.setPreferredSize(new java.awt.Dimension(52, 25));

        lblEscolha.setText("Escolha um:");

        rdBtnCasquinha.setText("casquinha");
        rdBtnCasquinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnCasquinhaActionPerformed(evt);
            }
        });

        rdBtnSundae.setText("sundae");
        rdBtnSundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnSundaeActionPerformed(evt);
            }
        });

        rdBtnMilkshake.setText("milkshake");
        rdBtnMilkshake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnMilkshakeActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEscolha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdBtnCasquinha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdBtnSundae))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rdBtnMilkshake))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnCasquinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnSundae)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdBtnMilkshake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void rdBtnCasquinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnCasquinhaActionPerformed
        // TODO add your handling code here:
        lblResultado.setVisible(true);
        
    }//GEN-LAST:event_rdBtnCasquinhaActionPerformed

    private void rdBtnSundaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnSundaeActionPerformed
        // TODO add your handling code here:
        lblResultado.setVisible(true);
    }//GEN-LAST:event_rdBtnSundaeActionPerformed

    private void rdBtnMilkshakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnMilkshakeActionPerformed
        // TODO add your handling code here:
        lblResultado.setVisible(true);
    }//GEN-LAST:event_rdBtnMilkshakeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exec02Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exec02Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exec02Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exec02Sorvete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exec02Sorvete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEscolha;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdBtnCasquinha;
    private javax.swing.JRadioButton rdBtnMilkshake;
    private javax.swing.JRadioButton rdBtnSundae;
    // End of variables declaration//GEN-END:variables
}
