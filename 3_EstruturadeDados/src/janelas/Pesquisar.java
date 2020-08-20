/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Pesquisar extends javax.swing.JFrame {

    private Vector vetf;

    public Vector getVetf() {
        return vetf;
    }

    public void setVetf(Vector vetf) {
        this.vetf = vetf;
    }

    public Pesquisar() {
        initComponents();
    }

    public void pesquisar() {
        Funcionario f = new Funcionario();
        String saida = "";
        String nome = "";
        nome = txtnome.getText();
        int tot = 0;

        for (int i = 0; i < vetf.size(); i++) {
            f = (Funcionario) vetf.elementAt(i);
            if (nome.equals(f.getNome())) {
                saida += "---------------\n";
                saida += "Registro: " + (i + 1) + "\n";
                saida += "Nome:" + f.getNome() + "\n";
                saida += "Cargo:" + f.getCargo() + "\n";
                saida += "Salario:" + f.getSalario() + "\n";
                tot = i + 1;
            }
        }

        if (tot == 0) {
            JOptionPane.showMessageDialog(null, "FUNCIONÁRIO NÃO ENCONTRADO", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
        jtsaida.setText(saida);
    }

    public void voltar() {
        Principal p = new Principal();
        p.setVetf(vetf);
        p.atualizaContador();
        p.show();
        this.hide();
        this.dispose();
        p.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        bntpesq = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtsaida = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOME");

        bntpesq.setText("PESQUISAR");
        bntpesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntpesqActionPerformed(evt);
            }
        });
        bntpesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntpesqKeyPressed(evt);
            }
        });

        cancelar.setText("VOLTAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        cancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarKeyPressed(evt);
            }
        });

        jLabel2.setText("PESQUISAR FUNCIONÁRIO");

        jtsaida.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntpesq)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntpesq)
                    .addComponent(cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        voltar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void bntpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntpesqActionPerformed
        pesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_bntpesqActionPerformed

    private void bntpesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntpesqKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_bntpesqKeyPressed

    private void cancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            voltar();
        }
    }//GEN-LAST:event_cancelarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntpesq;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea jtsaida;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
