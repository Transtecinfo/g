/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author 181720019
 */
public class TelaUsuario1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuario1
     */
    public TelaUsuario1() {
        initComponents();
    }

                ImageIcon icon = new ImageIcon("C:\\Users\\181720019\\Downloads/logotrans.png");
    JLabel label = new JLabel(icon);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPainel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnCont_P = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPainel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logotrans.PNG"))); // NOI18N

        btnCont_P.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCont_P.setText("Controle de produtos");
        btnCont_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCont_PActionPerformed(evt);
            }
        });

        jdpPainel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPainel.setLayer(btnCont_P, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addGroup(jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpPainelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnCont_P, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(btnCont_P)
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCont_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCont_PActionPerformed
         TelaProdutos tela = new TelaProdutos();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCont_PActionPerformed

    /**
     * @param args the command line arguments
   
   * 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCont_P;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDesktopPane jdpPainel;
    // End of variables declaration//GEN-END:variables
}