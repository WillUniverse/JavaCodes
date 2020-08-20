package janelas;

import javax.swing.*;
import java.util.*;

public class Principal extends javax.swing.JFrame {

    private Vector vetf;

    public Principal() {
        initComponents();
        vetf = new Vector();
    }

    public Vector getVetf() {
        return vetf;
    }

    public void setVetf(Vector vetf) {
        this.vetf = vetf;
    }

    public void cadastrar() {
        Cadastrar c = new Cadastrar();
        c.setVetf(vetf);
        c.show();
        this.hide();
        this.dispose();
        c.setVisible(true);
    }

    public void listar() {
        Relatorio r = new Relatorio();
        r.setVetf(vetf);
        r.show();
        this.hide();
        this.dispose();
        r.setVisible(true);
    }

    public void pesquisar() {
        Pesquisar pe = new Pesquisar();
        pe.setVetf(vetf);
        pe.show();
        this.hide();
        this.dispose();
        pe.setVisible(true);
    }

    public void excluir() {
        Excluir e = new Excluir();
        e.setVetf(vetf);
        e.show();
        this.hide();
        this.dispose();
        e.setVisible(true);
    }

    public void atualizaContador() {
        txttotal.setText("Total: " + vetf.size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        cadastrar.setText("CADASTRAR FUNCIONÁRIO");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        cadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarKeyPressed(evt);
            }
        });

        listar.setText("LISTAR TODOS");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        listar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listarKeyPressed(evt);
            }
        });

        pesquisar.setText("PESQUISAR POR NOME");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisarKeyPressed(evt);
            }
        });

        remover.setText("REMOVER FUNCIONÁRIO");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });
        remover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                removerKeyPressed(evt);
            }
        });

        jLabel1.setText("MENU DE OPERAÇÕES");

        txttotal.setText("Total: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrar)
                            .addComponent(pesquisar))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listar)
                            .addComponent(remover)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(listar))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txttotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        listar();
    }//GEN-LAST:event_listarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_pesquisarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        excluir();
    }//GEN-LAST:event_removerActionPerformed

    private void cadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cadastrar();
        }
    }//GEN-LAST:event_cadastrarKeyPressed

    private void listarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            listar();
        }
    }//GEN-LAST:event_listarKeyPressed

    private void pesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            pesquisar();
        }
    }//GEN-LAST:event_pesquisarKeyPressed

    private void removerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removerKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            excluir();
        }
    }//GEN-LAST:event_removerKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton remover;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
