package janelas;

import java.util.Vector;
import javax.swing.*;

public class Cadastrar extends javax.swing.JFrame {

    private Vector vetf;

    public Vector getVetf() {
        return vetf;
    }

    public void setVetf(Vector vetf) {
        this.vetf = vetf;
    }

    public Cadastrar() {
        initComponents();
    }

    public void cadastrar() {
        String nome = "", cargo = "";
        double salario = 0;
        nome = txtnome.getText();
        cargo = txtcargo.getText();
        
        try {
        salario = Double.parseDouble(txtsalario.getText()); 
        } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "ENTRE COM VALORES NUMÉRICOS NO CAMPO SALÁRIO", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        salario = Double.parseDouble(txtsalario.getText());
        }
        
        Funcionario f = new Funcionario(nome, cargo, salario);
        vetf.addElement(f);

        JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO", "SUCESSO", JOptionPane.WARNING_MESSAGE);
        limpar();
    }

    public void limpar() {
        txtnome.setText("");
        txtcargo.setText("");
        txtsalario.setText("");
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


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        cad = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        limpar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("NOME");

        jLabel2.setText("CARGO");

        jLabel3.setText("SALÁRIO");

        jLabel4.setText("CADASTRAR FUNCIONÁRIO");

        cad.setText("CADASTRAR");
        cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadActionPerformed(evt);
            }
        });
        cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadKeyPressed(evt);
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

        limpar2.setText("LIMPAR");
        limpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar2ActionPerformed(evt);
            }
        });
        limpar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                limpar2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(cad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                            .addComponent(cancelar)
                            .addGap(48, 48, 48)
                            .addComponent(limpar2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtsalario, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnome)
                                .addComponent(txtcargo)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cad)
                    .addComponent(cancelar)
                    .addComponent(limpar2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadActionPerformed
        cadastrar();
    }//GEN-LAST:event_cadActionPerformed

    private void limpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar2ActionPerformed
        limpar();
    }//GEN-LAST:event_limpar2ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        voltar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cadastrar();
        }
    }//GEN-LAST:event_cadKeyPressed

    private void cancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            voltar();
        }
    }//GEN-LAST:event_cancelarKeyPressed

    private void limpar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limpar2KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            limpar();
        }
    }//GEN-LAST:event_limpar2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cad;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar2;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables

}
